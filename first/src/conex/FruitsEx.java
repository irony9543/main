package conex;

public class FruitsEx {

	public static void main(String[] args) {
		Fruits f= new Fruits();
		f.Fruitsmd("감귤", 20000, "제주");
		System.out.println("과일명: "+f.getName()+","+"가격: "+
		f.getPrice()+", 원산지:"+f.getSpace());
		
		/*System.out.printf("과일명: %s, 금액: %d, 원산지: %\n",
				f.getName(),f.getPrice(),f.getSpace());			
         */}
	
}

class Fruits{
	String name;//과일이름
	int price;//가격
	String space;//원산지
	public Fruits() {}
	public void Fruitsmd(String name,int price,String space) {
		this.name= name;
		this.price= price;
		this.space= space;		
	}
	
	
	String getName() { return name; }
	 int getPrice() {return price;}	
	 String getSpace() {return space;}
 
}