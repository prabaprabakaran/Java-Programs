package com.java8.Ex;

public class predicateEmployee {
	int i;
	String name;
	double salary;
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
	public predicateEmployee(int i,String name,double salary){
		this.i=i;
		this.name=name;
		this.salary=salary;
	}
	@Override
		public String toString() {
			
			return i+" "+" "+name+" "+salary;
		}
}
