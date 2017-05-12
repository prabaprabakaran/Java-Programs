class book{
	private int a=10;
	
public void add(){
	System.out.println(a);
	
}

}
class rama extends book{
	 float b=1.2f;
	public void sub(){
		System.out.println(b);
	}
}
class mahab extends rama{
	private int c=23;
	public void name(){
	System.out.println(c);	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		mahab bo=new mahab();
         bo.add();
         bo.sub();
        
         
	}

}
