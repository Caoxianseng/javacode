package com.caowen;

public class CarTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.setUse("文文");
        car.setNumber("晋B.888888");
        car.setModel("大G");
        car.setColor("蓝");
        car.setCapacity(4);
        car.setManufacturer("奔驰责任有限公司");
        car.setDateOfProduction("2020-08-08");

        car.print();
    }
}
