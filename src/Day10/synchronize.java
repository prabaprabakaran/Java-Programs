package Day10;import Day9.runnable;

public class synchronize {
	int a=0;
	public void in(){
		a++;
	}
	
public static void main(String[] args) throws InterruptedException{
	synchronize syn=new synchronize();
	syn.work();
	
}

public void work() throws InterruptedException {
	Thread th=new Thread(new Runnable(){
	public void run(){
		for(int i=0;i<100000;i++){
			in();
		}
		}	
});
	th.start();
	Thread th1=new Thread(new Runnable(){
		public void run(){
		for(int i=0;i<1000000;i++){
			in();
		}
		}	
});
	th1.start();
	th.join();
	th1.join();
	System.out.println(a);
}
}