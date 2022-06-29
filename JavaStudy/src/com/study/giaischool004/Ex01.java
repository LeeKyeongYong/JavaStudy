package com.study.giaischool004;
import java.util.Scanner;

/*
    Exam020 
    답안)
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		int num=sc.nextInt();
		if(num%3==0&&num%5==0) {
			System.out.println("3과 5의 배수가 아닙니다.");
		} else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
	}
}
