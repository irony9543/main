package collectionex;
//컨트롤 shift O
import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

public class CollEx01 {

	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<String> arrayList= new ArrayList<String>();
		
		//리스트에 요소의 저장
		arrayList.add("넷");
		arrayList.add("둘");
		arrayList.add("셋");
		arrayList.add("하나");
		
		System.out.println("arrayList: "+arrayList);
		//리스트 요소의 출력
		for(String s: arrayList) {System.out.println(s);}
		
		List<String> lst= new ArrayList<String>();
		lst.add("alpha");
		lst.add("beta");
		lst.add("charlie");
		System.out.println("lst객체: "+lst);
		
//		Iterator<String> iter= lst.iterator();
		Iterator iter= lst.iterator();
		while(iter.hasNext()) {
			String str= (String)iter.next();
			System.out.println(str);
		}
        for(String str: lst) {System.out.println(str);}
	}

}