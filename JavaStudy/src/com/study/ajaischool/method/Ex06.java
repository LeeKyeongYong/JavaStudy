package com.study.ajaischool.method;


/*
  Ex55
  	- 두개의 정수를 인자(매개변수)로 넘겨받아 앞의 정수가 뒤의 정수를 나누어지는지를 판별하는 메소드 isDivide()를 작성하세요.
  	  이때 나누어지면 true,나누어지지 않으면 false를 반환함.
 */

public class Ex06 {
	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		boolean result=isDivide(num1,num2);
		System.out.println("결과확인: "+result);
	}
	public static boolean isDivide(int num1,int num2) {
			boolean result=false;
		    //if(num1%2==0&&num2%2==0) {
			if(num1%num2==0) {
				result=true;
			} else {
				result=false;
			}
		return result;
	}
}
