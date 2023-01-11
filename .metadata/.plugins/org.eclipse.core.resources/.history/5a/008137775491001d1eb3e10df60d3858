package collectionex;
import java.util.*;
public class CollEx06 {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put("catello", "1234");
		map.put("java", "1111");
		map.put("lang", "1234");
		
		Scanner s= new Scanner(System.in);
		//화면으로부터 라인단위로 입력
		
		while(true) {//무한루프문
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id: ");
			String id= s.nextLine().trim();//nextline:한줄단위 문자열을 입력받을수 있게 해줌.
			               			       //trim: 문장의 앞뒤 공백을 제거해줌.
			System.out.print("password: ");
			String password= s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");				
			}else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("입력하신 password가 일치하지 않습니다. 다시 입력해주세요. \n");
				}else {
					System.out.println("id와 password가 일치합니다.");
					break;//자기를 감싸고있는 최초의 while문을 빠져나간다.
				}
			}
			
		}
		

	}

}
