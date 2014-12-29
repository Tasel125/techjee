package com.techandsolve.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class Dao <Entidad,Llave extends Serializable>  {

	@PersistenceContext(unitName="tech")
	private EntityManager entityManager;
	
	public void insert(Entidad entidad){
		entityManager.persist(entidad);
	}
	
	public void update(Entidad entidad){
		entityManager.merge(entidad);
	}
	
	public void delete(Entidad entidad){
		entityManager.detach(entityManager.merge(entidad));
	}
	
	protected abstract Class<Entidad> getEntityClass();
	
	public Entidad findByKey(Llave llave){
		return entityManager.find(getEntityClass(), llave);
		}
	
	public List<Entidad> getAll() {
		return entityManager.createQuery(
		"select entidad from " + getEntityClass().getSimpleName()
		+ " entidad ", getEntityClass()).getResultList();
		}
	
	public List<Entidad> select(String condicion) {
		return entityManager.createQuery(
		"select entidad from " + getEntityClass().getSimpleName()+ " entidad "
		+ ("".equals(condicion) ? "" : (condicion == null ? ""
		: " where " + condicion)), getEntityClass()).getResultList();
		}
}
