package com.study.giaischool002;
/*
 * 
 * Exam09
 * 
 */
public class Exam06 {
	public static void main(String[] args) {
		/*
		 * num1,num2의 더하기,빼기,곱하기,나누기 결과값을 출력하세요!
		 * (단, 나누기 결과값은 아래의 실수로 표현하세요.)
		 */
		int num1=7;
		int num2=3;
		
		System.out.println("더하기 결과: "+(num1+num2));
		System.out.println("빼기 결과: "+(num1-num2));
		System.out.println("곱하기 결과: "+(num1*num2));
		System.out.println("나누기 결과: "+(int)((double)(num1/(double)num2)*100)*0.01);
		/*
		 double result1 = num1 / (double)num2;
		 int result2 = (int)(result1 * 100);
		 System.out.println("나누기 결과: "+(int)(result*100)); 
		 */

		System.out.println("나누기 결과(소수점 처리): "+(double)Math.round(num1/num2));
		System.out.println("나누기 결과(소수점 처리): "+String.format("%.2f",(double)(num1/(double)num2)));
		System.out.println("-------------------------------");
		
	}
}
