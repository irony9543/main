package modifierex;



class Box{
	long idnum;
	static long boxID=0;
	
	public Box(){
		idnum=boxID++;
	}
}
public class BoxEx {

	public static void main(String[] args) {
		Box box1= new Box();
		Box box2= new Box();
		Box box3= new Box();
		Box box4= new Box();
		System.out.println("box1의 idNum: "+box1.idnum);
		System.out.println("box2의 idNum: "+box2.idnum);
		System.out.println("box3의 idNum: "+box3.idnum);
		System.out.println("box4의 idNum: "+box4.idnum);
        System.out.println("박스 총 개수: "+Box.boxID);
	}

}
