package com.study.ajaischool.method;
/*
 Exam051
 */
public class Ex01 {
	public static void main(String[] args) {
		/*
		  함수
		   
		 */
		int num1 = 10;
		int num2 = 20;
		
		//메소드 실행하다.
		System.out.println("합: "+add(num1,num2));
	}
	//더하기 메소드 작성  부분
	//public : 접근제한자(모든 접근하게 허용하겠습니다.)
	//static : 공유하다 add
	//int : 반환타입
	//add : 메소드 이름
	//(int num1,int num2): 필요재료 (매개변수 or 전달 값)
	//{ 실행 로직 }
	//return : 결과값 반환 명령어
	public static int add(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
}
