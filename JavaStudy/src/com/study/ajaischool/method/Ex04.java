package com.study.ajaischool.method;
/*
 Exam053
 */
public class Ex04 {
	public static void main(String[] args) {
		int base=3;
		int n=3;
		int result=powerN(base,n);
		System.out.println("결과 확인: "+result);
	}
	public static int powerN(int base,int n) {
		int result=1;
		
		//result=(int) Math.pow(base,n);
		for(int i=1; i<=n; i++) {
			
			result*=base;
		}
		return result;
	}
}
