package com.study.giaischool006;
import java.util.Scanner;

/*
Exam028
*/
public class Ex01 {
	public static void main(String[] args) {
     /*
      0 부터 100 까지의 점수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지
      입력된 자료의 합계와 평균을 구하시오. 
      */
		
		Scanner sc =new Scanner(System.in);
		

		int num=0; //입력받은 변수저장
		int sum=0; //입력받은 변수의 합계
		float avg=0.0f; //합계구한 변수의 평균
		int count=0; //입력받은 변수 count처리
		
		/*
		 while(num<=100){
		  	System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			sum += num;
			count++;
		  }
		  sum-=num;
		  count--;
		 */
		
		while(true) { //조건에 맞을때까지 계속 돌기
			//while문은 반복적으로 데이터 대입후 계속 돌다가 while 조건문을 확인한다
			System.out.println("숫자를 입력하세요");
			num=sc.nextInt();
			
			if(num>=100) { // 입력받은 수가 100보다 클경우 합계와 평균을 구한다.
			  avg=(float)sum/count;	
			  System.out.println("합계: "+sum);
			  System.out.println("평균: "+avg);
				break;
			}
			
			sum+=num; // 받은수들을 sum변수에 저장한다.
			count++; //1씩 후위연산처리
		}
		//답안
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/(double)count);
		
		sc.close(); //scanner 종료시켜라.
		
	}
}
