package com.techandsolve.daos;

import com.techandsolve.entities.Event;

public class EventDao extends Dao<Event, Long> {

	@Override
	protected Class<Event> getEntityClass() {
		// TODO Auto-generated method stub
		return Event.class;
	}

}
