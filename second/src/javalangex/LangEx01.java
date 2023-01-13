package javalangex;

public class LangEx01 {
	public static void main(String[] args) {
		char a[]= { 'b', ' ', 'A', '5', '한'};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] 요소 = "+a[i]);
			if(Character.isDigit(a[i]))System.out.println(" : 숫자");//숫자요소를 묻는 단어
			if(Character.isLetter(a[i]))System.out.println(" : 문자");//문자요소를 묻는 단어
			if(Character.isWhitespace(a[i]))System.out.println(" : 공백문자");//공백요소를 묻는 단어
			if(Character.isUpperCase(a[i]))System.out.println(" : 대문자");//대문자를 묻는 단어
			if(Character.isLowerCase(a[i]))System.out.println(" : 소문자");//소문자를 묻는 단어
		}

	}

}
