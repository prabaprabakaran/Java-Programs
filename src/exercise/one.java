package exercise;

import java.util.Scanner;

public class one {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int one=s.nextInt();
	int two=s.nextInt();
	if(one>two){
		System.out.println("larger is one");
	}
	else{
		System.out.println("larger is two");
	}
	if(one==two){
		System.out.println("number is equal");
	}
}
}
