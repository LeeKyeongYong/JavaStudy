package com.dynamic.festival;
import java.util.Scanner;
/*
자바 패스티벌 2번문제
				윤년을 구하는 프로그램을 작성하시오.
				 - 윤년이란 2월에 29일이 있는 날을 말한다.
				 - 4의 배수이면서 100의 배수가 아닐 때는 윤년이다.
				 - 400의 배수일때 윤년이다.
		< 결과화면 >
			정수입력: 456
			결과:    400
*/
public class Festival02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력 >>");
		int num=sc.nextInt();
		if(num % 4 == 0 && num % 100 != 0) {
			System.out.println("윤년");
		} else if(num % 100 != 0 || num % 400 == 0) {
			System.out.println("윤년");
		} else {//윤년이아님
			System.out.println("윤년이 아님");
		}
		
		sc.close();
	}
}
