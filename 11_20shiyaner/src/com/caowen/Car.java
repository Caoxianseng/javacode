package com.caowen;

public class Car {
    public String use;//ʹ����
    public String number;//���ƺ�
    public String model;//Ʒ���ͺ�
    public String color;//��ɫ
    public int capacity;//����ؿ���
    public String manufacturer;//��������
    public String dateOfProduction;//��������

    //�޲�
    public Car(){
    }
    //�в�
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
        System.out.println("ʹ���ߣ�"+getUse());
        System.out.println("���ƺţ�"+getNumber());
        System.out.println("�ͺţ�"+getModel());
        System.out.println("��ɫ��"+getColor());
        System.out.println("����ؿ�����"+getCapacity());
        System.out.println("�������ң�"+getManufacturer());
        System.out.println("�������ڣ�"+getDateOfProduction());
    }
}
