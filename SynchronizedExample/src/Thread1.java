
public class Thread1 extends Thread {

	PrintEven t;
	public Thread1(PrintEven t) {
		this.t = t;
	}
	public void run() {
		t.getEven();
	}
}
