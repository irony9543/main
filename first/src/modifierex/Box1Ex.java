package modifierex;

class Box1{
	
	int width, height, depth;
	long idNum;
	static long boxID=100;
	
	//static long boxID;
	static long getcurrentID() {//클래스 메소드는 클래스변수만 사용
	//long getcurrentID(){
		return ++boxID; // boxID=boxID+1;
		//return boxID++;
	}
	
}

public class Box1Ex {

	public static void main(String[] args) {
		Box1 mybox1= new Box1(); //mybox1=> width=0, height=0, depth=0,idNum=101
		mybox1.idNum= Box1.getcurrentID();
		//클래스 명을 통해서 클래스 메소드사용
		Box1 mybox2= new Box1();   //mybox2=> width=0,height=0,depth=0,idNum=102
		mybox2.idNum= mybox2.getcurrentID();
		//객체명을 통해서 클래스 메소드사용
		System.out.println("mybox1의 id 번호: "+mybox1.idNum);//101
		System.out.println("mybox2의 id 번호: "+mybox2.idNum);//102
		System.out.println("다음 박스의 번호는: "+Box1.boxID+"번 입니다.");//102
	}

}
