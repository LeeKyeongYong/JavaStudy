package com.study.giaischool007;
import java.util.Scanner;

/*
Exam035

*/
public class Ex03 {
	public static void main(String[] args) {
		/*
		for(int i=1; i<10; i++) {
			System.out.println(2+" * "+i+" = "+(2*i));
		}
		*/
		Scanner sc=new Scanner(System.in);
		System.out.print("단 입력 ");
		int num=sc.nextInt();
		System.out.println("범위 입력: ");
		int num2=sc.nextInt();
		for( int i=1; i<=num2; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}
