package com.java8.LambdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionOperation {
	public FunctionOperation(){
	List<FuctionEmployee>li=new ArrayList<>();
	FuctionEmployee ex=new FuctionEmployee(1,"praba",2343.3);
	FuctionEmployee ex1=new FuctionEmployee(2,"bala",3343.3);
	FuctionEmployee ex2=new FuctionEmployee(3,"prem",4343.3);
	FuctionEmployee ex3=new FuctionEmployee(4,"kumar",5343.3);
	li.add(ex);
	li.add(ex1);
	li.add(ex2);
	li.add(ex3);
	Function<FuctionEmployee,FuctionEmployee> con=(empone)->{
		empone.setName(empone.getName().toUpperCase());
		return empone;
	};
	FuctionEmployee fun=con.apply(ex);
	System.out.println(fun);
	
}
	
	public static void main(String[] args) {
	FunctionOperation fun=new FunctionOperation();	
	}
}