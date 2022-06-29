package com.study.giaischool005;
/*
Exam025
*/
public class Ex04 {
	public static void main(String[] args) {
		
		//4부터 99까지 홀수만 출력하시오
		int num=4;
		while(num<=99) {
			if(num%2==1) {
				//출력
					System.out.print(num+" ");
					
					//길어서 정리
					if(num%15==0) {
						System.out.println();
					}
			}
			
			num++;
		}
	}
}
