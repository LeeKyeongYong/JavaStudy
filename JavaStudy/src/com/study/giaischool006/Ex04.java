package com.study.giaischool006;
/*
Exam030
*/
public class Ex04 {
	public static void main(String[] args) {
			/*
			  for문
			     -주로 반복횟수가 정해진 경우에 사용함. 
			     
			     for(초기화구문; 검사조건; 반복후작업){
			     	검사조건이 true일 동안 실행될 로직
			     }
			     
			     for문을 활용하여 1부터 10까지 출력
			
			for( int i=1; i<=10; i++) {
				System.out.println("출력: "+i);
			}
			
			 21부터 57까지 출력
			
			for( int i=21; i<=57; i++) {
				System.out.print("출력: "+i+" ");
				if(i%10==0) {
					System.out.println();
				}
			}
			
			 96부터 53까지 출력
		
		for( int i=96; i>=53; i--) {
			System.out.print("출력: "+i+" ");
			if(i%10==0) {
				System.out.println();
			}
		}
		  for문을 활용하여 21에서 57까지의 수 중 홀수만 출력
		 	*/
		for( int i=21; i<=57; i++) {
			
			if(i%2==1) {
				System.out.print("출력: "+i+" ");
				  if(i%10==1) {
						System.out.println();
					}
			}
			
		}
		
	}
}
