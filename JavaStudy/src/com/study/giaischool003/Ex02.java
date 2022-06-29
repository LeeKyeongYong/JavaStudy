package com.study.giaischool003;

/*
  Exam12
*/
public class Ex02 {
	public static void main(String[] args) {
		 //증감연산자: 변수의 값을 1 올리거나 내림
		int num = 10;
		
		System.out.println(num++);
		System.out.println(num);
		
		int i=3;
		System.out.println(++i);
		System.out.println(i++);
		
		System.out.println("---------------------");
		int opr = 0;
		opr+=3;
		System.out.println(opr++); //3
		System.out.println(opr); //4
		System.out.println(++opr); //5
		System.out.println(opr); //5
		System.out.println(opr--); //5
		System.out.println(opr); //4
		System.out.println(--opr); //3
		System.out.println(opr); //3
		
		/*
		 * System.out.println(++num); 
		 * System.out.println(num++);
		 * System.out.println(++num); 
		 * System.out.println(--num);
		 * System.out.println(num--);
		 */
	}
}
