import java.util.Scanner;

public class any {
public static void main(String[] args) {
	int a=153;
	Scanner s=new Scanner(System.in);
	
	int b=0;
	int c=0;
	int temp=a;
while(a>0){ 
    b=a%10;
    a=a/10;
    c=c+(b*b*b);
}
	System.out.println(a+"  "+c);
if(temp==c){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}
