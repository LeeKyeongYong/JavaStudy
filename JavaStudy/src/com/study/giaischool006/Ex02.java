package com.study.giaischool006;

/*
Exam029
*/
public class Ex02 {
	public static void main(String[] args) {
		//do-while: 반복횟수가 지정되지 않았을때 사용된다.?
		//무조건 한번은 실행하고 반복조건을 살펴본다.
		//1 부터 10까지 출력
		
		int num=1;
		do {
			System.out.print("실행: "+num);
			num++;
			System.out.println();
		} while (num<=10);
			
	}
}
