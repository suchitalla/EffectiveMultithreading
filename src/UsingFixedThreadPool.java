import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		final ThreadFactory threadFactory = new ThreadFactoryBuilder()
				.setNameFormat("ExecutorSuchi-%d")
				.setDaemon(true)
				.build();
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 es.submit(new LoopATask());
		 
		 es.shutdown();
		System.out.println("Main thread end here");
	}
}
