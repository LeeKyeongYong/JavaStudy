package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam025 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수입력: ");
		int totalScore = sc.nextInt();
		int jumsu=totalScore/10;
		switch (jumsu) {
		
		case 10: 
		case 9: 
			System.out.println("A학점입니다");
		    break;
		    
		case 8: 
			System.out.println("B학점입니다.");
		    break; 
		    
		case 7: 
			System.out.println("C학점입니다");
		    break;
		    
		case 6:
		case 5:
		case 4:
			System.out.println("D학점입니다");
		    break;  
		
		default:
			System.out.println("F학점입니다..");
			break;
		}
		sc.close();
	}
}
