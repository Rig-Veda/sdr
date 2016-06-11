package com.hyp.sdr.shell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.hyp.sdr.position.dao.PositionDAO;

import asg.cliche.Command;

public class ExecuteSDRProcess {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Inject
	PositionDAO dao;

	/**
	 * @return
	 */
	@Command(name = "runSDR", abbrev = "run")
	public void execute() {

		String param = null;

		logger.info(" Running the sdr process with parameters {} ", param);

		logger.info(dao.getPositionData().toString());
	}
}
