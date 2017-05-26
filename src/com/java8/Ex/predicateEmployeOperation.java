package com.java8.Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class predicateEmployeOperation {
	public predicateEmployeOperation(){
	List<predicateEmployee>lis=new ArrayList<>();
	predicateEmployee ex=new predicateEmployee(1,"praba",2343.3);
	predicateEmployee ex1=new predicateEmployee(2,"bala",3343.3);
	predicateEmployee ex2=new predicateEmployee(3,"prem",4343.3);
	predicateEmployee ex3=new predicateEmployee(4,"kumar",5343.3);
	lis.add(ex);
	lis.add(ex1);
	lis.add(ex2);
	lis.add(ex3);
opertion(lis,(empdetails) -> empdetails.getName().equals("praba"));
}
	public void opertion(List<predicateEmployee>lis,Predicate<predicateEmployee>predicate){
		for(predicateEmployee emp:lis){
			if(predicate.test(emp)){
				System.out.println(emp);
			}
		}
	}
	public static void main(String[] args) {
		predicateEmployeOperation pre=new predicateEmployeOperation();
	}
}