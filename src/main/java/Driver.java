import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		System.out.println("Initial Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Increment Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Decrement Count:" + counter.getCount());

		counter.multiplyBy(8);
		
		System.out.println("Multiply Count:" + counter.getCount());
	}

}
