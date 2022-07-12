package com.dynamic.festival;
import java.util.Scanner;
/*
자바 패스티벌 6번문제
				8자리 정수를 입력받아 반복문을 활용하여입력받은 정수의 합을 구하여 출력하는프로그램을 작성하시오.
				  
		< 결과화면 >
			정수입력 : 25462581
			합은 33 입니다.
			
			정수입력 : 12345678
			합은 36 입니다.
			
			정수입력 : 45159873
			합은 42 입니다.
			
*/
public class Festival06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum+=(num%10);
			num/=10;
		}
		System.out.println("합은: "+sum+"입니다.");
		sc.close();
	}
}
