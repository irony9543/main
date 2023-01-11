package collectionex;

import java.util.*;

public class CollEx04 {
	public static void main(String[] args) {
		/*
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));
		list.add(new Student("전우치",2,2));
		
		Iterator<Student> it= list.iterator();
		
		while(it.hasNext()) {
			Student s= it.next();
			System.out.println(s.name+ " " +s.ban + "반 "+s.no+ "번");
		}*/
		
		Student st= new Student();		
		ArrayList<Student> list1= new ArrayList<Student>();
		st.setName("자바왕");list1.add(st);
		st.setName("자바짱");list1.add(st);
		st.setName("홍길동");list1.add(st);
		st.setName("전우치");list1.add(st);
				
         Iterator<Student> it= list1.iterator();
		
		while(it.hasNext()) {
			Student s= it.next();
			System.out.println(s.name+ " " +s.ban + "반 "+s.no+ "번");
		}		

	}
      
}
class Student {
	String name;
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name= name;
		this.ban= ban;
		this.no= no;
	}

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
	
}