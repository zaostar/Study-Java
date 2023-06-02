package com.yangwenping;

public class Fibonacci {
    public static void main(String[] args) {
        // ���ǰ 10 �� Fibonacci ��
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    // ʹ�õݹ���� Fibonacci ��
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}