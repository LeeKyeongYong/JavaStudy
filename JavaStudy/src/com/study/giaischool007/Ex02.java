package com.study.giaischool007;
/*
Exam034

*/
public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 for문을 사용해서 1에서 100까지 출력하여 다음과 같이 출력하시오
		 예) 짝수는 음수 홀수는 양수 
		 */
		for(int i=1; i<101; i++) {
			if(i%11==0) {
				System.out.println();
			}
			if(i%2==0) {
				//내가한거 실수...
				System.out.print("-"+i+" ");
				//답안
				System.out.print((i*-1)+" ");
			} else {
				System.out.print(i+" ");
			}
			
		}
	}
}
