package com.hyp.sdr.shell;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;
import com.hyp.sdr.position.dao.DummyPositionDAO;
import com.hyp.sdr.position.dao.PositionDAO;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class ShellModule extends AbstractModule {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure() {

		Shell shell = ShellFactory.createConsoleShell("SDR", "SDR-App");
		bind(Shell.class).toInstance(shell);

		shell.addMainHandler(new ExecuteSDRProcess(), "");
		try {
			shell.commandLoop();
		} catch (IOException e) {
			logger.error("Error during shell loop", e);
		}

		bind(PositionDAO.class).to(DummyPositionDAO.class);
	}

}
