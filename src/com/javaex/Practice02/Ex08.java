package com.javaex.Practice01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요");
		
		
		System.out.println("숫자1:");
		int one = sc.nextInt();
		
		System.out.println("숫자2:");
		int two = sc.nextInt();
		
		System.out.println("숫자3:");
		int three = sc.nextInt();
		
		if (one< two && one< three) {
			System.out.println("가장 작은수는"+ one +"입니다.");
		}else if (two<one && two<three) {
			System.out.println("가장 작은수는"+ two + "입니다.");
		}else {
			System.out.println("가장 작은수는"+ three + "입니다.");
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
