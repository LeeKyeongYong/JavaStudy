package com.dynamic.festival;
import java.util.Scanner;
/*
자바 패스티벌 5번문제
				두 정수를 입력받아 최대공약수&최소공배수를출력하시오.
				  
		< 결과화면 >
			최대 공약수&최소공배수 구하기
			숫자1입력 >> 10
			숫자2입력 >> 15
			
			최대 공약수: 5
			최소 공배수: 30
*/
public class Festival05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("최대 공약수&최소 공백수 구하기");
		System.out.print("숫자 1 입력 >> ");
		int num1=sc.nextInt();
		System.out.print("숫자 2 입력 >> ");
		int num2=sc.nextInt();
		
		int min = 0;
        int max = 0;
        for(int i=2; i<num1&&i<num2; i++) {
        	if(num1%i==0&&num2%i==0) {
        		max=i;
        	}
        }
        
        min=num1*num2/max;
		System.out.print("최대 공약수: "+max);
		System.out.println();
		System.out.print("최소고앱수: "+min);
	}
}

