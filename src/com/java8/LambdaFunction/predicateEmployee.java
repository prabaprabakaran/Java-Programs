package com.java8.LambdaFunction;

public class predicateEmployee {
	int i;
	String name;
	double salary;
	int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public predicateEmployee(int i,String name,double salary,int age){
		this.i=i;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	@Override
		public String toString() {
			
			return i+" "+" "+name+" "+salary+" "+age;
		}
}
