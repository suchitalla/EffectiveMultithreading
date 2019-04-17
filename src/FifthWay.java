import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		new Thread(()->{
				for(int i=10;i>0;i--)
					System.out.println("Tick :"+" "+i);
				try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}).start();
		
		
		System.out.println("Main thread ends here");
	}

}


