package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam021 
 */
public class Ex02 {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("나이를 입력해주세요 >>");
		int age =sc.nextInt();
		if (age >= 20) {
		 System.out.println("성인 입니다.");	
		} else {
		 System.out.println("미성년자 입니다.");
		}
	}
}
