package com.java8.Ex;

import org.omg.Messaging.SyncScopeHelper;

import Day9.thread;

public class innerClass {
	//Normal inner class
class name{
	public void any(){
		System.out.println("name class");
	}
}
//Static inner class
public static  class intro{
	
}
public innerClass(){
	//Ananymonous inner Class
Runnable rs=new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
};
Thread th=new Thread(rs);
th.start();
}
public void run(int i){
	//inner class inside a method
	//local variable should not access inner class is taken as a final variable
	class str{
		
		public str(){
					}
	}
	
	name na=new name();
}
public static void main(String[] args) {
	innerClass in=new innerClass();
	name n=in.new name();
	n.any();
	intro in1=new intro();
	
}
}
