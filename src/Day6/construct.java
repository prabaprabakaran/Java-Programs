package Day6;

public class construct {
	String name;
	int a;
	double d;
	public construct(){
		System.out.println("Hey");
	}
	public construct (String name,int a, double d){
		this.name=name;
		this.a=a;
		this.d=d;
		System.out.println("arg cons");
	}
	public construct (int a,String name,double d){
		this.name=name;
		this.a=a;
		this.d=d;
	}
public static void main(String[] args) {
	construct cons=new construct("praba",1,12);
	
	
	
}
}
