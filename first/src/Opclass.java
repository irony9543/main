import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Opclass {

	public static void main(String[] args) {
		 
		/*int a= 10;
		int b= a;
		System.out.println(b);//(b=10)
		
		b += a;//b=b+a(10+10=20)
		System.out.println(b);
		
		b -= a;//b=b-a(20-10=10)
		System.out.println(b);
		
		b *= a;//b=b*a(10*10=100)
		System.out.println(b);
		
		b /= a;//b=b/a(100/10=10.0)몫값=10
		System.out.println(b);
		
		b %= a;//b=b%a(10%10=1.0)나머지값=0
		System.out.println(b);*/
		
		/*int a = 10;
		int b = 5;
		
		//비교연산자: 값으로 true, false를 반환
		System.out.println("a==b : " + (a==b));
		System.out.println("a>b : " + (a>b));
		System.out.println("a>=b : " +(a>=b));
		System.out.println("a<b : " + (a<b));
		System.out.println("a<=b : " + (a<=b));
		System.out.println("a!=b : " + (a!=b));
        */
		/*
		double pi= 3.141592, r= 5.0;
		double area;
		
		area= r*r*pi;
		System.out.println("반지름이 "+r+"인 원의 면적은 "+area+"입니다.");
        */
		/*int a= 3;
		
		++a;//전위연산자 a=a+1
		System.out.println("1: "+a);
		--a;
		System.out.println("1: "+a);
		a--;//후위연산자 a=a-1
		System.err.println("2: "+a);
		a++;
		System.err.println("2: "+a);
		
		int x= 5;
		int y= ++x;//x=x+1
		System.out.println("3: "+x+ " " +y);
		
		int x2= 5;
		int y2= x2++;//y2=x2
		             //   x2=x2+1
		System.out.println("4: "+x2+ " " +y2);*/
		
		//System.out.println();
		//System.out.print();
		//System.err.println();
		/*
		int a= 10, b= 10;
		int c= a; //10+10
		System.out.println("a : " +a+ ", c: "+c);
		c= ++a +b;
		System.out.println("a : " +a+ ", c: "+c);
		c= a++ +b;//c=a+b=11+1,a=a+1
		System.out.println("a : " +a+ ", c: "+c);
		*/
		/*
		String str= "Hello";
		System.out.println(str);
		
		int n= 6;
		
		if(n%2==1) {//참인경우if, 거짓인경우 else를 출력함
			System.err.println("홀수");
		}else {
			System.err.println("짝수");
		}
		*/
		/*
		 */
		/*  //학점계산문제
		int score =65;
		
		String grade;
		//90~100:A등급,90~94:A-등급,95:A0등급,96이상:A+등급
		//{}중괄호 생략조건: 실행문이 한줄일 경우만 생략가능하다.
		if(score>=90) {
			if(score >=96) {
				grade="A+";
			}else if(score ==95) grade="A0";
			else grade="A-";			
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else if(score>=60) {
			grade = "D";			
		}else{
			grade = "F";}
	   System.out.println("당신의 학점은 "+grade+"입니다.");
	   */
	    //조건문을 이용한 입력한달에 해당되는 일수가 나오도록하세요.
		//1월,3월,5월,7월,8월,10월,12월:31
		//2월:(년도를 4로 나누어서 나머지가0이면)29/(0아니면)28일
		//4월,6월,9월,11월:30일
		
		//변수:일수(day),월 수(mon),년도(year)
		
		//if문을 이용한 달력확인
		/*
		int y=2002;
		int m=4;
		int d=30;
		
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) 
			d=31;
		else if(m==2) {
			if(y%4==0) d=29;
			else d=28;
		}
		
		else d= 30;
		System.out.println(m+"월의 일수는 "+d+"일입니다.");
        */
		
        		
		//switch case문 활용 달력확인
		int year= 2023;
		int mon= 7;		
		int day = 0;
				
		switch(mon) {
		case 1:	case 3: case 5: case 7:
		case 8: case 10: case 12:  day=31; break;			
		case 2:
			if(year%4==0) {day=29;
			}else {day=28;} 
			break;				
		case 4: case 6: case 9:	case 11: day=30; 
		}	
		System.out.println(mon+"월은 총"+day+"일입니다.");
		
		
		
		/*
		int score= 90;
		String grade;
		
		switch (score/10) {
		case 10: case 9: grade= "A"; break;
		case 8: grade= "B";	break;
		case 7: grade= "C";	break;
		case 6: grade= "D";	break;
		default: grade="F"; 
		}
	   System.out.println("학점은 "+grade+"입니다.");
	   	*/
		/*
		int i =3;
		if(i<=5)System.out.println("1번");
		else if(i<=4)System.out.println("2번");
		else if(i<=3)System.out.println("3번");
		else if(i<=2)System.out.println("4번");
		else System.out.println("5번");
		
		System.out.println("\n=============\n");
		
		if(i<=5)System.out.println("1번");
		if(i<=4)System.out.println("2번");
		if(i<=3)System.out.println("3번");
		if(i<=2)System.out.println("4번");
		else System.out.println("5번");
		*/
		
		
		/*
		int id= 1111;
		int pw= 2222;	
		 /* 만약에 아이디가 1111이고, 비밀번호가 2222인 경우에는 로그인처리
		  * 아니면 입력값이 잘못되었습니다. 처리
		 */
        //&& 논리곱: 둘다 참인 경우만 참, 나머지 거짓
		//|| 논리합: 둘다 거짓인 경우만 거짓, 나머지 참
		/*
		if(id==1111 && pw==2222) {
			System.out.println("로그인되었습니다.");
		}else {
			System.out.println("입력값이 잘못되었습니다.");
		}
		*/
        /*
		int a= 10, b=10;
		int c= a;
		System.out.println(a+", "+b+", "+c);
		
		c= (a+b)+ ++a;
		System.out.println(a+", "+b+", "+c);
		*/
		
		/*
		int value1= 3;
		//논리연산 논리곱(=AND=&&)전위연산자 우선순위무시
		System.out.println("논리연산 논리곱 &&");
		System.out.println(false && ++value1>6);
		System.out.println(value1);//3
		System.out.println(true&& ++value1>6);
		System.out.println(value1);//4=3+1
		System.out.println("===============\n");
		
		//논리연산 논리합(=OR=||)후위연산자 무시
		System.out.println("논리연산 논리합 ||");
		int value2= 5;
		System.out.println(true|| value2++>6);
		System.out.println(value2);//5
		System.out.println(false|| value2++>6);
		System.out.println(value2);//6=5+1
		System.out.println("===============\n");
		*/			
		
		/* 변수로 만들어야하는 조건
		 * : 값이 많이(자주) 변경되는 경우
		 * : 다른 곳에서 사용을 다시하는 경우
		 * 
		 * 입력한 달이 3월~8월까지이면 "1학기"출력하세요
		 * 입력한 달이 3~8월까지가 아니면 "2학기"를 출력하세요
		 * 변수로 만들어야하는 것: 달(mon),학기(hak)
		 */
		/*
		int m=8;
				
		if(m>=3&&m<=8) {
			System.out.println("1학기");
		}else {
			System.out.println("2학기");
		}
		*/
		/*
	    String s="C"; String str;
	    switch (s) {
		case "A": str= "1"; System.out.println(str);
		case "B": str= "2"; System.out.println(str);
		case "C": str= "3"; System.out.println(str);
		case "D": str= "4"; System.out.println(str);
		case "E": str= "5"; System.out.println(str);
		 default: str= "6"; System.out.println(str);			
		}*/
		/*
	   int i=3;
	   String str="";
	   switch (i) {
	     case 5: str += "고길동"; break;
	     case 4: str += "도우너"; break;
	     case 3: str += "둘리"; 
	     case 2: str  = "박희동";
	     case 1: str += "또치";	     
	default: str += "마이콜"; 		
	}	
	    System.out.println(str);
	*/	
		
		/*		
	    //반복문(for문)
		System.out.println("for문 1");
		int n= 0;
		for(n=1;n<=10; n++) {
			System.out.println("hello java"+n);
		}
		System.out.println("for문을 빠져나감"+n);
		
		//지역변수=아이디
		 */
		
		/*
		//3번 반복하기 //i=i+1
		for(int i=1; i<=3; i++) {//1-2-3
			System.out.print("가");//가가가
		}
	    System.out.println();
	    
	    for(int i=2; i<5; i++) {//2-3-4
	    	System.out.print("가");//가가가
	    }
		System.out.println();
		
		for(int i=3; i>0; i--) {//3-2-1
			System.out.print("가");//가가가			
		}
		*/
		//3번 반복하기 //i=i+1
		/*
		for(int i=0; i<3; i++) {//0-1-2
			System.out.print(i+" ");
		}
	    System.out.println();			    
	    for(int i=4; i<=6; i++) {//4-5-6
			System.out.print(i+" ");
		}
		System.out.println();				
		for(int i=3; i>=1; i--) {//3-2-1
		   System.out.print(i+" ");			
		}
		*/
		/*
		int i=0;
		for(i=6;i>=4;i--) {
			System.out.print(i+" ");//6 5 4
		}
		System.out.println(i);//6 5 4 3
		System.out.print(i-1+" ");//2
		System.out.print(i-2+" ");//2 1 
		System.out.println(i-3+" ");//2 1 0
		*/
		/*//특정년도의 월구분 문제 
		int y=2023, m=1,d=0;
		
		for(m=m; m<=12;m++) {
			switch(m) {
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		    	d= 31; break;
		    case 2:
		    	if(y%4==0) d=29;
		    	else 	d=28;
		    	break;
		    	default: d=30;
		    }
		    System.out.println(y+ "년도의 "+m+ "월");
		    		    		    
		    for(int i=1; i<=d;i++) System.out.print(i+"일 ");
		    	System.out.println();
		    
		}
		*/
		/*
		System.out.println("while문 1");
		int total=0;
		int i=1;
		
		while(i<=10) {
			total +=i; //total= total+i;
			i++;
		}
		System.out.println(total);
		//System.out.println(i);
		*/
		/*
		int i=1;
		while(i<=5) {
			if(i==1)System.out.println("while문 시작 시: "+i);
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\nwhile문 종료 후: "+i+"\n\n");
		*/
	   /*	
	   System.out.println("do while문 1");
	   int tot=0, i=1;
	   do {
		   tot+=i;
		   i++;
	   }while(i<=10);
	   System.out.println(tot);
	   System.out.println("\n=====\n");
	   */
		/*
		System.out.println("do while문 1");
		int i=5;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>=1);
		System.out.println("\ndowhile문 종료 후: "+i+"\n");
		   System.out.println("\n=====\n");
	   */
		/*
		System.out.println("for문 2");
		int tot=0;//9
		
		for(int i=0; i<3; i++){
			
		for(int n=1;n<=5;n++) {
			if(n==3) break;
			tot+=n; //tot=tot+1;
		    }
		}		
	    System.out.println("합계는 "+tot);
		/*
		System.out.println("for문 3");
		
		for(int i=1;i<=6;i++) {
			if(i%2==0) { 
			continue; 
		}
	    System.out.print(i+" ");
	   } 
	   */
		/*
        //구구단 		
		System.out.println("출력결과");
		System.out.print("==============");
		
		int n,i;//n은 앞자리 수, i는 뒷자리 수		
		for(n=2; n<=9 ;n++) {
			  System.out.println("\n"+n+"단");			  
             for(i=1; i<=9;i++){   
          System.out.println(n+" x "+i+" = "+(n*i));         
             }   */     
		  //구구단2
		/*
            int max=9;
            for(int i=2; i<=max; i++){
            System.out.println(i+"단");
            for(int j=1; j<=9; j++) {
            	System.out.print(i+" x "+j+" = "+(i*j));
               if(!(i==max&&j==9))
            	System.out.println();
             }
            if(i<max)System.out.println();
          }*/
		/*
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				//제어문없을시 i의 범위만큼 모두출력(1~10)
				continue;//짝수만 출력(2,4,6,8,10)
				//break;//아무것도 출력되지않음
			}
			System.out.println(i);
		}*/
		/*
		System.out.println("라벨 분기문 for문");
		
	    gugudan:
	    	for(int i=2; i<=9; i++) {
	    		System.out.println("구구단 "+i+"단");
	    		for(int j=1; j<=9; j++) {
	    			//if(i==4) break gugudan;//3단까지만 출력
	    			// 제어문없을시 모두 출력
	    			if(i%2==0) continue gugudan;//짝수단 제외 모두출력
	    			System.out.println(i+"*"+j+"="+(i*j));
	    		}
	    		
	    		System.out.println();
	    	}
	    System.out.println("\n===========\n");
		*/
		//int j=5;
		//if(j<5) {if실행문;}
		//else {else실행문;}
		//j<5 ? if실행문: else실행문
		/*
		//for
		System.out.println("무한루프 for문");
		int i=1;//i=1
		for( ; ; ) {
			System.out.print((i!=1 ?"  ": "")+i);//"" : 빈문자열
			if(++i>10) break;
		}
		System.out.println("\n종료 후 i의 값:"+i);
		System.out.println("\n===============\n");
		
		//while
		System.out.println("무한루프 while문");
		i=1;
		while(true) {
			System.out.print((i!=1?"  ": "")+i);
			if(++i>10) break;
		}	
			System.out.println("\n종료 후 i의 값:"+i);
			System.out.println("\n===============\n");
			
		//do~while	
		System.out.println("무한루프do ~ while문");
		i=1;	       
		do {
			System.out.print((i!=1?"  ": "")+i);//"  "는true : ""는 false로
			//if(++i>10) break;                 // 값이 t/f인지에 따라 거쳐가는곳이 달라짐
			if(i++>10) break;//1~11까지 루프되고 i=11로 되어진값에서 if서
			//if(i>10,i=i+1) break; //i값이 12가되어 제어문에 걸리지 않음
		     }while(true);
		System.out.println("\n종료 후 i의 값:"+i);
	    */
		//이스케이프 문자
		/*
		String s= "문자열 출력";
		int i=10;
		double d= 3.141592;
		System.out.println(s+" "+i);
		System.out.printf("%s %d\n",s,i);
		System.out.printf("%d\n",10);//
		System.out.printf("%b\n",10);//boolean사용		
		System.out.printf("%o\n",10);//8진수로 출력[12]
		System.out.printf("%x\n",10);//영어 소문자출력
		System.out.printf("%X\n",10);//영어 대문자출력
		System.out.printf("%s\n", "문자열 출력");
		System.out.printf("%f\n",3.2582);//
		System.out.printf("%10.2f\n",3.2582);//10칸에 마지막값을 표기 .2(소수점2칸까지만 반올림적용)
		System.out.printf("%-10d과 %.4f\n",10,3.2582);//
		*/
		/*
		//배열
		 int[] a; //int a[];
		 a = new int[] {1,2,3,4,5};
		 System.out.println(a);
		 for(int i=0; i<5; i++) 
		    System.out.print(a[i]+ " ");	 
		 System.out.println();
		 
		 //배열의 길이(방개수)
	    System.out.println(a.length);
	    
	    int[] b= new int[5];
	    b[2]= 1;
	    System.out.println(b);
	    for(int i= 0;i<b.length;i++)
	    	System.out.print(b[i]+ " ");
	    System.out.println();
	    // [0]=0 [1]=0 [2]=3 [3]=0 [4]=0 
	    */
	    /* 자동초기값을 받는 경우는 지역변수가 아닌 경우만 가능하다.
	     * 
	     * 
	     * */
	    //int c;
	    //System.out.println(c);
	    
	    //int[] c;
	    //System.out.println(c);
	    
		//index
	    //int[] c= new int[5];
		//System.out.println(c);
	    //for(int i: c) System.out.print(i+ " ");//for(int 변수이름:배열 객체)
	   
		/*
	    int[] c= {1,2,3,4,5};
	    c[0]=0;
	    c[1]=0;
	    System.out.println(c);
	    for(int i: c) System.out.print(i+ " ");
	    */
		
		//length-1:마지막 인덱스번호 찾는 수식
		/*
		int []a= {95,73,100}; int t=0;
		double avg; int i;
		
		for(i=0; i<a.length; i++)t+= a[i];
		avg=(double)t/a.length;
		avg= t/a.length;
		System.out.println("종합: "+t);
		System.out.println("평균: "+avg);
	    */
		
		/*
		int[] score= {79,88,91,33,100,55,95};
		
		int max= score[0];
		int min= score[0];
		
		for(int i= 1; i<score.length; i++) {
			if(score[i]>max)
				max= score[i];
			
			if(score[i]< min)
				min= score[i];
		}		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		*/
	
		//이차원 배열
		/*
		int[][] a= new int[2][3];
		a[0][0]=0; a[0][1]=1;
		a[0][2]=2; a[1][0]=3;
		a[1][1]=4; a[1][2]=5;
		
		for(int i=0; i<a.length; i++) {//a.length 줄(행)수: 2
			for(int j=0; j<a[i].length; j++) {//a[0].length: 3
				if(j==a[i].length-1) System.out.println(a[i][j]);
				else System.out.print(a[i][j]+ " ");
			}
		}*/
		/*
		int[][] a= new int[2][];
		a[0]= new int[2]; //a[0]= a[1]=
		a[1]= new int[3]; //a[0]= a[1]= a[2]=
				
		for(int i=0; i<a.length; i++) {//a.length 줄(행)수: 2
			for(int j=0; j<a[i].length; j++) {//a[0].length: 3
				a[i][j]=i+j;
				if(j==a[i].length-1) System.out.println(a[i][j]);
				else System.out.print(a[i][j]+ " ");
			}
		}*/
		int[][] a= {
				      {0,1},
				      {2,3,4}
		           };
		for(int i=0; i<a.length; i++) {//a.length 줄(행)수: 2
			for(int j=0; j<a[i].length; j++) {//a[0].length: 3
				if(j==a[i].length-1) System.out.println(a[i][j]);
				else System.out.print(a[i][j]+ " ");
			}
		}
		
	   System.out.println("1");
		
			}
}
