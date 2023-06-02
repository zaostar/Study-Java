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
        // 实例化一个学生对象
        Student student = new Student("杨文平", 190716145, 1);
        // 获取学生的姓名和编号以及年级
        String name = student.getName();
        int id = student.getID();
        int grade = student.getGrade();
        System.out.println("姓名: " + name);
        System.out.println("编号: " + id);
        System.out.println("年级: " + grade);
        // 修改学生的年级
        student.setGrade(2);
        grade = student.getGrade();
        System.out.println("修改后的年级: " + grade);
    }
}
