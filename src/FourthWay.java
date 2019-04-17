import java.util.concurrent.TimeUnit;

public class FourthWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		Thread t1 = new Thread(new FourthTask());
		t1.start();
		Thread t2 = new Thread(new FourthTask());
		t2.start();
		
		
		
		System.out.println("Main thread ends here");
	}

}

class FourthTask implements Runnable{
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
	
	public FourthTask() {
		id=count++;
		//new Thread(this).start();
	}
}
