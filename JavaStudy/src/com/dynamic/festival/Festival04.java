package com.dynamic.festival;
import java.util.Scanner;
/*
자바 패스티벌 4번문제
				(세 자리 수) * (세 자리 수)는 다음과 같이 계산된다.
				(1), (2)번을 입력 받아 결과 화면처럼 (3), (4), (5), (6)번을 출력하는 프로그램을 작성하시오
				  472......(1)
				x 385......(2)
			------------------
			    2360.......(3)
			   3776........(4)
			 1416..........(5)
			------------------
			 181720........(6)	
		< 결과화면 >
			첫번째 숫자 입력 472
			두번째 숫자 입력 385
			2360
			3776
			1416
			181720
*/
public class Festival04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("첫 번째 숫자 입력:");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 입력:");
			int num2 = sc.nextInt();
			
			System.out.println(num1*(num2%10));
			System.out.println(num1*((num2/10)%10));
			System.out.println(num1*(num2/100));
			System.out.println((num1*num2));
			
		sc.close();
	}
}
