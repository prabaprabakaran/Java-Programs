package Day6;
interface  Position{
	public void getSpeed();
}
interface Position1 {
	public void getIdea();
}
abstract class Bird implements Position,Position1{

	
}
class cock extends Bird{

	@Override
	public void getSpeed() {
		System.out.println("cock speed");
	}

	@Override
	public void getIdea() {
		System.out.println("cock idea");
		
	}
	
}
class parrot extends Bird{

	@Override
	public void getSpeed() {
		System.out.println("Parrot speed");
		
	} 

	@Override
	public void getIdea() {
        System.out.println("Parrot idea");
		
	}
	
}
abstract class fly implements Position,Position1{

	
}
class airo extends fly{

	@Override
	public void getSpeed() {
		System.out.println("airo speed");
	}

	@Override
	public void getIdea() {
		System.out.println("airo idea");
	}
	
}
class heli extends fly{

	@Override
	public void getSpeed() {
    System.out.println("heli speed");
	}

	@Override
	public void getIdea() {
	System.out.println("heli idea");
	}
	
}
public class Interfacee {
public static void main(String[] args) {
	Position po=new parrot();
	airo ai=new airo();
ai.getSpeed();
}
}

