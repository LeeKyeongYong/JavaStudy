package com.study.giaischool003;
import java.util.Scanner;

/*
  교재 94 조건문 
  Exam19
  1. 조건문이 무엇인지 알고 조건문의 종류를 안다.
  2. 다중 if문과 단순 if문 여러개와의 차이점을 안다.
    조건문의 종류
    if문, 다중if문, switch문, 삼항연산자
 */
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//성인 판별 프로그램
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		if(age>=20) { //(조건이 맞는지 확인을 한다)
			
			System.out.println("성인입니다.");
			
		} else { // 성인이 아닌경우를 출력해주세요 (조건에서 벗어나는 경우)
			
			System.out.println("미성년자입니다.");
			
		}
	}
}
