package trhread_less.sync;

public class MyThread implements Runnable {
	
	private Printer printer;
	private String message;
	
	MyThread(Printer printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run() {
		printer.print(message);
	}

}
