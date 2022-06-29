package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam023 
   정보처리기사의 각과목의 정답갯수를 int형 타입의 변수 5개를 선언하고 입력을 받으세요.
   한과목이라도 8개 미만인 경우 "불합격입니다" 를 출력하고 총갯수가 60개 이상이면 합격입니다" 라는 출력하는 프로그램을
   만드시오.
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("DB: ");
		int num_db=sc.nextInt();
		
		System.out.print("전자계산기구조: ");
		int num_eg=sc.nextInt();
		
		System.out.print("os: ");
		int num_os=sc.nextInt();
		
		System.out.print("데이터통신: ");
		int num_sg=sc.nextInt();
		
		System.out.print("소프트웨어공학: ");
		int num_dt=sc.nextInt();
		

		
		 // 답안
		 // 1. 총함이 60개 넘어야한다.
		//  2. 각과목이 8개 이상맞어야한다.
		  int totalScore = num_db+num_eg+num_os+num_sg+num_dt;
		  boolean isCheck = totalScore >=60;
		  
		  boolean isCheck2 = (num_db >=8 && num_eg >= 8 && num_os >= 8 && num_sg >= 8 && num_dt >= 8 );
		 
		  if(isCheck&&isCheck2) {
			  System.out.println("합격 입니다.!");
		  } else {
			  System.out.println("불합격 입니다.!");
		  }
		  
		/*
			String result="";
			boolean jumsu=(num_db >=8 && num_eg >= 8 && num_os >= 8 && num_sg >= 8 && num_dt >= 8 );
			boolean resultJumsu=(num_db+num_eg+num_os+num_sg+num_dt)>=60;
			 
			if(jumsu&&resultJumsu) {
				   result="합격";
			} else {
				result="불합격";
			}
			
			System.out.println(result+" 입니다.!");
		*/
	}
}
