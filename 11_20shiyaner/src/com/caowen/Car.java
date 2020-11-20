package com.caowen;

public class Car {
    public String use;//使用者
    public String number;//车牌号
    public String model;//品牌型号
    public String color;//颜色
    public int capacity;//最大载客量
    public String manufacturer;//生产厂家
    public String dateOfProduction;//出厂日期

    //无参
    public Car(){
    }
    //有参
    public void car(String use,String number,String model,String color,int capacity,String manufacturer,String dateOfProduction){
        setUse(use);
        setNumber(number);
        setModel(model);
        setColor(color);
        setCapacity(capacity);
        setManufacturer(manufacturer);
        setDateOfProduction(dateOfProduction);
    }

    public void setUse(String use) {
        this.use = use;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getUse() {
        return use;
    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void print(){
        System.out.println("使用者："+getUse());
        System.out.println("车牌号："+getNumber());
        System.out.println("型号："+getModel());
        System.out.println("颜色："+getColor());
        System.out.println("最大载客量："+getCapacity());
        System.out.println("生产厂家："+getManufacturer());
        System.out.println("出厂日期："+getDateOfProduction());
    }
}
