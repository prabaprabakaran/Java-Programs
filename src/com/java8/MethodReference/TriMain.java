package com.java8.MethodReference;

public class TriMain {
public TriMain(){
TriFun tri=TriFunOPer::new;
tri.create(1,"praba", 3);
}
public static void main(String[] args) {
	TriMain tr=new TriMain();
}
}
