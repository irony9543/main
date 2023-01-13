package innerex;

class Outer{
    static int data=0;
	static int data1= 50;
	
       static void myMethod() {
    	System.out.println("Outer클래스의 메소드data: "+data);
    }
    //내부클래스1 - 멤버 이너클래스
    class InstanceInner{
    	int iv= 100;
    	
    	void myMethod(){
    		System.out.println("InstanceInner클래스의 메소드data: "+data+", iv: "+iv);
    	}
    }
    
    //내부클래스2 - 정적 클래스
    static class StaticInner{
    	int iv= 200;
    	static int cv= 300;
    	
    	void myMethod(){
    		System.out.println("StaticInner클래스의 메소드data1: "+data1);
//    		System.out.println("StaticInner클래스의 메소드data: "+data1);
//    		클래스 외부데이터인 경우는 static만 올 수 있다.
    		System.out.println("StaticInner클래스의 iv: "+iv+", cv: "+cv);
    	}
    }      
}

public class InnerEx01 {
	public static void main(String[] args) {
		Outer outer= new Outer();
		// 내부클래스 객체생성
        Outer.InstanceInner instanceInner= outer.new InstanceInner();
        System.out.println("instanceInner.iv: "+instanceInner.iv);//100
        System.out.println();
        System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);//300
        Outer.StaticInner.cv=50;
        System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);//50
        
        Outer.StaticInner staticInner= new Outer.StaticInner();
        System.out.println("staticInner.iv: "+staticInner.iv);//200
        System.out.println("staticInner.cv: "+staticInner.cv);//50
        System.out.println();
        Outer.myMethod();
        instanceInner.myMethod();
        staticInner.myMethod();
        
        staticInner.iv= 50;
        System.out.println("staticInner.iv: "+staticInner.iv);//50
	}

}
