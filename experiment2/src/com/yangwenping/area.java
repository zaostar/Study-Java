package com.yangwenping;

//���������Shape
abstract class Shape {
 public abstract double getArea(); // ���󷽷����������
}

//������Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;
 
 // ���췽��
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // ��д���󷽷���������ε����
 @Override
 public double getArea() {
     return length * width;
 }
}

//Բ����Circle
class Circle extends Shape {
 private double radius;
 
 // ���췽��
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // ��д���󷽷�������Բ�ε����
 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//Ӧ�ó���
public class area {
 public static void main(String[] args) {
     // �������ζ��󲢼������
     Rectangle rectangle = new Rectangle(5, 10);
     double rectangleArea = rectangle.getArea();
     System.out.println("���ε������" + rectangleArea);
     
     // ����Բ�ζ��󲢼������
     Circle circle = new Circle(3);
     double circleArea = circle.getArea();
     System.out.println("Բ�ε������" + circleArea);
 }
}


