package com.yangwenping;
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        // ��ȡѧ���ɼ�
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("�������" + (i + 1) + "λѧ���ĳɼ���");
            scores[i] = scanner.nextInt();
        }
        scanner.close();
        // ������߷�
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        // ���ѧ���ɼ��͵ȵ�
        System.out.println("��߷֣�" + maxScore);
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
            System.out.println("ѧ��" + (i + 1) + "�ĳɼ�Ϊ��" + scores[i] + "���ȵ�Ϊ��" + grade);
        }
    }
}

