package Day6;

public class MethodOverriding {
void sum(){
	System.out.println("yes");
}
void any(){
	System.out.println("any");
}
public static void main(String[] args) {
MethodOverriding me=new methods();
	me.sum();
	//me.xyz(); -> Compile time error //The method xyz() is undefined for the type MethodOverriding
}
}
class methods extends MethodOverriding{
	void sum(){
		System.out.println("no");
	}
	void xyz(){
		System.out.println("xyz");
	}


}
