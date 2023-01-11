package getsetex;

//import: 패키지로부터 클래스까지의 경로

public class Fruits1Ex {

	public static void main(String[] args) {
		int total;//90
		conex.Fruits1 f= new conex.Fruits1();//conex의 Fruits1클래스를 끌어옴		
		Fruits1 f1= new Fruits1(30, 30, 30);
		total = f1.gettotal();//90
		//f1.count();호출불가 같은클래스에 위치하지 않아서
		//f1.apple
		System.out.println("객체 f1의 총 개수 = "+total);
		System.out.println("객체 f1의 총 apple 개수 = "+f1.getApple());
		System.out.println("객체 f1의 총 straw 개수 = "+f1.getStraw());
		System.out.println("객체 f1의 총 grapes 개수 = "+f1.getGrapes());

	} 
	
}