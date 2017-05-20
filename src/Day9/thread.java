package Day9;

public class thread extends Thread{
	int id;
	public thread(int id){
		this.id=id;
		start();
	}
	public void run(){
	for (int i = 0; i<10;i++) {
		System.out.println(i);
	}	
	}
		
	
public static void main(String[] args) {
	thread th=new thread(12);
	System.out.println("hi");
}
}
