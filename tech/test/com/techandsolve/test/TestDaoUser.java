package com.techandsolve.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import junit.framework.Assert;

import org.junit.Test;

import com.techandsolve.daos.UserDao;
import com.techandsolve.entities.User;
import com.techandsolve.utils.Constants;

public class TestDaoUser {

	@Test
	public void test() throws NamingException {
	
		
		Map<String,String> properties = new HashMap<String,String>();
		properties.put(EJBContainer.APP_NAME, "tech");
		System.out.println(EJBContainer.APP_NAME);
		EJBContainer contenedor = EJBContainer.createEJBContainer(properties);
		UserDao userDao = (UserDao) contenedor.getContext().lookup(
		"java:global/tech/UserDao!dao.UserDao");
		User user = new User();
		user.setCellNumber(Constants.cellNumber);
		user.setEmail(Constants.email);
		user.setPassword(Constants.password);
		user.setUserName(Constants.userName);
		
		userDao.insert(user);
		Assert.assertEquals("3217519728", user.getCellNumber());
		
	}

}
