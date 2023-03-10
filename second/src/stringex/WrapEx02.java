package stringex;

public class WrapEx02 {

	public static void main(String[] args) {
		Integer i = new Integer(7);
		Integer e = 7;
		System.out.println("i: " + i + ", e: "+ e);
		System.out.println("인스턴스(객체) 비교 => i == e : "+ (i == e));
		System.out.println("데이터 비교 => i.equals(e) : "+ (i.equals(e)));

		System.out.println("객체 주소 해시코드값: " + System.identityHashCode(i));
		System.out.println("객체 주소 해시코드값: " + System.identityHashCode(e));
		System.out.println("데이터의 해시코드값: " + i.hashCode());
		System.out.println("데이터의 해시코드값: " + e.hashCode());

		System.out.println("\n===============================\n");

		String s = new String("한글");
		String t = "한글";
		System.out.println("s: " + s + ", t: "+ t);
		System.out.println("인스턴스(객체) 비교 => s == t : "+ (s == t));
		System.out.println("데이터 비교 => s.equals(t) : "+ (s.equals(t)));

		System.out.println("객체 주소 해시코드값: " + System.identityHashCode(s));
		System.out.println("객체 주소 해시코드값: " + System.identityHashCode(t));
		System.out.println("데이터의 해시코드값: " + s.hashCode());
		System.out.println("데이터의 해시코드값: " + t.hashCode());
	}

}
