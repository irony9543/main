package collectionex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollEx09 {

	public static void main(String[] args) {
		Set<Integer> set= new HashSet<Integer>();
       //HashSet생성
		set.add(3);
		set.add(2);
		set.add(1);
	  //set.add(1);//중복값 저장불가
		
		System.out.println("0번: "+set);
		
		List<Integer> il= Arrays.asList(2,1,3);
		set= new HashSet<Integer>(Arrays.asList(2,1,3));
		System.out.println("1번: "+set);
		Iterator iter= set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
		//linkedHashSet은 순서가없는 set이나 hashSet의 것을 서로 연결시켜서 순서를 만들어줌
		Set<Integer> linkedSet1= new LinkedHashSet<Integer>(Arrays.asList(2,1,3));
		System.out.println("2번: "+linkedSet1);//전체출력[1,2,3]
		
		Iterator iter1= linkedSet1.iterator();//Iterator 사용
		while(iter1.hasNext()) {
			System.out.print(iter1.next());
		}
		
		
		
	}

}
