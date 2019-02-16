package khsg.util;

public class BasicCounter implements Counter{

	
	int count;
	int start;

	public BasicCounter (int val) {
		
		this.count = val;
		this.start = val;
		
	}
	
	public void increment() throws Exception {
			this.count += 1;
	}
	
	
	public void reset () {
		this.count = this.start;
	}

	public String toString() {
		return "[" + this.count + "]";
	}
	
	public int get() {
		return this.count;
	}

}
