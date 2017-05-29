package com.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

public class StreamMethods {
	public StreamMethods(){
List<Integer>s1= Arrays.asList(1,2,3,4,5,6,9,3,15,18);
s1.stream().filter(in->in %3==0).distinct().limit(4).skip(3).forEach(System.out::println);
//IntStream in=IntStream.range(1,100).filter(omg->omg%2==0).collect(Collectors.toList());
System.out.println();

}
	

	
	public static void main(String[] args) {
		StreamMethods me=new StreamMethods();
	}
}