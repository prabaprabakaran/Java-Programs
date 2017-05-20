package Day11;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
public static void main(String[] args) throws InterruptedException {
	final Reent re=new Reent();
	Thread th1=new Thread(new Runnable(){
		public void run(){
			try {
				re.first();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	Thread th2=new Thread(new Runnable(){
		public void run(){
			try {
				re.second();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	th1.start();
	th2.start();
	th1.join();
	th2.join();
	re.value();
}
}
class Reent{
	private int a =0;
	private Lock lock=new ReentrantLock();
	private Condition cond=lock.newCondition();
	
	public void finished(){
		for(int i=0;i<1000;i++){
			a++;
		}
		//System.out.println(a);
	}
	public void first() throws InterruptedException{
		lock.lock();
		System.out.println("Scady:)");
		cond.await();
		Thread.sleep(200);
		System.out.println("Mathi:)");
		finished();
		lock.unlock();
	}
	public void second() throws InterruptedException{
		Thread.sleep(3000);
		lock.lock();
		System.out.println("Mathi Proposing to Scady!!  ");
		new Scanner(System.in).nextLine();
		System.out.println("I love You Scady");
		cond.signal();
	finished();
	lock.unlock();
	}
public void value(){
	System.out.println("Scady Hot Beat Count:"+a);
}
}
