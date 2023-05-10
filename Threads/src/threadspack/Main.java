package threadspack;
import java.util.Random;
public class Main {

	public static int[] array3k = new int[3000];
	
	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
		
		for (int i = 0; i < array3k.length; i++) {
			array3k[i] = random.nextInt();
		}
		Thread1 f1 = new Thread1();
		Thread2 f2 = new Thread2();
		Thread a = new Thread(new Tharray());
		Thread a1 = new Thread(new Tharray1());
		Thread a2 = new Thread(new Tharray2());
		
		
		f1.start();
		f2.start();
		
		a2.start();
		
		a2.join();
		a1.start();
		a.start();
		
		
	}

}
