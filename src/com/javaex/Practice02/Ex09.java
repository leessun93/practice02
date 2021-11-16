package com.javaex.Practice01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int one = sc.nextInt();
		
		
		System.out.println("두번째 숫자:");
		int two = sc.nextInt();
				
		if(one>=two && one%two==0) {
			System.out.println(two +"는" + one +"의 약수입니다.");
		}else if(one>two && one%two!=0) {
			System.out.println(two +"는"+ one +"의 약수가 아닙니다.");
		}else if(two>=one && two%one==0) {
			System.out.println(one + "는"+ two +"의 약수입니다.");
		}else if(two>one && two%one!=0) {
			System.out.println(one + "는"+ two +"의 약수가 아닙니다.");
		}
		
		sc.close();
	}

}
