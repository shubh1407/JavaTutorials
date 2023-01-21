import java.awt.List;

public class DemoRunnableThread extends List implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("demo runnable thread");
		}
		
	}

}


/*
 *   thread 1
 *   thread 2            File     
 *   thread 3 
 *   
 *   
 *   
 */
