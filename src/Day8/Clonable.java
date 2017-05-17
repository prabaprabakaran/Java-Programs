package Day8;
//Shallow Copy-> Target Object should be cloned.
//Reference Object don't cloned.
public class Clonable implements Cloneable {
bike bik;
cock ck;
public Clonable(){
	bik=new bike();
	ck=new cock();
}
public static void main(String[] args) {
	try{
	Clonable cloneOne=new Clonable();
	Clonable cloneTwo=(Clonable) cloneOne.clone();
	System.out.println(cloneOne.hashCode());
	System.out.println(cloneTwo.hashCode());
	System.out.println(cloneOne.bik.hashCode()+" "+cloneTwo.bik.hashCode());
	System.out.println(cloneTwo.ck.hashCode()+" "+cloneTwo.ck.hashCode());
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
class bike
{
	
}
class cock{
	
}