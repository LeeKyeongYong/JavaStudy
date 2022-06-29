package com.study.giaischool002;
/*
   Exam04
 */
public class Exam01 {
	public static void main(String[] args) {
		//변수 : 데이터를 저장하는 임시적인 공간
		// 1. 정수데이터 타입
		// byte(8bit) -128 ~ 128
		byte num = 127;
		System.out.println(num);
		
		System.out.println(30);
		System.out.println(30);
		System.out.println(30);
		System.out.println(30);
		System.out.println(30);
		System.out.println(30);
		
		System.out.println("======================================");
		
		// short(2byte) 
		short num2 = 3000;
		
		//Integer(int <4byte>) 
		int num3=20000000;
		
		//long(8byte)
		long num4 = 1222222222;
		
		//2. 실수데이터 타입
		//float(4byte)
		float num5=3.14f;// num = (float)3.14; dobule로 인식하기때문에 형변환을 해줘야한다
		//double(8byte)
		double num6 = 3.141592;
		
		//3.논리타입(1bit or 1byte)
		boolean isCheck = true;
		
		//4.문자타입
		//char (2byte)
		char m = '박';
		char m2  = 65;
		System.out.println(m2);
	}
}
