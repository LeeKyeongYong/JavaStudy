package com.study.giaischool005;
import java.util.Random;
import java.util.Scanner;

 
/*
Exam027

*/
public class Ex07 {
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
			 */
		
		Random rnd=new Random();
		Scanner sc =new Scanner(System.in);

		//난수 생성
		int num=rnd.nextInt(10)+1;
		//System.out.println(num);

		//범위를 주고싶을때...
		int num1=rnd.nextInt(10)+1;
		//System.out.println(num1);

		String result1="";//출력문자
		int inputResult=0;//사용자입력내용
		int result2=0;//비교값
		String choice="";
		
		System.out.println("==Plus Game ===");
		while(true) {
			
			result1=num+" + "+num1+" = ";
			result2=num+num1;
			System.out.print(result1);
			
			inputResult = sc.nextInt();
			
			
			if(result2 != inputResult) {
				System.out.println("Fail");
				System.out.print("계속하시겠습니까? >> ");
				choice = sc.next();
				
				if("N".equals(choice.toUpperCase())) {
					System.out.println("종료하겠습니다.");
					break;
				} 
				
			} else {
				System.out.println("Success");//성공
				
				//다시선언
				num=rnd.nextInt(10)+1;
				num1=rnd.nextInt(10)+1;
			}
		}
		sc.close();
	}
}