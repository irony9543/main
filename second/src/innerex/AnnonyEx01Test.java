package innerex;

abstract class AnnonyEx01Abstract{
	public String s;//null
	public abstract void doSomething();
}

class ASub extends AnnonyEx01Abstract{
	@Override
	public void doSomething() {
		System.out.println("ASub클래스 doSomething()메소드 호출");
		
	}
}

public class AnnonyEx01Test {
	public static void main(String[] args) {
		int aa= 5;
		final int AA= 7;		
		AnnonyEx01Abstract myClass= new ASub() {
		   private int a= 15;
		   String s= "AnnonymousClass";
		   int AA= 0;
//		   static final int AA= 0;
//		   static int st= 0;
		   @Override
		  public void doSomething() {
//			aa= a+aa;
			super.doSomething();
			System.out.println("내부 익명클래스의 doSomething메소드");
			System.out.println("s: "+s);
			System.out.println("a: "+a);
			System.out.println("aa: "+aa);
			System.out.println("AA: "+AA);
			etcMethod();
		}		
		public void etcMethod() {
			System.out.println("기본메소드입니다.");
		}
	};	
	   myClass.doSomething();
//	   myClass.etcMethod();
//	   aa= aa+15;
	   System.out.println("aa: "+aa);
	   System.out.println(myClass.s);
		
	}
}

