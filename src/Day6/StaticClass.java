package Day6;

public class StaticClass {
		String str="bca";
		static int a=50;
	static void add(){
	 StaticClass se=new StaticClass();
	 System.out.println(se.str);
	 System.out.println(se.a);
	}
	public void um(){
		System.out.println(a);
	}
	/*static{
		
		str="praba";
		a=10;
		int a=200;
	}
	static{
		System.out.println("two");
		str="prem";
	a=20;
	}*/
	public void fun(){
		a++;
	}
public static void main(String[] args) {
StaticClass s=new StaticClass();
StaticClass s1=new StaticClass();
s.fun();
System.out.println(s.a);
System.out.println(s1.a);
s.str="praba";
s1.str="kumar";
s.str="am";
//System.out.println(s1.a);
}
}
