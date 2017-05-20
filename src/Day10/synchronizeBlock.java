package Day10;

public class synchronizeBlock {
	private final Object lock=new Object();
	int a=0;
	int b=0;
	public synchronized void in(){
		a++;
	}
	public void im(){
		synchronized(lock){
		b++;
		}
	}
	
public static void main(String[] args) throws InterruptedException{
	
	synchronizeBlock syn=new synchronizeBlock();
	syn.work();
}

public void work() throws InterruptedException {
	long start=System.currentTimeMillis();
	
	Thread th=new Thread(new Runnable(){
	public void run(){
		for(int i=0;i<100;i++){
			in();
			//im();
		}
		}	
});
	Thread th1=new Thread(new Runnable(){
		public void run(){
		for(int i=0;i<100;i++){
			in();
			//im();
		}
		}	
});

	th.start();
	th1.start();
	th.join();
	th1.join();
	long end=System.nanoTime();

	System.out.println("Time="+ (end - start));
	
}
}
