
public class LoopATask implements Runnable {
public static int count=0;
public int id;

public void run() {
	
	System.out.println("##### Task Start ###"+id);
	
	  for(int i=10;i>0;i--)
		System.out.println("["+id+"]"+"TICK"+i);
	
	System.out.println("##### Task End ###"+id);
}
LoopATask(){
	id=count++;
}

}
