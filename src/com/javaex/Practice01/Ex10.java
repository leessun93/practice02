package com.javaex.Practice01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번 (정수)를 입력해주세요");
		System.out.print("사번:");
		int companynum = sc.nextInt();
		
		if (companynum%3==0) {
			System.out.println("A팀입니다.");
		}else if(companynum%3==1) {
			System.out.println("b팀입니다.");
		}else if(companynum%3==2) {
			System.out.println("c팀입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
