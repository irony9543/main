package getsetex;

public class MyDate {
	
	private int y, m, d; //0,0,0
	private String str;  //null
	public MyDate(int d,int m,int y) {//2,92,2023
		
		this.d=d;//d=29
		this.m=m;//m=2
		this.y=y;///y=2023
	}
	
   private void setMyDate(int r) {//r=1
	if(r==1) str="유효한 날짜입니다"; 
	else str= "유효하지 않는 날짜입니다.";
	}
	public String getMyDate() {return str;}
	public void isValid() {
		
	int r;
	if(y%4==0) {//년도의 나머지가 0이아니니 else쪽으로 탈출
		switch (m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(d<=31) r=1;
			else r=0;
			break;
		case 2:
			if(d<=29) r=1;
			else r=0;
			break;
		default:
			if(d<=30) r=1;
			else r=0;
			break;
		}
	}else {//나머지가 0아닌 년도들이 이쪽으로 탈출->2023  m=1이므로 case 1:로 통과
		switch (m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(d<=31) r=1;
			else r=0;
			break;
		case 2:
			if(d<=28) r=1;
			else r=0;
			break;
		default:
			if(d<=30) r=1;
			else r= 0;
		} 
	}
	setMyDate(r);//호출 
	
	}}
