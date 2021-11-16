package com.javaex.Practice01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 :");
		double harmsu = sc.nextInt();
		
		double minssick = (harmsu*harmsu*harmsu)-9*harmsu+2;
		double plussick = 7*harmsu +2;
		
		if(harmsu>0) {
			System.out.println("계산결과는"+ plussick + "입니다.");
		}else {
			System.out.println("계산결과는" + minssick +"입니다.");			
		}
		
		
		
		
		
		sc.close();
	}

}
