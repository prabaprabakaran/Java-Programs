package com.java8.Ex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnno {
int id();
String str();
}
