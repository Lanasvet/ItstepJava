package thread_less.wait_notify;

public class Data {
	private volatile String data = "";
	
	public synchronized String getData() {
		try {
			System.out.println("Getter: wait");
			if(data == "")
				wait();
			System.out.println("Getter: wait complete");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return data;	
	}
	
	public synchronized void pushData() {
		System.out.println("Push: start");
		for(int i = 0; i < 100; i++)
			data += i;
		System.out.println("Push: pushed");
		notify();
		
	}
	
}
