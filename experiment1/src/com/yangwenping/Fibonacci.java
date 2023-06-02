package com.yangwenping;

public class Fibonacci {
    public static void main(String[] args) {
        // 输出前 10 个 Fibonacci 数
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    // 使用递归计算 Fibonacci 数
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}