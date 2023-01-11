package methodex;

public class Ex05 {
	/*
	//정수 2개를 받아서 두개의 합을 출력하고자 한다.
	static void add(int i1,int i2) {
		System.out.println("두수의 합: "+(i1+i2));
	}
	//정수 2개를 받아서 두개의 차를 출력하고자 한다.
	static void sub(int i1,int i2) {
		System.out.println("두수의 차: "+(i1-i2));
	}
	//정수 2개를 받아서 두개의 곱을 출력하고자 한다.
	static void mul(int i1,int i2) {
		System.out.println("두수의 곱: "+(i1*i2));
	}
	//정수 2개를 받아서 두개의 나누기의 몫를 출력하고자 한다.
	static void div1(int i1,int i2) {
		System.out.println("두수의 몫: "+(i1/i2));
	}
	//정수 2개를 받아서 두개의 나누기의 나머지를 출력하고자 한다.
	static void div2(int i1,int i2) {
		System.out.println("두수의 나머지: "+(i1%i2));
	}					
	public static void main(String[] args) {
		add(3, 9);
		sub(3, 9);
		mul(3, 9);
		div1(3, 9);
		div2(3, 9);
		
		
	}*/
	
	public static void main(String[] args) {
	//변수(variable):변하는수, 마지막값한개만 기억하는 공간	
	 int a= 5;
	 final int B=9;
	System.out.println(a);
	System.out.println(B);
	
	/*상수(constant): 처음 입력하면 절대값을 변경할 수없는 것
	 * final 자료형 상수이름 = 값;
	 * final 키워드(에약어): ~할수없는,금지하는 이라는 의미
	 * 명명규칙은 변수의 이름을 짓는 것과 동일하나 단, 이름을 영어 대문자로 모두 기술해주는 것이
	 * 권정사항이다.
	 * */		
	a=5;
	System.out.println(a);
	System.out.println(B);
	
    }
	
}
