package com.yangwenping;

public class PrimeNumber {
    public static void main(String[] args) {
    	// 记录每行输出的素数个数
        int count = 0;
        // 遍历整数 1～100
        for (int i = 1; i <= 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
                count++;                                       
                // 以 5 个一行显示
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
    // 判断一个数是否为素数
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
