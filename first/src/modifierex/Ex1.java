package modifierex;




public class Ex1 {

	public static void main(String[] args) {
		//형변환(String=>) 문자(char)로
		String str= new String("Java");
		System.out.println("원본 문자열: "+str);
		//배열객체의 길이:length, 문자열 길이:length()
		System.out.print("charAt() 메소드 호출 후 원본 문자열: ");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+"");
		}
		System.out.println("\ncharAt(0) 메소드 호출 후 원본 문자열: "+str.charAt(1));
				
	   String s= "50";
	   int i= Integer.parseInt(s);	
	   s="3.14";
	   double d= Double.parseDouble(s);
	   float f= Float.parseFloat(s);
	   
	   //형변환(=>String): valueOf(),toString()
	   d= 3.141592;
	   s= String.valueOf(d);
	   System.out.println(s);
	   
	   i=50;
	   s=Integer.toString(i);
	   Float d1= 3.141592f;
	   s= Float.toString(d1);
	   System.out.println(s);
	   Long l1= 329L;
	   s= Long.toString(l1);
	   System.out.println(s);
	   
	   Integer i5= 5;
	   String s5= i5.toString();
	      
	   
	}

}
