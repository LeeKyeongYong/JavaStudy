package com.study.giaischool003;
import java.util.Scanner;

/*
  Exam06
 */
public class Ex06 {
	public static void main(String[] args) {
		/*
		  정수를 입력받아 홀수인지 짝수인지 판별하세요!. 
		  
		////////////////////////////////////////
		 내가 푼것
		System.out.print("정수를 입력하세요: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String checkResult=(num%2 == 1)? "홀수" :"짝수";
		System.out.println(num+"는 (은)"+checkResult+" 입니다.");
		sc.close();
		/////////////////////////////////////
		 답안 
		 */
		 Scanner sc=new Scanner(System.in);
		 System.out.print("정수 입력:");
		 
		 int num = sc.nextInt();
		 String result=(num%2 ==0 ?"짝수":"홀수");
		 //ex01
		 System.out.println(num+"은(는) "+(num%2 ==0 ?"짝수":"홀수")+" 입니다.");
		 
		 //ex02
		 System.out.print(num+"은(는) ");
		 System.out.print(result);
		 System.out.println(" 입니다.");
		 
		 //ex03
		 System.out.println(num+"은(는) "+result+" 입니다.");
		 
		 sc.close();
	}
}
