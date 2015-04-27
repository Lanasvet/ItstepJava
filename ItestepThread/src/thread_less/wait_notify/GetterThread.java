package thread_less.wait_notify;

public class GetterThread implements Runnable {
	private Data data;
	
	public GetterThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println(data.getData());
	}

}
