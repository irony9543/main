package modifierex;

class Return{
	public void say_nick(String nick) {
		if("fool".equals(nick)) {
			return; //return키워드의 또다른 쓰임새, 메소드의 종료 중괄호로 빠져나감.
		}
		System.out.println("나의 별명은 "+nick+"입니다");
	}
}

public class ReturnEX {

	public static void main(String[] args) {
		Return rt= new Return();
		rt.say_nick("fool11");
		System.out.println("출력결과");
		System.out.println();

		
	}

}
