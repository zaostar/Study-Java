package com.yangwenping;

public class SquareRootTable {
    public static void main(String[] args) {
        System.out.println("Number\t\tSquareRoot");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i <= 10; i++) {
            double squareRoot = Math.sqrt(i);
            System.out.printf("%d\t\t%.16f\n", i, squareRoot);
        }
    }
}

