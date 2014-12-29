package com.techandsolve.daos;

import com.techandsolve.entities.Contact;



public  class ContactDao extends Dao<Contact, Long> {

	@Override
	protected Class<Contact> getEntityClass() {
		// TODO Auto-generated method stub
		return Contact.class;
	}

}
