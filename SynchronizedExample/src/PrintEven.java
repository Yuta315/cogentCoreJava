
public class PrintEven {

	static int i;
	public synchronized void getEven() {
		for(i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
