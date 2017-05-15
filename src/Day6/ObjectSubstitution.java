package Day6;
class bike{
	
	int a=10;
	public void type(){
		System.out.println("parentclass");
		System.out.println("parentclass"+a);
	}
}
class honda extends bike{
	int a=100;
	public void type(){
		System.out.println("subclass");
		
	}
}
public class ObjectSubstitution {
public static void main(String[] args) {
	bike bik=new honda();
	//Method:->Based on object implementation..To calling override sub type method
	//Variable:->Directly Calling Super type variable.Because Type should be bike class varible.Don't Calling Object variable of Taxi.
	bik.type();
	System.out.println(bik.a);
	System.out.println(bik instanceof honda);
}
}
