package com.caowen;

public class Teacher {//��ʦ
    public String teacherName;//����
    public String teacherSex;//�Ա�
    public int teacherAge;//����
    public String teacherNumber;//���� t0000
    public String teacherCollege;//ѧԺ����

    public Teacher(String teacherName,String teacherSex,int teacherAge,String teacherNumber,String teacherCollege){
        setTeacherName(teacherName);
        setTeacherSex(teacherSex);
        setTeacherAge(teacherAge);
        setTeacherNumber(teacherNumber);
        setTeacherCollege(teacherCollege);
    }

    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public void setTeacherSex(String teacherSex){
        this.teacherSex=teacherSex;
    }
    public void setTeacherAge(int teacherAge){
        this.teacherAge=teacherAge;
    }
    public void setTeacherNumber(String teacherNumber){
        this.teacherNumber=teacherNumber;
    }
    public void setTeacherCollege(String teacherCollege){
        this.teacherCollege=teacherCollege;
    }

    public String getTeacherName(){
        return teacherName;
    }
    public String getTeacherSex(){
        return teacherSex;
    }
    public int getTeacherAge(){
        return teacherAge;
    }
    public String getTeacherNumber(){
        return teacherNumber;
    }
    public String getTeacherCollege(){
        return teacherCollege;
    }

    //��ʦ��Ϣ��ӡ
    public void teacherPrint(){
        System.out.println(getTeacherName());
        System.out.println(getTeacherSex());
        System.out.println(getTeacherAge());
        System.out.println(getTeacherNumber());
        System.out.println(getTeacherCollege());
    }
}