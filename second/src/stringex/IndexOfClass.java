package stringex;

public class IndexOfClass {

	public static void main(String[] args) {
		String a= "Good Afternoon!!";
		System.out.println("1번. "+a.indexOf("noon"));//10
		System.out.println("2번. "+a.indexOf(" Af")); //4(공백값도 포함시킨다)
		//indexof:앞에서부터 인덱스번호를 세는것
		//lastindexof: 인덱스값은 그대로지만 뒤에서부터 인덱스번호를 세서 원래의 인덱스값을 호출
		String hello= "HelloWorld_MyWorld";
		System.out.println("3번. "+hello.indexOf("World"));//5 **많이 쓰이는 코드
		System.out.println("4번. "+hello.indexOf("World",10));//13 시작점으로 10번지정. 단어값
		System.out.println("5번. "+hello.lastIndexOf("World"));//13 **많이 쓰이는 코드 
		System.out.println("6번. "+hello.lastIndexOf("World",4));//13 시작점으로 인덱스13번지정하면 역순으로 세고 값이 없으면 -1이 나오고 
		                                                        //알맞는 값이 있으면 인덱스번호가 출력됨
		hello="AaBbCc"; //아스키코드 값으로 인덱스 찾기
		System.out.println("7번. "+hello.indexOf(65));//0
		System.out.println("8번. "+hello.indexOf(99));//5
	}

}
