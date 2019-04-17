import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		Thread t1 =new FirstTask();
		//t1.start();
		Thread t2 =new FirstTask();
		//t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends here");
	}

}

class FirstTask extends Thread{
	private static int count=0;
	private int id=0;
	public void run() {
		for(int i=10;i>0;i--)
			System.out.println("Tick :"+id+" "+i);
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public FirstTask() {
		id=count++;
		this.start();
	}
}
