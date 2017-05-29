package com.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.LambdaFunction.ConsumerEmployee;
import static java.util.Comparator.comparing;
import oracle.net.aso.s;

public class StreamMain {
public StreamMain(){
	List<ConsumerEmployee>lis=new ArrayList<>();
	ConsumerEmployee ex=new ConsumerEmployee(1,"praba",2343.3);
	ConsumerEmployee ex1=new ConsumerEmployee(2,"bala",3343.3);
	ConsumerEmployee ex2=new ConsumerEmployee(3,"myname",4343.3);
	ConsumerEmployee ex3=new ConsumerEmployee(4,"kumar",5343.3);
	lis.add(ex);
	lis.add(ex1);
	lis.add(ex2);
	lis.add(ex3);

		System.out.println(lis.stream().filter((empLis)->empLis.getSalary()>3000).sorted(comparing(ConsumerEmployee::getName)).collect(Collectors.toList()));
	
	//double sum=lis.stream().filter((empFil) -> empFil.getName().equals("praba")).mapToDouble((empDo)->empDo.getSalary()).sum();
	//System.out.println(sum);
 //boolean name=lis.stream().filter((empLis)->empLis.getSalary()>3000).sorted(comparing(ConsumerEmployee::getName)).map(ConsumerEmployee::getName).collect(toList());
	//System.out.println(name);
}

public static void main(String[] args) {
	StreamMain st=new StreamMain();
	
}
}
