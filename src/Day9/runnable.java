package Day9;

public class runnable implements Runnable {
String name;
public runnable(String name){
	this.name=name;
	
}
	public void run() {
		System.out.println("ruunning");	
	}
public static void main(String[] args) {
	runnable tun=new runnable("praba");
	Thread th=new Thread(tun);
	th.start();
	System.out.println("heyy");
}
}
