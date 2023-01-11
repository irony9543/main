package methodex;
 class 	Point02{//인스턴스=복사본 
	 private int x; private int y; 
	 //public void setX(int x) {x=x;}
     //public void setY(int y) {y=y;} 	 
     public void setX(int x) {this.x=x;}
     public void setY(int y) {this.y=y;} 
     public int getX( ) {return x;}
     public int getY( ) {return y;}
  
     }  

public class Ex02 {   
	 public static void main(String[] args) {
		 Point02 pt02= new Point02();//생성자호출문//객체생성문
		 pt02.setX(10);
		 pt02.setY(20);
	     System.out.println(pt02.getX()+ ", "+pt02.getY());

	     
	}

}
