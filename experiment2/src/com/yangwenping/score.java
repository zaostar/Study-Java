package com.yangwenping;
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        // 读取学生成绩
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
            scores[i] = scanner.nextInt();
        }
        scanner.close();
        // 计算最高分
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        // 输出学生成绩和等第
        System.out.println("最高分：" + maxScore);
        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("学生" + (i + 1) + "的成绩为：" + scores[i] + "，等第为：" + grade);
        }
    }
}

