package com.java8.MethodReference;

public class TriFunOPer {
	int a;
	 String b;
	 int c;
public TriFunOPer(){
	System.out.println("empty org");
}
public TriFunOPer(int a,String b,int c){
	this.a=a;
	this.b=b;
	this.c=c;
System.out.println("arg cons");
}
@Override
public String toString() {
	//System.out.println();
	return a+" "+b+" "+c;
}
}
