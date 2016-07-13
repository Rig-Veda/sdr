package com.hyp.sdr.shell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import com.hyp.sdr.shell.commands.ExecuteSDRProcess;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class ShellModule extends AbstractModule {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure() {

		Shell shell = ShellFactory.createConsoleShell("SDR", "SDR-App");
		bind(Shell.class).toInstance(shell);

		bindListener(AnnotatedClassMatcher.with(ShellCommandHandler.class), new TypeListener() {

			@Override
			public <I> void hear(TypeLiteral<I> type, TypeEncounter<I> encounter) {
				encounter.register(new InjectionListener<I>() {

					@Override
					public void afterInjection(I injectee) {
						shell.addMainHandler(injectee, "");
					}
				});
			}
		});

		// list of commands
		bind(ExecuteSDRProcess.class).asEagerSingleton();
	}
}
