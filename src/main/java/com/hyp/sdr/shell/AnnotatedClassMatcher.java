package com.hyp.sdr.shell;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import com.google.inject.matcher.AbstractMatcher;

public class AnnotatedClassMatcher extends AbstractMatcher<TypeLiteral<?>> {

	public static AnnotatedClassMatcher with(Class<? extends Annotation> annotationClass) {
		return new AnnotatedClassMatcher(annotationClass);
	}

	AnnotatedClassMatcher(Class<? extends Annotation> annotations) {
		this.annotation = annotations;
	}

	Class<? extends Annotation> annotation;

	@Override
	public boolean matches(TypeLiteral<?> typeLiteral) {
		return typeLiteral.getRawType().isAnnotationPresent(annotation);
	}
}
