package generic_003_method1;

public class Util {
	
	
	public static <T> Box<T> boxing(T t){
		Box<T> box= new Box<T>();
		box.set(t);
		return box;
	}
	
	
	
	
	
	
	
	
	

}
/*     [접근제어자] [기타제어자] <제네릭타입변수>리턴타입클래스<제네릭타입면수> 메소드명(제네릭타입변수 매개변수명) {
       리턴타입 객체명= new 리턴타입클래스의 생성자():
       return 객체명;	   
}
*/