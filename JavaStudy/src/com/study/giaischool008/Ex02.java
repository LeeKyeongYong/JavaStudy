package com.study.giaischool008;
import java.util.Scanner;

/*

Exam038

*/
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		System.out.println(num+" 의 약수: ");
		/*
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		*/
		
		//답안
		for(int i=1; i<=10; i++) {
			if(10%i==0)
			System.out.print(i+" ");
		}
		sc.close();
	}
}