package com.study.giaischool009;
import java.util.Arrays;
import java.util.Random;

/*
 Exam045
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		// 랜덤을 활용해서 lotto안에 중복되지 않은 6개 숫자를 넣은후 콘솔창에 출력하시오
		/*
		 * 1. 번호를 다 뽑고나서 중복이 있으면 다시 전체 뽑기
		 */
		Random rnd = new Random();
		boolean isCheck = true;// 로또 중복확인용 변수

		while (isCheck) {// 무한루프
			isCheck = true;// ischeck 초기화
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) rnd.nextInt(45) + 1;
				// System.out.print(lotto[i]+" ");//내가한거
			}
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] == lotto[j]) { // 하나라도 중복값이 존재한다면...
						isCheck = false;
					}
				}
			}
			if (isCheck) {
				break;
			}

		}
		// System.out.println();
		System.out.println(Arrays.toString(lotto)); // 정담
	}
}
