package com.caowen;

public class Customer {
    public String customerName;//�˿���
    public float money;//�˿������ĳ�ʼ�ʽ�
    public String buyRoomName;//�˿�����ķ����
    public int buyNum;

    public Customer(String customerName,float money,String buyRoomName){
        setCustomerName(customerName);
        setMoney(money);
        setBuyRookName(buyRoomName);
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setMoney(float money){
        this.money=money;
    }
    public void setBuyRookName(String buyRoomName){
        this.buyRoomName=buyRoomName;
    }
    public void setBuyNum(int buyNum){
        this.buyNum=buyNum;
    }

    public String getCustomerName(){
        return customerName;
    }
    public float getMoney(){
        return money;
    }
    public String getBuyRoomName(){
        return buyRoomName;
    }
    public int getBuyNum(){
        return buyNum;
    }
}