package thread_less.wait_notify;

public class PushThread implements Runnable {
	private Data data;
	
	public PushThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		data.pushData();
	}

}
