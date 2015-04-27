package trhread_less;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread myt1 = new MyThread("Первый", 1);
		MyThread myt2 = new MyThread("Второй", 10);
		
		myt1.start();
		myt2.start();
		
		Thread.sleep(10000);
		
		myt1.stop();
		myt2.stop();
		
		System.out.println(myt1.counter);
		System.out.println(myt2.counter);
	}

}