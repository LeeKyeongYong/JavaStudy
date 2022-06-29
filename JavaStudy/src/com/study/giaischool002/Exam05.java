package com.study.giaischool002;
/*
   Exam08
 */
public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 3;
		
		/*
		 * System.out.println(num1 + num2); System.out.println(num1 - num2);
		 * System.out.println(num1 * num2); System.out.println(num1 / num2); //몫
		 * System.out.println(num1 % num2); //나머지
		*/	
		int num3=7;
		int num4=3;
		double num5=3;
		System.out.println(num3/num4);
		System.out.println(num3/num5);
		
		int num6 = 10;
		String num7="88";
		System.out.println(num6+num7);
		System.out.println(num6+Integer.parseInt(num7));
		
		String num8="5";
		int num9=7;
		int num10=2;
		System.out.println(num8+num9+num10);
		
		/*
		 * 산술자예제 아래 1번,2번,3번의 출력값을 예상해 보세요
		 */
		String a=10+7+"";
		String b=8+""+2;
		String c=""+5+2;
		System.out.println(a+"\n"+b+"\n"+c);
	}

}
