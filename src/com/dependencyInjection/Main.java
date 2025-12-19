package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = (Circle) container.getBean("myCircle");
        circle.drawShape();



        Rectangle rectangle = (Rectangle) container.getBean("rectangle");
        rectangle.drawShape();



    }
}