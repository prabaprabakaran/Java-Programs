package com.java8.LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class predicateEmployeOperation {
	public predicateEmployeOperation(){
	List<predicateEmployee>lis=new ArrayList<>();
	predicateEmployee ex=new predicateEmployee(1,"praba",2343.3,23);
	predicateEmployee ex1=new predicateEmployee(2,"bala",3343.3,35);
	predicateEmployee ex2=new predicateEmployee(3,"prem",4343.3,70);
	predicateEmployee ex3=new predicateEmployee(4,"kumar",5343.3,90);
	lis.add(ex);
	lis.add(ex1);
	lis.add(ex2);
	lis.add(ex3);
opertion(lis,(empdetails) -> empdetails.getName().equals("prem"));
op(lis,(emps)->emps.getAge()>35);
}
	public void op(List<predicateEmployee>li,Predicate<predicateEmployee>pre){
		Consumer<predicateEmployee>con=(ems)->{
			if(pre.test(ems)){
				System.out.println(ems);
			}
		};
		li.forEach(con);
	}
	
	public void opertion(List<predicateEmployee>lis,Predicate<predicateEmployee>predicate){
		Consumer<predicateEmployee>cons=(empl)->{
			if(predicate.test(empl)){
				//System.out.println(empl);
			
		}	
		
		};
		lis.forEach(cons);
			
	}
	public static void main(String[] args) {
		predicateEmployeOperation pre=new predicateEmployeOperation();
	}
}