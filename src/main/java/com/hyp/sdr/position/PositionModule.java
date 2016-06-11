package com.hyp.sdr.position;

import com.google.inject.AbstractModule;
import com.hyp.sdr.position.dao.DummyPositionDAO;
import com.hyp.sdr.position.dao.PositionDAO;

public class PositionModule extends AbstractModule {

	@Override
	protected void configure() {

		bind(PositionDAO.class).to(DummyPositionDAO.class);
	}

}
