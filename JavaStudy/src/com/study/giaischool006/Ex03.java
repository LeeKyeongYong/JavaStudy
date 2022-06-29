package com.study.giaischool006;
import java.io.InputStream;
import java.util.Scanner;

/*
Exam029
*/
public class Ex03 {
	public static void main(String[] args) {
			/*
			  로그인이 실패했을경우에 계속 입력 로그인이 성공하면 프로그램 종료
			  아이디를 입력해주세요 >> Hello
			  비밀번호를 입력해주세요 >> 4321
			  아이디와 비밀번호가 잘못되었습니다.
			  
			  아이디를 입력해주세요 >> Check
			  비밀번호를 입력해주세요 >> 4321
			  아이디와 비밀번호가 잘못되었습니다.
			  
			  아이디를 입력해주세요 >> Hello
			  비밀번호를 입력해주세요 >> 1234
			  로그인성공.
			  
			 */
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String id="admin";
		 String pw="1234";
		 String InputId="";
		 String InputPw="";
		
		 do {
			 System.out.print("아이디를 입력해주세요 >> ");
			 String userInputId=sc.next();
			 
			 System.out.print("비밀번호를 입력해주세요 >> ");
			 String userInputPw=sc.next();
			 
			 if(id.equals(userInputId)&&pw.equals(userInputPw)) {
				 System.out.println("로그인 성공\n");
				 break;
			 } else {
				 System.out.println("아이디와 비밀번호가 잘못되었습니다.\n");
			 }
			 
			System.out.println();
		 } while (true);
		 
		 //답안
		 /* do {
			 System.out.print("아이디를 입력해주세요 >> ");
			 InputId=sc.next();
			 
			 System.out.print("비밀번호를 입력해주세요 >> ");
			 InputPw=sc.next();
			 
			 if(!(InputId.equals(id)&&InputPw.equals(pw))) {
				 System.out.println("아이디와 비밀번호가 잘못되었습니다.\n");
			 } else {
				 System.out.println("로그인 성공\n");
			 }
			 
		 } while (!(InputId.equals(id)&&InputPw.equals(pw)));
		 
		 */
		 
		 sc.close();
	}
}
