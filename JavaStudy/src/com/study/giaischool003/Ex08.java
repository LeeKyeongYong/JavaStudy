package com.study.giaischool003;
import java.util.Scanner;

/*
 * Exam18
 * 
 */
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 (농구공 상자 더하기)
		    - 농구공을 담기 위해 필요한 상자의 개수를 구하세요.
		      상자하나에는 농구공이 5개 들어갈수 있습니다. 만일 농구공이 '23'개 라면 필요한 상자의 개수는 '5'개 입니다.
		 //내가한것
		System.out.print("농구공의 갯수를 입력해주세요: ");
		int ball_num = sc.nextInt();
		int result = (ball_num%5 > 0) ? (ball_num/5)+1 : (ball_num/5);
		System.out.println("필요한 상자의 개수: "+result);
		
		//정답
		 */
		System.out.print("농구공의 갯수를 입력해주세요: ");
		int ball = sc.nextInt();
		int result=ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
		System.out.println("필요한 상자의 개수: "+result);
		sc.close();
	}
}
