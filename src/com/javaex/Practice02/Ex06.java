package com.javaex.Practice01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("첫번째 숫자:");
		int one = sc.nextInt();
		System.out.print("두번째 숫자:");
		int two = sc.nextInt();
		
		if(one>two) {
			System.out.println("큰수" + one + "작은수" + two + "입니다.");
		}else if(two>one) {
			System.out.println("큰수" + two + "작은수" + one+ "입니다.");
		}else {
			System.out.println("큰수" + one+ "작은수" + two + "입니다." );
		}
		
		sc.close();

	}

}
