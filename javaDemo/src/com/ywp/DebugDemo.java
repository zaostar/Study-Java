package com.ywp;

public class DebugDemo {
	
	/**
	 * �ϵ� ����ִ�е��ϵ����ͣ
	 * �ϵ㣺˫���к�ǰ��
	 * F5 ����ִ�У�������뷽���������Զ��巽����jdkԴ��ķ���
	 * F6 ����ִ�У����������Ὣ��������һ��������ִ��
	 * F7 ������ǰ����debug���Եķ���
	 * F8 ִ�е���һ���ϵ㣬���û�жϵ㣬�����ִ�����
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = a + 10;
		a = b++;
		System.out.println("hello debug");
		for (int i = 0; i < 3; i++) {
			System.out.println("���ǵ�" + i);
		}
		sayGood();
		System.out.println("goodBay");
 	}
	
	public static void sayGood() {
		System.out.println("good1");
		System.out.println("good2");
		System.out.println("good3");
	}

}
