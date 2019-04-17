import java.util.concurrent.TimeUnit;

public class SecondWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		Thread t2 =new SecondTask();
		t2.start();
		
		//Thread t1 =
				new SecondTask().start();
		//t1.start();

		try {
		//	t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends here");
	}

}

class SecondTask extends Thread{
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
	
	public SecondTask() {
		id=count++;
		//this.start();
	}
}
