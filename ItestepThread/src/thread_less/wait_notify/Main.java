package thread_less.wait_notify;

public class Main {

	public static void main(String[] args) {
		Data data = new Data();
		
		Thread getterThread = new Thread(new GetterThread(data));
		Thread pushThread = new Thread(new PushThread(data));
		
		getterThread.start();
		pushThread.start();
		
		try {
			if(pushThread.isAlive()) {
				pushThread.join();
			}
			if(getterThread.isAlive()) { 
				getterThread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
