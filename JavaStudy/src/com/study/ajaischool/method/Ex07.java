package com.study.ajaischool.method;
/*
Ex057
          10과 36의 메소드를 입력했을때 약수를 출력..
*/
public class Ex07 {
	public static void main(String[] args) {
		int startValue=10;
		int endValue=36;
		getDivisors(startValue,endValue);
	}
	public static void getDivisors(int startValue,int endValue) {
			for(int i=startValue; i<=endValue; i++) {
				System.out.print(i+"의 약수: ");
			   for(int j=1; j<=endValue; j++) {
				   if(i%j==0)
				   System.out.print (j+" ");
			   }
			   System.out.println();
			
			}
		
	}
}
