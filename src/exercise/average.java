package exercise;

import java.util.Scanner;

public class average {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int sum=a+b+c;
	int avg=sum/3;
	int product=a*b*c;
	System.out.println("sum="+sum);
	System.out.println("avg="+avg);
	System.out.println("product="+product);
	if(a>b && a>c){
		System.out.println("a is big");
	}
	else if(b>a && b>c){
		System.out.println("b is big");
	}
	else if(c>a && c>b){
		System.out.println("c is big");
	}
}
}
