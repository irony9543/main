package interfaceEx;

public interface X {
	void xmeth1();
	void xmeth2();
}

interface Y {
	void ymeth1();
}

interface Z extends X, Y { // 두 개의 인터페이스 상속=인터페이스는 다중상속이 가능함.
	void zmeth1();         //자바는 하나에 한개의 상속만이 원칙이나 다중상속을 가능하게끔 하는것이 있는데 
	                       //그것이 인터페이스를 이용한 상속이다.
}
