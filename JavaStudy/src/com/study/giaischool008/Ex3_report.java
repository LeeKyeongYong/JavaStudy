package com.study.giaischool008;

public class Ex3_report {
	public static void main(String[] args) {
		/*
		 for문 예제
		 1)
		    1~ 1000 까지 숫자중 완전 수인 숫자를 모두 출력하세요
		    (완전수 =  자신의 약수 중에서 자신을제외한 모든 약수의 합이 자신과 같다면 완전수)
		    
		    ex>
		  	 6의 약수 1,2,3,6
		  	 - 자신을 제외한 약수의 합 1+2+3
		  	 - 자신과 자신을 제외한 약수의 합이 같다
		  	 6 -> 1+2+3
		   
		 */
		int sum=0;
		for(int i=1; i<=1000; i++) {
		  for(int j=1; j<=i; j++) {
			if(i%j==0) {
				sum+=j;//약수의 합
		    }
		  }
		  if((sum-i)==i) {//자기자신을 제거...
			  System.out.println("과제: "+i);
		  } 
		  sum=0;
		}
	}
}
