package com.java8.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ClassToInstanceMethod {
	int salary;
	int a;
	String b;
	int c;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
/*	public ClassToInstanceMethod(){
	BiFunction<ClassToInstanceMethod,Integer,ClassToInstanceMethod>bi=ClassToInstanceMethod::add;
	
	
	}*/
	//ClassName::New--------Using triFun()
	public ClassToInstanceMethod(){
		System.out.println("empty cons");
		Supplier<ClassToInstanceMethod>sup=ClassToInstanceMethod::new;
		sup.get();
	}
	
	
	public ClassToInstanceMethod(int a,String b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public  ClassToInstanceMethod add(Integer i){
		this.setSalary(i);
		return this;
	}
	
public static void main(String[] args) {
	ClassToInstanceMethod cl=new ClassToInstanceMethod();
}
}
