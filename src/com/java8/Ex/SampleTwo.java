package com.java8.Ex;

public interface SampleTwo {
public int add();
public default int getCount(){
	System.out.println("sampleTwo");
	return 10;
}

public static void getName(){
	System.out.println("SampleTwoStatic");
}
}

