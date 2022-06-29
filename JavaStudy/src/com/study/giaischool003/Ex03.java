package com.study.giaischool003;

/*
   Exam13 
 */
public class Ex03 {
	public static void main(String[] args) {
		 // 비교연산자
		 // 좌항과 우항의 값을 비교하는것
		 // 결과값은 무조건 true 또는 false로 나온다.
		
		int num1 = 3;
		int num2 = 7;
		int num3 = 3;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num3);
		System.out.println(num1 >= num3);
		System.out.println(num1 == num3);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		String text1="사과";
		String text2="사과";//text2="딸기";
		
		System.out.println(text1.equals(text2));
	}
}
