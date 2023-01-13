package javalangex;
import inheritanceex.VIPCustomer;


public class ClassEx02 {

	public static void main(String[] args) throws Exception {		
	    //드라이버를 준비하는 과정
		Class c1= Class.forName("java.lang.String");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();

	     c1= Class.forName("java.util.List");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
		
	     c1= Class.forName("java.lang.Object");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();
				
		 c1= Class.forName("java.awt.event.WindowAdapter");
		System.out.println(c1.toString());
		System.out.println(c1.toGenericString());
		System.out.println();

		//클래스 조사후 클래스 정보를 담는다.
		c1= Class.forName(VIPCustomer.class.getName());
		System.out.println(c1);
		System.out.println(c1.toGenericString());
		//newInstance()변환형이 Object형이므로 다운캐스팅한다.
		//자바 9버전 이후는 사용안함.
		VIPCustomer v= (VIPCustomer) c1.newInstance();
		System.out.println("아이디: "+v.getAgentID());
	
	}
}
