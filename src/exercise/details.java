package exercise;

 class agg {
int id;
String address;
public agg(int id,String address){
	this.id=id;
	this.address=address;
}
}

public class details{
	
	private String name;
	agg ag;
	public details(String name,agg ag){
		this.name=name;
		this.ag=ag;
	}
	public void display(){                   
		System.out.println(name);
		System.out.println(ag.id+""+ag.address);
	}
	public static void main(String[] args) {
		agg a=new agg(12,"aaa");
		details b=new details("praba",a);
		b.display();
		
		
		
	}
	}

