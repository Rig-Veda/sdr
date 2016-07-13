package com.hyp.sdr.shell.commands;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hyp.sdr.position.dao.PositionDAO;
import com.hyp.sdr.shell.ShellCommandHandler;

import asg.cliche.Command;

@ShellCommandHandler
public class ExecuteSDRProcess {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Inject
	PositionDAO dao;

	/**
	 * Executes the sdr reporting process
	 */
	@Command(name = "execute SDR process", abbrev = "exec")
	public void execute() {

		String param = null;

		logger.info(" Running the sdr process with parameters {} ", param);

		try {

			dao.getPositionData().stream().forEach(v -> logger.info(v.toString()));

		} catch (Exception e) {
			logger.error("Error while fetching data", e);
		}
	}
}
