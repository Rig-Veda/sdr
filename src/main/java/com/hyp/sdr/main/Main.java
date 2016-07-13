package com.hyp.sdr.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.hyp.sdr.position.PositionModule;
import com.hyp.sdr.shell.ShellModule;

import asg.cliche.Shell;

public class Main {

	static final Logger logger = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		logger.info("Starting Application ...");

		Module[] modules = new Module[] { new PositionModule(), new ShellModule() };
		Injector injector = Guice.createInjector(modules);

		Shell shell = injector.getInstance(Shell.class);

		Runnable task = () -> {
			try {
				shell.commandLoop();
			} catch (Exception e) {
				logger.error("Error in console loop : ", e);
			}
		};

		Thread t = new Thread(task);
		t.start();

	}

}
