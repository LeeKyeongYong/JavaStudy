package com.study.giaischool002;
/*
   Exam06
 */
public class Exam03 {
	public static void main(String[] args) {
		//추가로 문자열을 저장할 수 있는 변수
		String name = "홍길동";
		//System.out.println(name);
		
		String myPen = "빨간색";
		String yourPen = "파란색";
		String changePen = myPen; // 바꾸기 위해 변수 하나 추가한다.
		
		System.out.println(myPen);
		System.out.println(yourPen);
		
		
		myPen = yourPen;
		yourPen = changePen;
		
		System.out.println(myPen);
		System.out.println(yourPen);
		
		/*
		     문재 아래에 코드를 작성해서
		     myPen안에 파란색이 들어가고
		     yourPen안에는 빨간색이 들어가게 해주세요
		     단 myPen = "파란색" 안됩니다
		*/
		
	}
}
