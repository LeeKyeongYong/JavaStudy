package com.study.giaischool002;
import java.util.Scanner;

/*
 Exam011
 */
public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt();
		int hour=totalSecond/3600;
		totalSecond = (totalSecond%3600);
		int minute=totalSecond / 60;
		int second=totalSecond%60;
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		sc.close();
	}
}
