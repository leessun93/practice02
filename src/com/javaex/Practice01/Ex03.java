package com.javaex.Practice01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		}else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		sc.close();
	}

}

//결과 15=2번그룹 19=2번그룹 20=2번그룹 21은 1번그룹 100=1번그룹
