package javalangex;

import java.util.Random;

public class RandomEx01 {
    //4byte=> 32bit 1bit(부호): 31bit
	//-2의 31승부터 ~~~~0 ~~~~2의 31승까지-1
	public static void main(String[] args) {
		Random random= new Random();
//		int num = random.nextInt();//범위를 지정해주지않으면 음수도 호출된다.
		int num = random.nextInt(11);//범위를 지정해주면 0부터시작되는것이 적용되어 양수만 나옴
		//nextInt에 값 지정이 안되면 int의 유효범위 내의 정수가 임의 출력
		System.out.println("0부터 10사이의 임의의 정수 값: "+num);
		
		float f= random.nextFloat();
		System.out.println("0.0부터 1.0사이의 임의의 실수값: "+f);
		f=(random.nextFloat()*10);
		System.out.println("0.0부터 10.0사이의 임의의 실수값: "+f);
		
		boolean b= random.nextBoolean();
		System.out.println("임의의 논리값: "+b);

		
		/*
		int num1 = random.nextInt(5);		
		int num2 = random.nextInt(5);
		System.out.println("0부터 6사이의 임의의 정수 값: "+"("+num1+","+num2+")");
		
		while{
			if(num1+num2==5) {
				
			
             System.out.println();
				
			}else { 
		}*/
	}

}
