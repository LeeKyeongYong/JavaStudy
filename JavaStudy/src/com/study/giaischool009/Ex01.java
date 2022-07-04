package com.study.giaischool009;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("구구단을 외자! 구구단을 외자!");
		int num1 = r.nextInt(8) + 2;
		int num2 = r.nextInt(9) + 1;
		int result = num1 * num2;
		String choice = "";
		int count = 3;
		int best = 0;
		int now = 0;

		while (true) {
			System.out.print(num1 + " * " + num2 + " = ");
			int inputUser = sc.nextInt();
			if (result != inputUser) {
				count--;
				System.out.println("땡! 틀렸습니다.");
				System.out.println("남은 목숨 : "+count);
				if (count == 0) {
                    if (now > best) {
					    best = now;
				    }
				    now = 0;
					if (now > best) {
						System.out.println("최고기록 갱신!! " + now + "점!");
					}

					System.out.println("목숨을  모두 소진하였습니다. 다시 하시겠습니까? (Y|N) >> ");
					choice = sc.next();

					if (choice.equals("Y")) {
						count = 3;
					} else {
						break;
					}
				}

				

			} else {
				System.out.println("정답!!!!");
				num1 = r.nextInt(8) + 2;
				num2 = r.nextInt(9) + 1;
				result = num1 * num2;
				now++;
			}

		}
	}

}
