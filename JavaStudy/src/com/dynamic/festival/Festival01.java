package com.dynamic.festival;
import java.util.Scanner;
/*
	자바 패스티벌 1번문제
 				정수를 입력받아십의자리 이하를 버리는 코드를 작성하시오.
 		< 결과화면 >
 			정수입력: 456
 			결과:    400
*/
public class Festival01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num=sc.nextInt();
		System.out.println("결과: "+(num/100)*100);
		sc.close();
	}
}
