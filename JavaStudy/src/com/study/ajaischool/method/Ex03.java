package com.study.ajaischool.method;
import java.util.Scanner;

/*
 Exam052
 */
public class Ex03 {
	public static void main(String[] args) {
		/*
		 2개의 정수를 받아 2개의 숫자 중 10에 더가까운 수를 반환하는 메소드 close10을 만들어보세요.
		 (만약 두 숫자 모두 10과 차이가 같다면 0을 반환) 
		 */
		  int num1=12;
		  int num2=8;
		  int result=close10(num1,num2);
		  System.out.println("10에 가장 가까운수: "+result);
	}
	public static int close10(int num1,int num2) {
		int result=0;
		/*
		int resultNum1=Math.abs(10-num1);
		int resultNum2=Math.abs(10-num2);
		
		if(resultNum1>resultNum2) {
			result=num2;
		} else if(resultNum1==resultNum2){
			result=0;
		} else {
			result=num1;
		}
		
		*/
		
		int resultNum1=10-num1;
		int resultNum2=10-num2;
		
		//Math.abs(절대값 구하는 함수): 절대값 구하고싶은수.
		if(resultNum1<0) {
			resultNum1=-1*resultNum1;
		}
		
		if(resultNum2<0) {
			resultNum2=-1*resultNum2;
		}
		
		if(resultNum1>resultNum2) {
			result=num2;
		} else if(resultNum1==resultNum2){
			result=0;
		} else {
			result=num1;
		}
		
		return result;
	}
}
