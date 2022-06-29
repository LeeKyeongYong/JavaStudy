package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam022 
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력해주세요.");
		int num=sc.nextInt();
		String result=""; //지역변수
		if(num%2==1) {
			result="홀수";
		} else  {
			result="짝수";
		}
		sc.close();//Scanner 종료
		System.out.println(num+"는 (은)"+result+" 입니다.");
	}
}
