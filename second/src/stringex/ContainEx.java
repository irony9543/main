package stringex;

public class ContainEx {

	public static void main(String[] args) {
		String str="my java test";
		
		System.out.println(str.contains("java"));
		System.out.println(str.contains(" my"));//공백도 동일해야 함
		System.out.println(str.contains("JAVA"));
		System.out.println(str.contains("java test"));

	}

}
