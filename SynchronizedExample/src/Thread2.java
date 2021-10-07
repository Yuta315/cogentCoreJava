
public class Thread2 extends Thread {

	PrintEven t;
	public Thread2(PrintEven t) {
		this.t = t;
	}
	
	public void run() {
		t.getEven();
	}
}
