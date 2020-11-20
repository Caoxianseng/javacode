package com.caowen;

public class Room {
    public String roomName;//�����
    public String roomKind;//��������
    public int roomCapacity;//��������
    public float roomPrice;//����۸�
    public String roomStatus;//����״̬

    public Room(String roomName,String roomKind,int roomCapacity,float roomPrice,String roomStatus){
        setRoomName(roomName);
        setRoomKind(roomKind);
        setRoomCapacity(roomCapacity);
        setRoomPrice(roomPrice);
        setRoomStatus(roomStatus);
    }

    public void setRoomName(String roomName){
        this.roomName=roomName;
    }
    public void setRoomKind(String roomKind){
        this.roomKind=roomKind;
    }
    public void setRoomCapacity(int roomCapacity){
        this.roomCapacity=roomCapacity;
    }
    public void setRoomPrice(float roomPrice){
        this.roomPrice=roomPrice;
    }
    public void setRoomStatus(String roomStatus){
        this.roomStatus=roomStatus;
    }

    public String getRoomName(){
        return roomName;
    }
    public String getRoomKind(){
        return roomKind;
    }
    public int getRoomCapacity(){
        return roomCapacity;
    }
    public float getRoomPrice(){
        return roomPrice;
    }
    public String getRoomStatus(){
        return roomStatus;
    }

    public void print(){
        System.out.print(getRoomName()+" ");
        System.out.print(getRoomKind()+" ");
        System.out.print(getRoomCapacity()+" ");
        System.out.print(getRoomPrice()+"/Ԫ ");
        System.out.println(getRoomStatus()+" ");
    }
}