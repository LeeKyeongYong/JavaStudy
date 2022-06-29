package com.study.giaischool004;
import java.util.Scanner;

/*
 Exam023 
  	다음은 에버랜드 입장료 계산프로그램입니다.
  	기본료는 5000원이며 인원수에 따라 지불해야하는 프로그램을 만들어보세요
  	단, 미성년자인 경우 50%할인이 적용됩니다.
 */
public class Ex05 {
	public static void main(String[] args) {
			
		System.out.println("===에버랜드에 오신것을 환영합니다===");
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 말씀해주세요 ");
		int age = sc.nextInt();
		
		System.out.print("인원수를 말씀해주세요 ");
		int memberCount = sc.nextInt();
		
		//정답
		double totalMoney = memberCount*5000;
		
		if(age<20) {
			totalMoney*=0.5;
		}
		
//		double totalMoney=0;
//		if(age>=20) {
//			totalMoney= 5000*memberCount;
//		} else {
//			totalMoney= (5000*memberCount)*0.5;
//		}
		
		System.out.println("총 "+(int)totalMoney+"원 입니다.");
	}
}
