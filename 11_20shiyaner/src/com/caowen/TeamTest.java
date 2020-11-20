package com.caowen;

import java.util.Scanner;
public class TeamTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        Team team=new Team(cin.next(),cin.next(),cin.next());
        team.setPersonNum(7);//�Ŷ�������
        team.setTeacherNumMax(2);//�Ŷӽ�ʦ����
        team.setPostNumMax(2);//�Ŷ��о�������
        team.setUnderNumMax(3);///�Ŷӱ���������

        //��ʦ��Ƹ
        for(int i=0;i<2;i++){
            Teacher teacher=new Teacher(cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next());
            team.teacherRecruit(teacher);
        }
        //�о�����Ƹ
        for(int i=0;i<2;i++){
            PostGraduate post=new PostGraduate(cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next(),cin.next());
            team.postGraduateRecruit(post);
        }
        //��������Ƹ
        for(int i=0;i<3;i++){
            UnderGraduate under=new UnderGraduate(cin.next(),cin.next(),cin.next(),cin.nextInt(),cin.next(),cin.next(),cin.next());
            team.underGraduateRecruit(under);
        }
        System.out.println();

        team.teamPrint();//�Ŷ���Ϣ��ӡ
    }
}

