package Day6;

public class MethodOverriding {
void sum(){
	System.out.println("yes");
}
public static void main(String[] args) {
	methods me=new methods();
	me.sum();
}
}
class methods extends MethodOverriding{
	void sum(){
		System.out.println("no");
	}
	


}
