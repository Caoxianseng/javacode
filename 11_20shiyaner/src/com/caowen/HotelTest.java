package com.caowen;

import java.util.Scanner;
public class HotelTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        Hotel hotel=new Hotel("��ҾƵ�","����","������δ���������Ƽ���ѧʱ���㳡",2,2);
        for(int i=0;i<hotel.getRoomAmountMax();i++){
            Room room=new Room(cin.next(),cin.next(),cin.nextInt(),cin.nextFloat(),cin.next());
            hotel.roomReserve(room);
        }
        hotel.print();
        System.out.println();
        //�˿�
        System.out.println("������Ԥ���ķ�������");
        int number=cin.nextInt();
        System.out.println("������˿���Ϣ��");
        for(int i=0;i<number;i++) {
            Customer customer = new Customer(cin.next(), cin.nextFloat(), cin.next());
            customer.setBuyNum(number);
            System.out.println();
            hotel.sellRoom(customer);
        }
        System.out.println();
        hotel.roomPrint();
    }
}