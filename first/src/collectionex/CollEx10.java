package collectionex;

import java.util.*;
public class CollEx10 {

	public static void main(String[] args) {
		Set<Student> stSet= new HashSet<Student>();
		Student st = new Student("홍길동",1,1); //x001
		stSet.add(new Student("홍길동",1,1)); //x002
		stSet.add(new Student("전우치",2,1)); //x003
		stSet.add(st);
		stSet.add(st);
        Iterator<Student> it= stSet.iterator();
        
        System.out.println("stSet.size(): "+stSet.size());//3
        
        while(it.hasNext()) {
        	Student s= it.next();
        	System.out.println(s.name+"님은 "+s.ban+"반, "+s.no+"번 입니다.");
        }

        
	}

}
