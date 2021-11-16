package com.javaex.Practice01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		//int age = 15;
		
		//if(0 < age < 18) {    // 한번에 두개의 식을 쓸 수 없다.
			
		if(0 < age && age < 18) {
		
			System.out.println("청소년 입니다.");
		}
		sc.close();
}
}
