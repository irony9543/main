package innerex;

interface AnnonyEx04Abstract{
	String s="상수";
	void doSomething();
	void etcMethod();
}
/*
class A implements AnnonyEx04Abstract{
	String s="하하";
    @Override
    public void doSomething() {
    	System.out.println(AnnonyEx04Abstract.s);
    	
    }
    @Override
    public void etcMethod() {
    	// TODO Auto-generated method stub
    	
    }
}*/
public class AnnonyEx04Test {

	public static void main(String[] args) {
		int aa= 5;
		final int AA= 7;
		
		AnnonyEx04Abstract myClass= new AnnonyEx04Abstract() {
			private int a= 15;
			String s= "AnnonymousClass";			
			@Override
			public void doSomething() {
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
		myClass.etcMethod();
		System.out.println("aa: "+aa);
		System.out.println(myClass.s);

	}

}
