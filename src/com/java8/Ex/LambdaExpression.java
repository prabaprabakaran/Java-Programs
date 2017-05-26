package com.java8.Ex;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaExpression {
	public LambdaExpression(){
LambdaJoin lm=(a,b)-> a + 100;
int b=lm.lam(12,"praba");
System.out.println(b);
	}
	public static void main(String[] args) {
		LambdaExpression da=new LambdaExpression();
	}
}
