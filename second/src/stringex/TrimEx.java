package stringex;

public class TrimEx {

	public static void main(String[] args) {
		// 공백 제거: trim()
		String str4="   공백  제거   공백  제거	";
		//3공백 2제거 4공백 2제거 탭1
		System.out.println("["+str4+"]");
		System.out.println("["+str4.trim()+"]");//맨 왼쪽, 오른쪽의 공백 제거만 가능
		System.out.println("["+str4.replace(" ","")+"]");//문자열치환으로 가운데 공백제거
		
	
	}

}
