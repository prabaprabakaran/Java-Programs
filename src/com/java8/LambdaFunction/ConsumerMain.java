package com.java8.LambdaFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
public ConsumerMain(){
	List<ConsumerEmployee>lis=new ArrayList<>();
	ConsumerEmployee ex=new ConsumerEmployee(1,"praba",2343.3);
	ConsumerEmployee ex1=new ConsumerEmployee(2,"bala",3343.3);
	ConsumerEmployee ex2=new ConsumerEmployee(3,"prem",4343.3);
	ConsumerEmployee ex3=new ConsumerEmployee(4,"kumar",5343.3);
	lis.add(ex);
	lis.add(ex1);
	lis.add(ex2);
	lis.add(ex3);
	Consumer<ConsumerEmployee>con=(empl)->System.out.println(empl);

	Consumer<ConsumerEmployee>con2=(emp)->System.out.println(emp);
	lis.forEach(con);
	//lis.forEach(con.andThen(con2));
	Map<String,Integer>ma=new HashMap<>();
	ma.put("one",1);
	ma.put("two",2);	
	ma.put("three",3);	
	ma.put("four",5);
	//BiConsumer<String,Integer>bi=(name,value)->System.out.println(name+" "+value);
	//ma.forEach(bi);
}
public static void main(String[] args) {
	ConsumerMain cons=new ConsumerMain();
}
}
