package com.ywp;

public class DebugDemo {
	
	/**
	 * 断点 程序执行到断点会暂停
	 * 断点：双击行号前面
	 * F5 单步执行，但会进入方法，包括自定义方法和jdk源码的方法
	 * F6 单步执行，遇到方法会将方法当做一条语句进行执行
	 * F7 跳出当前正在debug调试的方法
	 * F8 执行到下一个断点，如果没有断点，则程序执行完毕
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = a + 10;
		a = b++;
		System.out.println("hello debug");
		for (int i = 0; i < 3; i++) {
			System.out.println("我是第" + i);
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
