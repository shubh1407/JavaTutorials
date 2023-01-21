
public class MultiThreadingDemo {

	public static void main(String[] args) {
		

		DemoThread demoThread = new DemoThread();   // new state
		
		demoThread.start();  //  multithreading runnable state
		
		DemoRunnableThread demoRunnableThread = new DemoRunnableThread();
		
		Thread thread = new Thread(demoRunnableThread);  
		
		thread.start();     // multithreading runnable state
		thread.setDaemon(true);
		Runtime.getRuntime().addShutdownHook(thread);
		
		for(int i=0;i<4;i++) {
			System.out.println("main thread");
		}
	}
}
