
public class XYZRunnable implements Runnable {

//	class className extends Threads {
//	we have to override the run method
//  }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		if(target != null) {
//			target.run();
//		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ClassName className = new ClassName();

		Thread myThread = new Thread(new XYZRunnable());
		
		myThread.start();
	}

}
