package inheritanceex.test.other;
import inheritanceex.test.Sameclass;

public class Chileclass extends Sameclass{

	public static void main(String[] args) {
		
		Chileclass sp= new Chileclass();

        System.out.println(sp.sameVar); // 다른 패키지에 속하는 자식 클래스까지 허용

	}

}
