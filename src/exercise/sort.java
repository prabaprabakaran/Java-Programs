package exercise;

import java.util.Scanner;

public class sort {
	
	  public static void main(String[] args) 
	  {
	   int n, temp;
	   Scanner s = new Scanner(System.in);
	   System.out.print("Enter no. of elements you want in array:");
	   n = s.nextInt();
	   int a[] = new int[n];
	   System.out.println("Enter all the elements:");
	   for (int i=0; i<n; i++) 
	    {
	    a[i]=s.nextInt();
	    }
	    for (int i =0; i<n; i++) 
	    {
	    for (int j=i+1; j<n; j++) 
	    {
	    if (a[i]>a[j])  // compare numbers
	    {
	     temp=a[i];
	     a[i]=a[j];
	     a[j]=temp;
	    }
	   }
	  }
	  System.out.print("Elements in Ascending Order:");
	  for (int i=0; i<n; i++) 
	  {
	  System.out.print(a[i]+ ", "); // print in same line and separate with comma
	 }
	  //System.out.print(a[n-1]);
	  int a1=7;
	  String b=Integer.toBinaryString(a1);
	 
	  System.out.println(b);
	  double b1=65;
	  double bs=(b1-32)*5/9;
	  System.out.println(bs);
	 }
	}
