/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author king
 */
public class Student {
    private  String name;
    private int age;
    private double point;

    public Student(String aliasname) {
        this.name = aliasname;
    }

    public Student(String name, int age, double point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", point=" + point + '}';
    }
    
    
    
    
    
    
}
