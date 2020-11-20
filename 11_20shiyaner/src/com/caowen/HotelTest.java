package com.caowen;

import java.util.Scanner;
public class HotelTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        Hotel hotel=new Hotel("如家酒店","发发","西安市未央区陕西科技大学时代广场",2,2);
        for(int i=0;i<hotel.getRoomAmountMax();i++){
            Room room=new Room(cin.next(),cin.next(),cin.nextInt(),cin.nextFloat(),cin.next());
            hotel.roomReserve(room);
        }
        hotel.print();
        System.out.println();
        //顾客
        System.out.println("请输入预定的房间数：");
        int number=cin.nextInt();
        System.out.println("请输入顾客信息：");
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