package modifierex;


class Account{
	int count;
	static int total;//10
	
	Account(int amount){//10
		count += amount;//10
		total += amount;//10
	}
}

public class AccountEx {

	public static void main(String[] args) {
		System.out.println("Account.total: "+ Account.total);//0
		
		Account acc01= new Account(10);//10
		System.out.println("acc01.total: "+acc01.total);//10
		System.out.println("acc01.count: "+acc01.count);//10
		Account acc02= new Account(10);
		System.out.println("acc01.total: "+acc02.total);
		System.out.println("acc01.count: "+acc02.count);
		
		Account acc03= new Account(10);
		System.out.println("acc01.total: "+acc03.total);
		System.out.println("acc01.count: "+acc03.count);
		
		
	}

}
