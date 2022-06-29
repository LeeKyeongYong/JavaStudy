package com.study.giaischool005;
import java.util.Random;
import java.util.Scanner;

/*
Exam027
*/
public class Ex06 {
	public static void main(String[] args) {
		Random rnd=new Random();
		
		//난수 생성
		int num=rnd.nextInt();
		System.out.println(num);
		
		//범위를 주고싶을때...
		int num1=rnd.nextInt(10)+1;
		System.out.println(num1);
		
		int num2=rnd.nextInt(10)+1;
		System.out.println(num1+" + "+num2+" = ");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자입력: ");
		String str=sc.next();
		System.out.println("출력문자: "+str);
		
		sc.close();
	}
}
