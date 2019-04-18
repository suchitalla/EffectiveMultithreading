import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.shutdown();
		System.out.println("Main thread end here");
	}
}
