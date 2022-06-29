package com.study.giaischool006;
import java.util.Scanner;

/*
      문제풀이>>
         A-> A B C D E
         D-> D E F G H
         X-> X Y Z
         힌트: 아스키코드
 */
public class Ex06_report {
	public static void main(String[] args) {
		
		//알파벳을 입력한다.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳입력: ");
		char c=sc.next().charAt(0);
		
		int change=(int) c;
		int result=0; // 최종값 담는 변수
		String strChange="";
		
		System.out.print(c+" -> ");
		
		//답안
		//예시001
		System.out.println((char)+(c+1));
		
		//반복문을 돌리자
		for(int i=0; i <= 4; i++) {
			
			if(c+i<=90) {
				System.out.print((char)+(c+i)+" ");
			}
		}
		
		/*
		for(int i=0; i<5; i++) {
			result=(change+i);
			  if(result>64&&result<91||result>96&&result<123) { //대문자 65 ~ 90 / 소문자 97 ~ 122
				System.out.print((char)result+" ");
			}
		}
		*/
		System.out.println();
		sc.close();
	}
}
