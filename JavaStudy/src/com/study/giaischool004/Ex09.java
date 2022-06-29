package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam024 
 */

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		switch (num%2) {
		
		case 1: 
			System.out.println("홀수입니다");
		    break;
		
		default:
			System.out.println("짝수입니다.");
			break;
		}
		sc.close();
	}
}
