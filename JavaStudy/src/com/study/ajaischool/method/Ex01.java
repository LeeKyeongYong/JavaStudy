package com.study.ajaischool.method;
/*
 Exam051
 */
public class Ex01 {
	public static void main(String[] args) {
		/*
		  함수
		   
		 */
		int num1 = 3;
		int num2 = 5;
		
		//메소드 실행하다.
		//메소드 호출 --> 메소드 실행
		
		//메소드 전달 변수명과 상관 없이 안에 잇는 값만 넘어간다.
		int addNum=add(num1,num2);
		int minusNum=minus(3,5);
		int mulNum=gob(3,5);
		int divNum=nanugi(3,5);
		
		System.out.println("더하기결과: "+addNum);
		System.out.println("빼기결과: "+minusNum);
		System.out.println("곱하기결과: "+mulNum);
		System.out.println("나누기결과: "+divNum);
		
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
	
	public static int minus(int num1,int num2) {
		int result=num1-num2;
		return result;
	}
	
	public static int gob(int num1,int num2) {
		int result=num1*num2;
		return result;
	}
	
	public static int nanugi(int num1,int num2) {
		int result=num1/num2;
		return result;
	}
}
