package com.callor.hello;
/*
 *	�ΰ��� ���� 30�� 40�� 4Ģ������ �����Ͽ�
 *	����� Console�� ����Ͻÿ� 
 */
public class NumberOperator {
	public static void main(String[] args) {
		
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);
		
		// ������ �������� ���� ���ϴ� ����
		System.out.println(30 / 40);
		// ������ ������ ����
		System.out.println(30 % 40);
		
		// �Ǽ��� �Ǽ��� ������ ����
		// �������� �Ǽ��� ��Ÿ����
		System.out.println(30.0 / 40.0);
		// �Ҽ������� 17��° �ڸ����� ���� ������ ��Ÿ����
		System.out.println(4.0 / 3.0); //�Ҽ��� ���� 16��°������ ǥ��
		
		System.out.println(4.0F / 3.0F);
		
		/*
		 *	�ڵ忡�� ����ϴ� ���ڴ� ������ �Ǽ��� �ְ�
		 *	ū ����(int, Integer)�� ���� ����(Long)
		 *	������(double)(�� ���е�) �Ǽ�, ������(float)(ª�� ���е�) �Ǽ��� �ִ�
		 */ 
		
		System.out.println(999_999_999);
		System.out.println(999_999_999_999_999_999L);
	}
}
