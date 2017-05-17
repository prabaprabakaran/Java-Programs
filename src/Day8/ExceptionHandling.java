package Day8;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class ExceptionHandling {
public  void add() throws ArrayIndexOutOfBoundsException,MalformedURLException,ArithmeticException{
int a[]={1,2,3};	
int b=10;
double d=b/0;
URL ul=new URL("ssss");
	throw new MalformedURLException();
}


public  void name(){
	System.out.println("hi");
}
public static void main(String[] args) {
	ExceptionHandling exe= new ExceptionHandling();;
	try {
		
		exe.add();
		
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
finally{
System.out.println("hiii");
}
	exe.name();
}
}
