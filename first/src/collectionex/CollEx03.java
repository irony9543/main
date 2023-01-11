package collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx03 {
	
	private static final String Iterator= null;
	
	public static void main(String[] args) {
//		ArrayList list= new ArrayList();
		ArrayList<String> list= new ArrayList<String>();
        list.add("사과");
        list.add("수박");
        list.add("귤");
        list.add("딸기");
        list.add("체리");
        
       /* Iterator t= list.iterator();
        while(t.hasNext()) {
        	System.out.println(t.next());
        }*/
        
        prn(list); // [사과, 수박, 귤, 딸기, 체리] 5칸
        
        System.out.println(">> 인덱스 2인 위치에 키위 삽입 <<");
        list.add(2,"키위");
        prn(list); //[사과, 수박, 키위, 귤, 딸기, 체리] 6칸
        
        System.out.println(">> 인덱스 4인 위치의 데이터를 포도로 변경 <<");
        list.set(4,"포도");
        prn(list);//[사과, 수박, 키위, 귤, 포도, 체리] 6칸
        
        System.out.println(">> 인덱스 1인 위치의 데이터를 제거 <<");
        list.remove(1);
        prn(list);//[사과, 키위, 귤, 딸기, 체리] 5칸
        
        System.out.println(">> 사과 데이터를 찾아서 제거");
        list.remove("사과");
        prn(list);//[키위, 귤, 딸기, 체리] 4칸           
	}	
	 static void prn(ArrayList<String> list) {
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println("\n");
	}

}
