package com.java8.Ex;

public class SampleMain implements SampleOne{


@Override
public int add() {
	
	return 0;
}
public SampleMain(){
}	
@Override
	public int getCount() {
		//
		return SampleOne.super.getCount();
	
}
public static void main(String[] args) {
	SampleMain sm=new SampleMain();
	SampleTwo st=(SampleTwo)new SampleMain(); 
		st.getCount();
	

}}
