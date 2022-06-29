package com.study.giaischool005;
import java.util.Random;
import java.util.Scanner;

 
/*
Exam027

*/
public class Ex7_report {
	public static void main(String[] args) {

			/*
			 1. 사용자가 원할때까지 반복
			 2. Fail 후 계속하기를 선택할 시 기존 숫자를 출력
			  === Plus Game ==
			    4 + 9 = 13;
			 3. 입력한 정답과 실제 정답이 일치하게되면 새로운 문자를 보여준다.
			 4. 정답이 틀렸을때는 다시하겠습니까? 물어보며 
			     Y를 입력한다면 전에 틀렸던 문제가 다시나오며
			     N을 입력하면 게임이 종료가된다
			     
			     답안....
			 */
		Scanner sc =new Scanner(System.in);
		Random r=new Random();
		
		//난수 두개(문제)
		int num1 = r.nextInt(10)+1;
		int num2 = r.nextInt(10)+1;
		
		int sum = num1+num2; //정담비교하기위해
		
		System.out.println("===Plus Game===");
		
		while(true) {//무한루프되어야한다.
			
		System.out.print(num1+" + "+num2+" = ");
		
		int answer = sc.nextInt(); //사용자의 답을 입력받는다.
		
		String choice ="";
		
		if(sum == answer) {
			 System.out.println("Success!!!");
			 
				//난수 두개(문제)
				num1 = r.nextInt(10)+1;
				num2 = r.nextInt(10)+1;
				
				sum = num1+num2; //정담비교하기위해
				
		} else {
			System.out.println("Fail....");
			
			System.out.println("다시 하시겠습니까?? >> ");
			choice =sc.next(); //상태여부 다시받는다.
			
			if(choice.toUpperCase().equals("N")) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		}
		sc.close();//스캐너 종료시킨다.
	}
}