package Day7;

public abstract class AbstractClass {
public abstract void name();
private int a;
private int b;
public AbstractClass(){
	System.out.println("Abstract empty Constructor");
}
public AbstractClass(int i,int j){
	this();
	this.a=i;
	this.b=j;
	
	System.out.println("Abstract Parameter constructor");
}
public static void main(String[] args) {
	subclass sub=new subclass();
	sub.name();
}
}
class subclass extends AbstractClass{

	@Override
	public void name() {
		System.out.println("Superclass implemented method");
		
	}
	public subclass(){
		super(12,10);
	}
	

}
