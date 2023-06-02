package com.yangwenping;

public class PrimeNumber {
    public static void main(String[] args) {
    	// ��¼ÿ���������������
        int count = 0;
        // �������� 1��100
        for (int i = 1; i <= 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
                count++;                                       
                // �� 5 ��һ����ʾ
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
    // �ж�һ�����Ƿ�Ϊ����
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
