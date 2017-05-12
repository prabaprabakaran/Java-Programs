package exercise;
class animal{
	public animal(){
		System.out.println("ani empty org");
	}
	public animal(int i){
		this();
		System.out.println("ani one org");
	}
	static{
		System.out.println("animal static");
	}
}
class dog extends animal{
	public dog(){
		System.out.println("dog empty org");
	}
	public dog(int i){
		
		super(i);
		System.out.println("dog one arg");
	}
	static{
		
		System.out.println("dog static");
	}
}
class cat extends dog{
	public cat(){
		System.out.println("cat empty org");
	}
	public cat(int i){
		super();
		System.out.println("cat one arg");
	}
	static{
		System.out.println("cat static");
	}
}
public class aplication {
	
public static void main(String[] args) {
	dog d=new dog(1);
	cat c=new cat(28);
	
}
static{

System.out.println("static");
}
}
