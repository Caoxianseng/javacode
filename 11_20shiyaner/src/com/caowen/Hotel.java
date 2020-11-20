package com.caowen;

public class Hotel {
    public String name;//名字
    public String charge;//负责人
    public String position;//地理位置
    public int roomAmount;//房间数
    public int roomAmountMax;//总房间数Amount
    public Room[] roomList;
    public int customerAmount;//顾客数量
    public int customerAmountMax;//最大顾客数
    public Customer[] customerList;

    public Hotel(String name,String charge,String position,int roomAmountMax,int customerAmountMax){
        setName(name);
        setCharge(charge);
        setPosition(position);
        setRoomAmountMax(roomAmountMax);
        setCustomerAmountMax(customerAmountMax);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCharge(String charge){
        this.charge=charge;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public void setRoomAmountMax(int roomAmountMax){
        this.roomAmountMax=roomAmountMax;
        roomList=new Room[roomAmountMax];
    }
    public void setCustomerAmountMax(int customerAmountMax){
        this.customerAmountMax=customerAmountMax;
        customerList=new Customer[customerAmountMax];
    }

    public String getName(){
        return name;
    }
    public String getCharge(){
        return charge;
    }
    public String getPosition(){
        return position;
    }
    public int getRoomAmount(){
        return roomAmount;
    }
    public int getRoomAmountMax(){
        return roomAmountMax;
    }
    public int getCustomerAmountMax(){
        return customerAmountMax;
    }

    //房间制定
    public void roomReserve(Room room){
        roomAmount++;
        for(int i=0;i<roomList.length;i++){
            if(roomList[i]==null){
                roomList[i]=room;
                System.out.println();
                System.out.print(room.getRoomName()+" 房间加载成功");
                break;
            }
        }
    }

    //房间订购
    public void sellRoom(Customer customer){
        if(roomList.length>0){
            for(int i=0;i<roomAmount;i++){
                if((roomList[i].getRoomName().equals(customer.getBuyRoomName()))&&(roomList[i].getRoomStatus().equals("未订"))){
                    customerAmount++;
                    float k=customer.getBuyNum()*roomList[i].getRoomPrice();//所需金额
                    if(k<customer.getMoney()){
                        System.out.println(roomList[i].getRoomName()+" 金额 "+k+"/元"+" 订购成功 ");
                        customer.setMoney((customer.getMoney()-k));
                        roomAmount--;
                        roomList[i].setRoomStatus("已订");
                    }
                }
            }
        }
    }

    //房间信息打印
    public void roomPrint(){
        for(int i=0;i<roomList.length;i++){
            roomList[i].print();
        }
    }
    //酒店信息打印
    public void print(){
        System.out.println();
        System.out.println();
        System.out.println("酒店名：  "+getName());
        System.out.println("负责人：  "+getCharge());
        System.out.println("房间总数: "+getRoomAmount()+"/间");
        System.out.println("地址：    "+getPosition());
        System.out.println();
        roomPrint();
    }
}