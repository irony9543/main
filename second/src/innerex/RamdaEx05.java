package innerex;
interface Ramda5{
	void showString(String str);
}
public class RamdaEx05 {

	public static void main(String[] args) {
	Ramda5 lamda5= returnString();//변수로 반환 받기
	lamda5.showString("hello");

	}
	public static Ramda5 returnString() {
//		Ramda5 r= new Ramda5() {
//			
//			
//			public void showString(String s) {
//				System.out.println(s+"java");				
//			}
//		};
		return s -> System.out.println(s+"java");
	}
 
}
 