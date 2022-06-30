package com.study.giaischool008;
import java.util.Scanner;

/*
Exam038

*/
public class Ex01 {
	public static void main(String[] args) {
		//돌아온 별찍기.
		/*
		    *
		   **
		  ***
		 ****
		*****
		*힌트, 어떠한 문자를 출력하면 반드시 위쪽부터 출력이 된다.
		*어떻게 별을 띄어서 출력을 했을까?
		*어라? 빈공간이 아닐까?
		*빈공간이 하나씩 줄어들고 있다.
		*첫번째줄
		*System.out.print(" ");
		*/
		for(int i=0; i<=5; i++) {
			for(int k=5; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	    명품자바 배열  1)
	    Scanner sc=new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		System.out.println("약수 5개를 입력하세요");
		for(int i=0; i<intArray.length; i++) {
			intArray[i]=sc.nextInt();
			if(intArray[i]>max) 
				max = intArray[i];
		}
			System.out.println("가장 큰수는 "+max+"입니다.");
		sc.close();
	    
	    명품자바 배열  2)
	    
	 */
	
}