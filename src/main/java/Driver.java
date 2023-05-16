import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		counter.setCount(10);
		System.out.println(counter.getCount());
		
		System.out.println("Initial Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Increment Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Decrement Count:" + counter.getCount());

		counter.multiplyCount(5);
        System.out.println("Count: " + counter.getCount());
		
	}

}
