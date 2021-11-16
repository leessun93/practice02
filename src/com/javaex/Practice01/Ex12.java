package com.javaex.Practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호");
		String giho = sc.nextLine();
		
		System.out.println("숫자1");
		double num1 = sc.nextDouble();
		
		System.out.println("숫자2");
		double num2 = sc.nextDouble();
		
		switch (giho){
		case "+":	
			System.out.println("결과는"+ (num1+num2));
			break;
		case "-":
			System.out.println("결과는"+ (num1-num2));
			break;
		case "*":
			System.out.println("결과는"+ (num1*num2));
			break;
		case "/" :
			if (num2==0) {
			System.out.println("계산할 수 없습니다.");
			}else {
			System.out.println("결과는"+ (num1/num2));
			}
			break;
		
		default :
			System.out.println("계산할 수 없는 결과입니다.");
			break;
	
		}
	
		
		sc.close();

	}

}