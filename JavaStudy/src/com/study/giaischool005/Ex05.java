package com.study.giaischool005;
import java.util.Scanner;

/*
Exam026
*/
public class Ex05 {
	public static void main(String[] args) {
		/*
		 	다이어트  관리프로그램
		 	1. 현재 몸무게와 목표몸무게를 입력받고 주차 별 감량 몸무게를 입력받으세요.
		 	2. 목표몸무게를 달성하면 축하한다는 문구를 출력하고 입력을 멈추세요!.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("현재몸무게: ");
		int num =sc.nextInt();
		System.out.print("목표몸무게: ");
		int a,goal=sc.nextInt();
		
		int result=0;
		
		//for문을 사용할경우
		/*
		for(int i=1; i<5; i++) {
			System.out.println(i+"주차 감량몸무게: "+sc.nextInt());
			result+=sc.nextInt();
		}
		int b=(num-result);
		if(num>b) {
			System.out.println(b+"kg 달성 축하합니다!!");
		}
		*/
		
		//while문을 사용할경우
		int j=1;
		int minus=0;
		while(goal > result) {
			System.out.print(j+" 주차 감량 몸무게: ");
			minus+=sc.nextInt();
			result=(num-minus);
			j++;
		}
		
		
		if( result < goal) {
			System.out.println(result+ "kg 달성!! 축하합니다");
		} else {
			System.out.println("감량실패입니다. 현재몸무게는: "+result);
		}
	}
}
