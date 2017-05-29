package com.java8.MethodReference;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;

public class ClassToStaticMethod {
	public  int add(Integer a,Integer b){
	
		return  a+b;
	}
	public ClassToStaticMethod(){
	BinaryOperator<Integer> bi=(Integer emp,Integer emp1)->emp+emp1;
	Integer in=bi.apply(2,3);
	//currentObj::methodName
	BinaryOperator<Integer>bis=this::add;
	Integer ins=bis.apply(2, 3);
	//ClassName::StaticMethod
	DoubleFunction<Double>di=(num)->Math.sqrt(num);
	DoubleFunction<Double>di2=ClassToStaticMethod::name;
	Double res=di2.apply(2);
	System.out.println(res);
	}
	public static Double name(double d){
		return d-10;
	}
	//----------------
public static void main(String[] args) {
	ClassToStaticMethod cl=new ClassToStaticMethod();
}
}
