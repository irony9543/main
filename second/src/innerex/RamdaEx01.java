package innerex;

interface Ramda01{
	int getMax(int num1, int num2);
//	int add(int num1, int num2);
	
}
public class RamdaEx01 {

	public static void main(String[] args) {
		//람다식을 인터페이스형 max변수에 대입
		Ramda01 max= (x,y)->(x>=y)? x:y;
	/*	Ramda01 max= new Ramda01() {
			
			@Override
			public int getMax(int x, int y) {
				return (x>=y) ? x: y;
			}
		};*/
		int r= max.getMax(10, 20);
		//인터페이스형 변수로 메소드호출
		System.out.println(r);
		
		max=(x,y) ->{return x+y;};
		r= max.getMax(10, 20);
		max=(x,y) -> x*y;
		r= max.getMax(10, 20);
		
	}

}
