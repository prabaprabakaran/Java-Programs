package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class high {
public static void main(String[] args) {
	/*int[] a={2,1,5,4,3};
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++){
		System.out.println("smallest="+a[0]+""+"largest="+(a.length));
		*/

Scanner s=new Scanner(System.in);
System.out.println("first");
int x=s.nextInt();
int y=s.nextInt();
for(int i=2;i<y/2&&x<=y;i++){
	if(x%2!=0){
		System.out.println(x);
		x++;
	}
}
}
}
