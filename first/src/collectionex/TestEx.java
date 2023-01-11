package collectionex;

import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1: ");
		String s1= sc.next();
	    sc.nextLine();      //설정한 것에 맞는 값을 써줘야 제대로 작동함.
		int i=sc.nextInt(); //예로 int값으로 설정하고 int를 안써주면 에러남.
		s1= sc.next();
		System.out.println("2: ");
		s1= sc.next();

	}

}
