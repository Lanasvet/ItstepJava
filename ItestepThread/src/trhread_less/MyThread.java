package trhread_less;

public class MyThread implements Runnable {
	
	private Thread thread;
	private String name;
	private volatile boolean running = true;
	public int counter = 0;
	
	MyThread(String name) {
		this.name = name;
		thread = new Thread(this, this.name);
	}
	
	MyThread(String name, int prior) {
		this(name);
		thread.setPriority(prior);
	}
	
	public void start() {
		thread.start();
	}
	
	public void stop() {
		this.running = false;
	}

	@Override
	public void run() {
		while(running) {
			counter++;
		}
	}

	@Override
	public String toString() {
		return "MyThread: " + thread.getName();
	}
	
}
