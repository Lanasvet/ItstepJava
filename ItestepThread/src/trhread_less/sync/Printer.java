package trhread_less.sync;

public class Printer {
	public void print(String msg) {
		for(char ch : msg.toCharArray()) {
			try {
				System.out.print(ch);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
