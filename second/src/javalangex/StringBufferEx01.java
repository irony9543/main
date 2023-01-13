package javalangex;

public class StringBufferEx01 {

	//원본훼손하지않으려면 String
	//원본훼손해도 되면 Buffer
	public static void main(String[] args) {
		 //delete()메소드
		 StringBuffer str= new StringBuffer("Java Oracle");
		 System.out.println("원본 문자열: "+str);
		 System.out.println("길이0: "+str.length());
		 System.out.println("공간0: "+str.capacity()+"\n");
		 
		 //시작인덱스 ~인덱스-1번까지
		 System.out.println(str.delete(4, 8)); //Javacle
		 System.out.println(str);              //Javacle
		 System.out.println("길이1: "+str.length());
		 System.out.println("공간1: "+str.capacity()+"\n");
		 
		 //해당인덱스 문자만 제거
		 System.out.println(str.deleteCharAt(1));//Jvacle
		 System.out.println(str);                //Jvacle
		 System.out.println("길이2: "+str.length());
		 System.out.println("공간2: "+str.capacity()+"\n");
		 
		 //해당인덱스 문자만 가져오기
		 System.out.println(str.charAt(1));//v
		 System.out.println(str);          //Jvacle    
		 System.out.println("길이3: "+str.length());
		 System.out.println("공간3: "+str.capacity()+"\n");
		 System.out.println("deleteCharAt()메소드 호출 후 원본 문자열: "+str);


	}

}
