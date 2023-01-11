package methodex;

public class Ex03 {     	
	//메인메소드 선언
	public static void main(String[] args) {
		int result= add(3,5);//메소드 호출문 및 반환값 받기= 8
		System.out.println(result);
		
		int[] result2= {0};
		add(3,5,result2);//메소드 호출문		
		System.out.println(result2[0]);//result2[8]
		add(3,5,9);
		System.out.println(result);//result=8
	 }
	 //add메소드 선언(3,5)
     static int add(int a,int b) {
		return a+b;
	 }
     //add메소드 선언
     static void add(int a,int b,int[] result) {//a=3,b=5,result=&001
    	 result[0]=a+b;//3+5=8
     }
     static void add(int a,int b,int result) {//a=3,b=5,result=9
    	 System.out.println(result);
    	 result= 2;
     }
}
