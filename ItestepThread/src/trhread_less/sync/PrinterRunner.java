package trhread_less.sync;

public class PrinterRunner {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Thread t1 = new Thread(new MyThread(printer, "Hello thread 1!!!"));
		Thread t2 = new Thread(new MyThread(printer, "Thread #2 Says hello!"));
		Thread t3 = new Thread(new MyThread(printer, "Hi, how are you?"));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
