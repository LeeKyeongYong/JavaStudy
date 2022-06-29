package com.study.giaischool003;
import java.util.Scanner;

/*
  교재 94 조건문 
  Exam19_숙제
  int타입의 변수 num을 선언하고 키보드로 값을 입력받으세요.
  만약 num이 3의배수이면서 5의 배수라면 "3과 5의 배수입니다" 라고 출력하는 프로그램을 만드세요.
  
 */
public class Ex09_report {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("3과 5의 배수인지 입력해주세요: ");
		int num=sc.nextInt();
		
		if(num%3==0&&num%5==0) {
			System.out.print("3과 5의 배수입니다");
		} else {
			System.out.print("3과 5의 배수가 아닙니다.");
		}
	}
}
