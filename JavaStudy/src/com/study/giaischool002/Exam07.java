package com.study.giaischool002;
import java.util.Scanner;

/*
   Exam10
*/
public class Exam07 {
	public static void main(String[] args) {
		// 키보드로 부터 데이터 입력받기
		Scanner sc=new Scanner(System.in);
		//정수를 입력받을때 sc.nextInt()
		
		// 다음과 같이 출력하게 해주세요.
		// 871 입력 >>
		// 일의자리를 제외한 값은 870 입니다.
		// 459 입력 >>
		// 일의자리를 제외한 값은 450 입니다
		System.out.print("숫자를 입력해주세요 >> ");
		int num=sc.nextInt();
		num -= num%10;
		System.out.println("\n입력받은 숫자는: "+num+" 입니다.");
		sc.close(); // Stream 종료시킨다.

		
	}
}
