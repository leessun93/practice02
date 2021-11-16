package com.javaex.Practice01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int one = sc.nextInt();
		
		
		System.out.println("두번째 숫자:");
		int two = sc.nextInt();
		
		if(one>two) {
			System.out.println("몫 :" + one/two);
			System.out.println("나머지 :"+ one%two);
		}else if(two>one) {
			System.out.println("몫 :" + two/one);
			System.out.println("나머지 :"+ two%one);
		}else {
			System.out.println("몫 :" + one/two);
			System.out.println("나머지 :"+ one%two);
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
