
public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 10; i++) {
			System.out.println("value of i " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
