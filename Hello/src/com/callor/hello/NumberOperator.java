package com.callor.hello;
/*
 *	두개의 숫자 30과 40의 4칙연산을 수행하여
 *	결과를 Console에 출력하시오 
 */
public class NumberOperator {
	public static void main(String[] args) {
		
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);
		
		// 정수의 나눗셈은 몫을 구하는 연산
		System.out.println(30 / 40);
		// 정수의 나머지 연산
		System.out.println(30 % 40);
		
		// 실수와 실수를 나눗셈 연산
		// 연산결과도 실수로 나타난다
		System.out.println(30.0 / 40.0);
		// 소수점이하 17번째 자리에서 버림 현상이 나타난다
		System.out.println(4.0 / 3.0); //소수점 이하 16번째까지만 표현
		
		System.out.println(4.0F / 3.0F);
		
		/*
		 *	코드에서 사용하는 숫자는 정수와 실수가 있고
		 *	큰 정수(Long)와 작은 정수(int, Integer)
		 *	배정도(double)(긴 정밀도) 실수, 단정도(float)(짧은 정밀도) 실수가 있다
		 */ 
		
		System.out.println(999_999_999);
		System.out.println(999_999_999_999_999_999L);
	}
}
