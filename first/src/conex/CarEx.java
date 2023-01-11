package conex;

public class CarEx {

	public static void main(String[] args) {
		Car c= new Car("아우디",2022,10000);//객체생성문
        System.out.println("차종: "+c.kind);;
		System.out.println("년식: "+c.year);		
		System.out.printf("주행거리: "+c.move+"(km)");
		
	}
    
	
}

class Car {
	//속성: 차종,년식,주행거리
	String kind;//차종 null
	int year;   //년식 0
	int move;   //주행거리 0
	//final int con;
	
	/* {  } 초기화 블럭
	Car(){
		con= 5;
	}*/
	
	public Car(String kind,int year, int move) {
		
		this.kind= kind;
		this.year= year;
		this.move= move;
		}				

}