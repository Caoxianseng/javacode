package com.caowen;

import java.util.Scanner;
public class TeamTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        Team team=new Team(cin.next(),cin.next(),cin.next());
        team.setPersonNum(7);//团队总人数
        team.setTeacherNumMax(2);//团队教师人数
        team.setPostNumMax(2);//团队研究生人数
        team.setUnderNumMax(3);///团队本科生人数

        //教师招聘
        for(int i=0;i<2;i++){
            Teacher teacher=new Teacher(cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next());
            team.teacherRecruit(teacher);
        }
        //研究生招聘
        for(int i=0;i<2;i++){
            PostGraduate post=new PostGraduate(cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next(),cin.next());
            team.postGraduateRecruit(post);
        }
        //本科生招聘
        for(int i=0;i<3;i++){
            UnderGraduate under=new UnderGraduate(cin.next(),cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next(),cin.next());
            team.underGraduateRecruit(under);
        }
        System.out.println();

        team.teamPrint();//团队信息打印
    }
}

