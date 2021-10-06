
public class ThreadDemo {

	public static void main(String[] args) {
//		MyThread myThread = new MyThread(); // without MyThread(String name) methods on MyThread.java
		MyThread myThread = new MyThread("newThread");
//		myThread.setPriority(0); // Error for IllegalArgumentException
		myThread.setPriority(10); // Thread number will become 5 to 10
		
//		myThread.setName("mythread"); // Thread[mythread,5,main]
		myThread.start();
		Thread thread = Thread.currentThread();
//		currentThread method will give u the details about currently working thread.
		
		
		System.out.println(thread); // Thread[main,5,main]
//		how many threads are there?
		
//		1. Main Thread
//		Thread[main,5,main]
//		[name of the thread, priority of thread, TG name]
//		TG : thread group by default there is thread group called main
		
//		2. myThread (User defined Thread)
//		if we will not provide any thread name then it will take default name
//		which will start with Thread-Number
		
//		amount of work /
//		OS
//		CPU
//		load on machine
	}
	
}
