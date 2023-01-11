package conex;

public class A {

	private int i=5;
	public int getI() {return i;}
	       void setI(int i) {this.i=i;}
	
	   class B{
		   A a= new A();
		   void md() {
			   a.getI();
			   a.setI(7);
			   
		   }
	   }
	   
	public static void main(String[] args) {
		

	}

}
