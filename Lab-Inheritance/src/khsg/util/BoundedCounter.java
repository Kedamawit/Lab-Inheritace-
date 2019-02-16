package khsg.util;

public class BoundedCounter extends BasicCounter {
	
	int bound;
	
	public BoundedCounter (int val, int upper) {
		super(val);
		this.bound = upper;
	}
	
	
	public void increment() throws Exception {
		
		this.count += 1;
		
	  if(this.count > this.bound) {
			throw new Exception("Not in bounds");
		}
		
	 } 
		
	
	
	
	
	
	

}
