package br.org.catolicasc.fcgf.centraltalentos.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;

import br.org.catolicasc.fcgf.centraltalentos.model.Bean;

public abstract class AbstractDao<T extends Bean> {

	private Class<T> entityBeanClass;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		super();
		this.entityBeanClass = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0]);
	}

	public void add(T entity) {
		JpaUtil.getEntityManager().getTransaction().begin();
		JpaUtil.getEntityManager().persist(entity);
		JpaUtil.getEntityManager().getTransaction().commit();
	}

	public List<T> list() {
		return JpaUtil.getEntityManager().createQuery(getQueryAll(), entityBeanClass).getResultList();
	}

	public void remove(T entity) {
		JpaUtil.getEntityManager().getTransaction().begin();
		T reference = JpaUtil.getEntityManager().getReference(entityBeanClass, entity.getId());
		JpaUtil.getEntityManager().remove(reference);
		JpaUtil.getEntityManager().getTransaction().commit();
	}

	public void update(T entity) {
		JpaUtil.getEntityManager().getTransaction().begin();
		JpaUtil.getEntityManager().merge(entity);
		JpaUtil.getEntityManager().getTransaction().commit();
	}

	public T find(int id) {
		return JpaUtil.getEntityManager().find(entityBeanClass, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> paginatedList(int ini, int max) {
		Query query = JpaUtil.getEntityManager().createQuery(getQueryAll());
		query.setFirstResult(ini);
		query.setMaxResults(max);
		List<T> list = query.getResultList();
		return list;
	}

	protected String getQueryAll() {
		return "select t from " + entityBeanClass.getName() + " t ";
	}

}
