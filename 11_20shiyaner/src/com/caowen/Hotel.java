package com.caowen;

public class Hotel {
    public String name;//����
    public String charge;//������
    public String position;//����λ��
    public int roomAmount;//������
    public int roomAmountMax;//�ܷ�����Amount
    public Room[] roomList;
    public int customerAmount;//�˿�����
    public int customerAmountMax;//���˿���
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

    //�����ƶ�
    public void roomReserve(Room room){
        roomAmount++;
        for(int i=0;i<roomList.length;i++){
            if(roomList[i]==null){
                roomList[i]=room;
                System.out.println();
                System.out.print(room.getRoomName()+" ������سɹ�");
                break;
            }
        }
    }

    //���䶩��
    public void sellRoom(Customer customer){
        if(roomList.length>0){
            for(int i=0;i<roomAmount;i++){
                if((roomList[i].getRoomName().equals(customer.getBuyRoomName()))&&(roomList[i].getRoomStatus().equals("δ��"))){
                    customerAmount++;
                    float k=customer.getBuyNum()*roomList[i].getRoomPrice();//������
                    if(k<customer.getMoney()){
                        System.out.println(roomList[i].getRoomName()+" ��� "+k+"/Ԫ"+" �����ɹ� ");
                        customer.setMoney((customer.getMoney()-k));
                        roomAmount--;
                        roomList[i].setRoomStatus("�Ѷ�");
                    }
                }
            }
        }
    }

    //������Ϣ��ӡ
    public void roomPrint(){
        for(int i=0;i<roomList.length;i++){
            roomList[i].print();
        }
    }
    //�Ƶ���Ϣ��ӡ
    public void print(){
        System.out.println();
        System.out.println();
        System.out.println("�Ƶ�����  "+getName());
        System.out.println("�����ˣ�  "+getCharge());
        System.out.println("��������: "+getRoomAmount()+"/��");
        System.out.println("��ַ��    "+getPosition());
        System.out.println();
        roomPrint();
    }
}