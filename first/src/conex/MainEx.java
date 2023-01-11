package conex;

public class MainEx {

	public static void main(String[] args) {
		Main m1= new Main();
		System.out.println(m1.x);

	}

}

class Main{
	int x;//자동초기화값:0
	
	public Main(){
		this.x= 5;
	}
}
