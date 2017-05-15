package Day6;
//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.
public class SuperClass {
static String color="blue";
public void add(){
	System.out.println("Hiiii!");
}
public static void main(String[] args) {
	supers su=new supers();
	su.print();

}
}
class supers extends SuperClass{
	static String color="red";
	public void print(){
		System.out.println(color);
		System.out.println(super.color);
		super.add();
	}
	
}
