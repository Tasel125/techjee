package com.techandsolve.ejbs;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.techandsolve.entities.User;

/**
 * Session Bean implementation class EjbUser
 */
@Stateless
public class EjbUser implements UserEJBRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName="tech")
	private EntityManager manager;
    public EjbUser() {
        // TODO Auto-generated constructor stub
    }
    public void addUser(User user){
    	manager.persist(user);
    }
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User authenticateUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
