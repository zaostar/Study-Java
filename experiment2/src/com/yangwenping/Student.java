package com.yangwenping;

public class Student {
    private String name;
    private int id;
    private int grade; 
    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }   
    public String getName() {
        return name;
    }
    public int getID() {
        return id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public static void main(String[] args) {
        // ʵ����һ��ѧ������
        Student student = new Student("����ƽ", 190716145, 1);
        // ��ȡѧ���������ͱ���Լ��꼶
        String name = student.getName();
        int id = student.getID();
        int grade = student.getGrade();
        System.out.println("����: " + name);
        System.out.println("���: " + id);
        System.out.println("�꼶: " + grade);
        // �޸�ѧ�����꼶
        student.setGrade(2);
        grade = student.getGrade();
        System.out.println("�޸ĺ���꼶: " + grade);
    }
}
