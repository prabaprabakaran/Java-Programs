package Day7;

public class wrapperClass {
public static void main(String[] args) {
	//convert to primitive type
	Integer in=new Integer(10);
	in++;
	System.out.println(in);
	int k=10;
	//convert to object type
	Integer val=new Integer(k);
	System.out.println(val);
}
}
