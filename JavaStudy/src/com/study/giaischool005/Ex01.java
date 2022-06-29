package com.study.giaischool005;
import java.util.Scanner;

/*
  Exam026 
 */
public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 잔돈을 줄때 천원, 오백원, 백원짜리를 몇개 줘야하는지 계산해 보세요!.
		 * 금액을 고르세요: 8500
		 * 메뉴를 고르세요
		 * 1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> 1
		 * 잔돈: 7700원
		 * 천원 7개, 오백원: 1개, 백원: 2개
		 */
		
		int money=0,menu=0,chwon=0,goback=0,back=0,resultMoney=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 고르세요: ");
		money=sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		menu=sc.nextInt();
		
		switch (menu) {
		case 1: {
			resultMoney = money-800;
			break;
			
		} case 2: {
			resultMoney = money-500;
			break;
			
		} case 3: {
			resultMoney = money-1500;
			break;
		}
		default:
			System.out.println("잘못입력했습니다 환불해드립니다.");
		}
		
		chwon = resultMoney / 1000;
		goback = (resultMoney % 1000)/500;
		back = (resultMoney % 500)/100;
		
		System.out.println("잔돈: "+resultMoney);
		System.out.println("천원: "+chwon+"개, 오백원: "+goback+"개, 백원: "+back+"개");
		
		/*
		  정답
		 */
		 if (menu==1) {
			 money-=800;
		} else if (menu==2) {
			 money-=500;
		} else {
			 money-=1500;
		}
		 
		 System.out.println();
		 System.out.println("잔돈: "+money);
		 
		 int a = money/1000;
		 
		 money = money%1000;
		 int b = money/500;
		 
		 money = money%500;
		 int c = money/100;
		 
         System.out.println("천원: "+a+"개, 오백원: "+b+"개, 백원: "+c+"개");
	}
}