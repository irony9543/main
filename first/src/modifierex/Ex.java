package modifierex;

public class Ex {

	public static void main(String[] args) {
		String s1="고구마";
		String s2="고구마";
		String s3= new String("고구마");

		
		 System.out.println("s1: "+System.identityHashCode(s1));
		 System.out.println("s2: "+System.identityHashCode(s2));
		 System.out.println("s3: "+System.identityHashCode(s3));
		 System.out.println("\n==================\n");
		 System.out.println("s1: "+s1.hashCode());
		 System.out.println("s2: "+s2.hashCode());
		 System.out.println("s3: "+s3.hashCode());
		 System.out.println("\n==================\n");
		 
		
		
		
		String s4= new String("고구마");
		String s5= "고구마";
		System.out.println("s4: "+System.identityHashCode(s4));
		System.out.println("s5: "+System.identityHashCode(s5));
		System.out.println("s4: "+s4.hashCode());
		System.out.println("s5: "+s5.hashCode());
		System.out.println("\n==================\n");
		
		System.out.println("s1: "+System.identityHashCode(s1));
		System.out.println("s1: "+s1.hashCode());
		s1="가지";
		System.out.println("s1: "+System.identityHashCode(s1));
		System.out.println("s1: "+s1.hashCode());
		System.out.println("\n==================\n");
		
		int i1=1;
		int i2=1;
		System.out.println("i1: "+System.identityHashCode(i1));
		System.out.println("i2: "+System.identityHashCode(i2));
		i1=2;
		System.out.println("i1: "+System.identityHashCode(i1));
		//System.out.println("i1: "+i1.hashCode());
		//System.out.println("i2: "+i2.hashCode());
		
	    
		
		
	}

}
