package com.java8.Ex;
@FunctionalInterface
public interface SampleOne extends SampleTwo {
public int add();
public default int getCount(){
	System.out.println("sampleOne");
	return 10;
}
public static void getName(){
	System.out.println("SampleOneStatic");
}
}
