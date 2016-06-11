package com.hyp.sdr.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Module;
import com.hyp.sdr.position.PositionModule;
import com.hyp.sdr.shell.ShellModule;

public class Main {

	static final Logger logger = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("Starting Application ...");

		Module[] modules = new Module[] { new PositionModule(), new ShellModule() };
		Guice.createInjector(modules);

	}

}
