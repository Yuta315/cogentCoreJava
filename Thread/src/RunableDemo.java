
public class RunableDemo {

	public static void main(String[] args) {
		
//		RunnableImpl runnableImpl = new RunnableImpl();
		
//		Thread thread = new Thread(runnableImpl);
		
		Thread thread = new Thread(() -> {
			for(int i = 1; i <= 10; i++) {
		
				System.out.println("value of i " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
	}
}
