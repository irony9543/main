package getsetex;


class One{
	int value;
	
	public One() {//생성자 //2번 (t1=>One)
		this(100);//다른 생성자를 호출 //3번 (t1=One=>100)
		this.value= 5;//5번    (t1=One=>100=>value=>5)
		System.out.println("디폴트생성자");//6번
	}

	public One(int value) {//4번 (t1=One=>100=>value)
		//자신의 value 변수에 매개변수로 받은 값을 저장
		this.value= value;//11번
		//클래스 메소드를 호출. 매개변수로 자신의 객체를 전달
		Another.methodA(this);//6번  (t1=One=>100=>value=>5=>this)
	    
	 }
	public void md() {//기본생성자
		//this();
	}	
}
class Another{
	
	static void methodA(One ins) {//메소드  //One ins객체 => 객체 복사 //7번 (t1=One=>100=>value=>5=>this=>ins)
		System.out.println("메소드A에서의 값: "+ins.value);//8번 (t1=One=>100=>value=>5=>this=>ins=>ins.value)
		System.out.println("ins의 주소값: "+System.identityHashCode(ins));//9번
		//identityHashCode: 주소값을 숫자로 보여주는 코드
	}
}

public class OneEx {//생성자

	
	public static void main(String[] args) {
		
	  One t1= new One(); //1번
	  System.out.println("t1의 주소값: "+System.identityHashCode(t1));//10번 (9번 ins주소값=>t1주소값)
	  System.out.println("기본 값: "+t1.value);//11번 (8번 (t1=One=>100=>value=>5=>this=>ins=>ins.value=>t1.value))
	  
	}
	

}
