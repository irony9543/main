package innerex;
//자동차 입력시 빨간불:멈춘다, 노란불:준비한다, 파란불:출발한다
//보행자 입력시 빨간불:멈춘다, 파란불:출발한다
//종료인 경우 프로그램을 종료한다.
//람다식 조건문 반복문 사용

import java.util.HashMap;
import java.util.Scanner;

interface Ram<T,R>{
	R objmd(T obj);
}

//자동차 입력시 
public class DriveEx{
			
	public static void main(String[] args) {
				
		Scanner sc= new Scanner(System.in);
			
		Ram<String, Boolean> ram= obj ->
	    System.out.println(obj+"인 경우:"); 
	    HashMap<String, Integer> map = new HashMap<>();     
	       map.put("자동차", 3);
		    map.put("보행자", 2);
		    map.put("종료", 0);
		    if(map.containsKey(obj)){
		    	String[] s= {"빨간불: 멈춘다.","파란불: 출발한다.","노란불: 준비한다."};
		    if(map.get(obj>0)) {
		    	for(int i= 0; i<map.get(obj);i++) {
		    System.out.println(s[i]);
		    	}}else {
		    		System.out.println("프로그램을 종료합니다.");
		    		return ;
		    	}
		    	System.out.println();
		    }else {System.out.println("잘못된 값이 입력되었습니다.");
		    }
		    	return ;
		  };
		    	
	    Ram<Integer,Integer> ram1= obj ->obj*obj;
	    while(true) {
		//입력되는 곳 "자동차"등을 입력하면 받는 부분
//		String s = sc.nextLine();
//		if(!ram.objmd(s)) break;
	    	int i = sc.nextInt();
			if(ram1.objmd(i) <= 0) break;
			else System.out.println(ram1.objmd(i));
		}	
	    	
	    	
	    	
	    	
		// 메소드로 처리한 부분에 대한 호출문 생성
		
		/*
		Ram<Integer, String> ram1= s -> {
			return "안녕하세요."+s;
		};
	    System.out.println(ram1.md(1));
		*/
		
		/*	
			if(map.containsKey(s)) {//3
				if(map.get(s)>0) {
				for(int i=0; i<map.get(s); i++) {
				System.out.println(sarr[i]);
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				return true;
			  }
			}else {
				System.out.println("잘못입력하셨습니다.");
			}//메소드 안에 넣기 종료
			return false;	
}			
		//
				if(md(s)) break;
	    }		
	    }
	    
			
		
/*		String car = "자동차";
		String walk= "보행자";
		String end= "종료";				
		while(true){
			System.out.println("자동차,보행자,종료 중 하나를 입력해주세요.");
			System.out.print("입력: ");
			String str= sc.nextLine().trim();
			
			if(str==car) {//통과후 람다식
			   System.out.println("====================");
				System.out.println("자동차인 경우:");
				System.out.println("빨간불: 멈춘다.");
				System.out.println("노란불: 준비한다.");
				System.out.println("파란불: 출발한다.");
			}else {
				if(str==walk&&str!=end) {
					System.out.println("==================");
					System.out.println("보행자인 경우:");
					System.out.println("빨간불: 멈춘다.");
					System.out.println("파란불: 출발한다.");
					
					}else {	
						if(str==end)
						System.out.println("프로그램을 종료합니다.");
						System.out.println("===============");
						break;
					}						
			}	  
		}*/	
    
		
	
	
	
	
	}
		
}
		
		
		

	


