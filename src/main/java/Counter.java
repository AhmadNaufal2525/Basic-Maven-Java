package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = null;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int value) {
		count = value;
	}

	public void multiplyCount(int factor) {
    	count *= factor;
	}
	
}
