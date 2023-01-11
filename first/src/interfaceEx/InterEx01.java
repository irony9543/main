package interfaceEx;

class Circle implements Drawable{
	public void draw() {
		System.out.println("원을 그리다.");
	}
}
public class InterEx01 {

	public static void main(String[] args) {
		Drawable ref;
		ref= new Circle();
		ref.draw();
        //형변환(캐스팅) 후, Circle클래스의 draw메소드 호출
	}

}
