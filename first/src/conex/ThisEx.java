package conex;

public class ThisEx {

	public static void main(String[] args) {
	  This a= new This();//1번
	  a.amd();//2번
      a.setNum(2, "테스트");//3번
      a.amd();//4번
      int x= a.getNum();//5번 num=2
      System.out.println(x);//6번 x=2
      int y= a.getNum(5);//7번  =2
      System.out.println(y);//8번 =10	 
	}
}
//------인스턴스
class This{//this([매개변수])호출문은 생성자안에만 기술가능
	int num= 1; String str="한글";//멤버변수 num,str
	
	public void setNum(int num, String str) {//num=2,str="테스트"
		this.num= num;
		this.str= str;
	}
	public int getNum() {return num;}//메소드 오버로딩
	public int getNum(int j) {this.num= num*j; return num;}//메소드 오버로딩
	
	public void amd() {//지역변수 num,str-->후에 값제거됨
		int num= 5; int str= 7;
		if(num<=5) {
			//int num=3;
			System.out.println("this.num는 "+this.num);
			//String str= "wow";
			System.out.println("this.str은 "+this.str);
		}
		System.out.println("num는 "+num);//5
		System.out.println("str은 "+str);//7
		System.out.println();
	}
	
}