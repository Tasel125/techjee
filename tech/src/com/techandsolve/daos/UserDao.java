package com.techandsolve.daos;

import com.techandsolve.entities.User;

public class UserDao extends Dao<User, Long> {

	protected Class<User> getEntityClass() {
		return User.class;
		}
}
