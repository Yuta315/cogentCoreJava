
public class MyThread extends Thread {
	
	public MyThread(String name) {
		
		super(name);
	}
	
	@Override
	public void run() {
		
		System.out.println("Hello from Yuta");
		
		Thread thread = Thread.currentThread();
//		currentThread method will give u the details about currently working thread.
		
		System.out.println(thread); // Thread[Thread-0,5,main]
//		But if line4 methods is provide then output will be Thread[newThread,5,main]
//		because MyThread.java has MyThread myThread = new MyThread("newThread");
		
//		super.run();
	}
}
