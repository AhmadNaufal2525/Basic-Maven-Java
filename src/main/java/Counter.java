package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		value++;
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
	
}
