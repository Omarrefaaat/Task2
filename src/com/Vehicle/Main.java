package com.Vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) container.getBean("car");
        car.storeVehicle();

        Plane plane = (Plane) container.getBean("plane");
        plane.storeVehicle();


    }
}
