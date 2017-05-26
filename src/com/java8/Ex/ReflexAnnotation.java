package com.java8.Ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflexAnnotation {
	
	@MyFirstAnno(id = 0, str = "praba")
	public ReflexAnnotation(){
		
	}
	//@MyFirstAnno(id=200,str="praba")
public void name(){
	
} 
public static void main(String[] args) {
	try {
		Class cls=Class.forName("Day15.ReflexAnnotation");
		Method me[]=cls.getDeclaredMethods();
		Constructor con[]=cls.getConstructors();
		for(Constructor methods:con){
			System.out.println(methods);
			if(methods.getName().indexOf("ReflexAnnotation")!=-1){
				MyFirstAnno anno=(MyFirstAnno) methods.getAnnotation(MyFirstAnno.class);
				System.out.println(anno.id());
				System.out.println(anno.str());
			}
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
