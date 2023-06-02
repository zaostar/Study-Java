package com.yangwenping;

//定义抽象类Shape
abstract class Shape {
 public abstract double getArea(); // 抽象方法，计算面积
}

//矩形类Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;
 
 // 构造方法
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // 重写抽象方法，计算矩形的面积
 @Override
 public double getArea() {
     return length * width;
 }
}

//圆形类Circle
class Circle extends Shape {
 private double radius;
 
 // 构造方法
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // 重写抽象方法，计算圆形的面积
 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//应用程序
public class area {
 public static void main(String[] args) {
     // 创建矩形对象并计算面积
     Rectangle rectangle = new Rectangle(5, 10);
     double rectangleArea = rectangle.getArea();
     System.out.println("矩形的面积：" + rectangleArea);
     
     // 创建圆形对象并计算面积
     Circle circle = new Circle(3);
     double circleArea = circle.getArea();
     System.out.println("圆形的面积：" + circleArea);
 }
}


