package com.techandsolve.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.apache.derby.impl.sql.compile.UserTypeConstantNode;
import org.junit.Test;





import com.techandsolve.ejbs.EjbUser;
import com.techandsolve.entities.User;
import com.techandsolve.utils.*;

public class TestUser {
	

	@Test
	public void testAddUser() throws NamingException {
		Map properties = new HashMap();
		properties.put(EJBContainer.APP_NAME,"tech");
		
		EJBContainer contenedor = EJBContainer.createEJBContainer(properties);
		
		User userTest= new User();
		
		userTest.setCellNumber(Constants.cellNumber);
		userTest.setEmail(Constants.email);
		userTest.setUserName(Constants.userName);
		userTest.setPassword(Constants.password);
		
		EjbUser myEjb =  (EjbUser) contenedor.getContext().lookup("java:global/tech/EjbUser");
		myEjb.addUser(userTest);
		
	}

}
