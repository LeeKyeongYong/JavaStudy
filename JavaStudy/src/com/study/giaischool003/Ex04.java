package com.study.giaischool003;

/*
 Exam14 
 */
public class Ex04 {
	public static void main(String[] args) {
		//논리연산자
		//And(그리고) -> 좌항과 우황의 결과값이 true인 경우에만 true 나머지는 false
		// Or(또는, 이거나)
		// 좌항과 우항의 결과값중 하나만 true여도 결과는 true
		// 둘다 false경우에만 false
		
		System.out.println(3 > 2 && 5 > 1);
		System.out.println(1 > 7 && 3 > 1);
		System.out.println(1 > 0 || 5 > 7);
		System.out.println(5 > 40 || 10 < 2);
		
		boolean isCheck = 3 > 8;
		System.out.println(isCheck);
		
		//부정을 하고싶을경우
		System.out.println(!isCheck);
	}
}
