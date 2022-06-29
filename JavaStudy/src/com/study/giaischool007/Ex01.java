package com.study.giaischool007;


/*
Exam033

*/
public class Ex01 {
	public static void main(String[] args) {
		/*
		 
		 for문 예제
		 1 부터 50까지 369 게임을 출력해보세요.
		  - 끝자리 수가 3,6,9일 때는 박수 를 출력
		  - 끝짜리 수가 5일때 으악 을 출력
		  - 그외의 나머지 수는 그냥 숫자 출력
		  
		 */
		for(int i=1; i<=50; i++) {
			if(i%11==0) {
				System.out.println();
			}
			if(i%10==3||i%10==6||i%10==9) {
				System.out.print("박수 ");
			}
			else if(i%10==5) {
				System.out.print("으악 ");
			} else {
				System.out.print(i+" ");
			}
			
		}
	}
}
