package methodex;

public class Ex04 {	
	
	static void prn(int x,int y,int z) {//prn(10,20,30);
		System.out.println(x+"\t"+y+"\t"+z);//10	20	30
	}
	static void prn(int x,int y) {//prn(40,50);
		System.out.println(x+"\t"+y);//40	50
		}
	static int prn(int x) {//prn(60)
		return x;//60
		}//prn의 메소드 오버로딩//
	
	public static void main(String[] args) {
		prn(10,20,30);
		prn(40,50);
		prn(60);

	}

}
