package modifierex;

class Counter{
	static int count = 0;
	Counter(){this.count++;} 
	public static int getCount() {return count;}
	
}


public class CounterEx {	

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println(Counter.getCount());		
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());

		
	}

 
}