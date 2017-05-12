package exercise;

import java.util.Scanner;

public class inte {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int fact=1;
	System.out.println("Enter a integer:");
	
	int b=s.nextInt();
for(int i=1;i<=b;i++){
	fact=fact*i;
}
System.out.println(fact);
int c=s.nextInt();
int a=0;
int rev=0;
while(c>0){
	a=c%10;
	rev=rev*10+a;
	c=c/10;
}
System.out.println("rev "+rev);
String digit=3456+"";
int in=digit.length();
System.out.println(in);

}
}
