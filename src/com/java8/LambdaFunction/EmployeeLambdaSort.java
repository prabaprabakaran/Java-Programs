package com.java8.LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Comparator.comparing;
public class EmployeeLambdaSort {
public EmployeeLambdaSort(){
	List<ExployeeLambda>li=new ArrayList<>();
	ExployeeLambda ex=new ExployeeLambda(1,"praba",2343.3);
	ExployeeLambda ex1=new ExployeeLambda(2,"bala",3343.3);
	ExployeeLambda ex2=new ExployeeLambda(3,"prem",4343.3);
	ExployeeLambda ex3=new ExployeeLambda(4,"kumar",5343.3);
	li.add(ex);
	li.add(ex1);
	li.add(ex2);
	li.add(ex3);
	System.out.println(li);
	Collections.sort(li,(first,second)->Double.compare(second.getSalary(),first.getSalary()));
	System.out.println("---------------------------------------");
	//Collections.sort(li,comparing(ExployeeLambda::getSalary));
	System.out.println(li);
	
	
}
public static void main(String[] args) {
	EmployeeLambdaSort em=new EmployeeLambdaSort();
	
}
}
