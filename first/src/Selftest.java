
public class Selftest {

	//연산자 확인문제 2번 
	/*
	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		int z=(++x)+(y-1);
		System.out.println(z);//z=30 

	}*/
	//연산자 확인문제 3번
	/*
	public static void main(String[] args) {
		int score= 85;
		String result=(!(score<90))?"가":"나";
	    System.out.println(result);//result=나
				}*/
	//연산자 확인문제 4번
	/*
	public static void main(String[] args) {
		int pen=534; //펜갯수:534개
		int stu=30;  //학생수:30명
		
		int penperstu= (pen/stu);//학생 한 명당 가지는 펜 수 
		System.out.println(penperstu);//17개
		
		int penextra=pen-(stu*penperstu);//남은 펜수 
		System.out.println(penextra);//24개 
	}*/
	//연산자 확인문제 5번
	/*
    public static void main(String[] args) {
    	int value= 356;
    	System.out.println((value/100)*100);//300이 나오도록 출력
    }*/
	//연산자 확인문제 6번
	/*
	public static void main(String[] args) {
		int lengthtop= 5;
		int lengthbot=10;
		int height= 7;
		double area=(10*7)-(2.5*7);//정확히 소숫자리가 나오도록 출력
		System.out.println(area);//area=52.5
	}*/
	//연산자 확인문제 7번
	/*
    public static void main(String[] args) {
    	int x= 10;
    	int y= 5;
    	System.out.println((x>7)&&(y<=5));//&&:둘다 참일 경우만 참-> 둘다 참이므로-> true
    	System.out.println((x%3==2)||(y%2!=1));//||:두조건중 하나라도 참인경우 참 
    	                                       //-->둘다 거짓이므로->false
    }*/
	//연산자 확인문제 8번
	/*
	public static void main(String[] args) {
		double x= 5.0;
		double y= 0.0;
		double z= x%y;
		
		if(z==0||z!=0) {//()안에 들어갈 코드를 구하시오.-->z==0||z!=0
			System.out.println("0.0으로 나눌수 없습니다.");
		}else {
			double result= z+10;
			System.out.println("결과: "+result);
		}		
	}*/
	//조건문,반복문 확인문제 3번
	//1부터 100까지의 정수중에서 3의배수의 총합을 구하는 코드를 작성하라!
	/*
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
			sum+=i;
		}	
	    System.out.println("1~100까지 중에서 3의 배수의 총합: "+sum);//1683
		
	}*/
	//조건문, 반복문 확인문제 4번
	//while문과 Math.random()메소드 사용
	//눈의 합이 5가 아니면 반복, 눈이 합이 5면 출력
	//(6,4),(3,6),(6,4),(3,2)
 
	public static void main(String[] args) {
		
	int x=1;	
	int y=1;	
    int sum=5;
    int num=(int)(Math.random()*6)+1; 
     
    switch(num) {
     
    case 1: 
    case 2:
    }
     while(x<=6&y<=6) {
		   sum= x+y;
		
		   
		   System.out.println("("+x+","+y+")");
			
			}						
		}	
		
		
	
	
	
	
}
