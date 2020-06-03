import java.util.concurrent.Callable;

public class Runnables {
	public void methoedAcctepsRunnable(Runnable r) {
		r.run();
	}
	public void methoedACceptsCallable(Callable c) {
		
		
		try {
			System.out.println(c.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Runnables().methoedAcctepsRunnable(()->System.out.println("Hello Runnable"));
		new Runnables().methoedACceptsCallable(()->{
			return "satish";
		});
	}
}
