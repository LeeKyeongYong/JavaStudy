package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam024 
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		  int타입의 변수는 grade를 선언하고 키보드값을 입력받으세요..
		  grade가 90점 이상이면 'A학점입니다'
		  80점 이상 90미만이면 'B학점입니다.'
		  70이상 80점 미만이면 'C학점입니다.' 를 출력하세요
		*/
		/*
		System.out.print("점수를 입력해주세요: ");
		int grade=sc.nextInt();
		if (grade >= 90) {
			System.out.println("A학점입니다. ");
		} else if (grade >= 80) {
			System.out.println("B학점입니다 . ");
		} else if (grade >= 70) {
			System.out.println("C학점입니다.. ");
		} else {
			System.out.println("F입니다.. ");
		}
		
		정답:
		*/
		System.out.print("점수를 입력: ");
		int grade=sc.nextInt();
		if (grade>=90) {
			System.out.println("A학점입니다. ");
		} else if (grade < 90 && grade >= 80) {
			System.out.println("B학점입니다. ");
		} else if (grade < 80 && grade >= 70) {
			System.out.println("C학점입니다.. ");
		} else {
			System.out.println("F입니다.. ");
		}
	}
}
