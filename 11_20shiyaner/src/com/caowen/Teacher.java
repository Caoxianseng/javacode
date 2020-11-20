package com.caowen;

public class Teacher {//教师
    public String teacherName;//姓名
    public String teacherSex;//性别
    public int teacherAge;//年龄
    public String teacherNumber;//工号 t0000
    public String teacherCollege;//学院或部门

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

    //教师信息打印
    public void teacherPrint(){
        System.out.println(getTeacherName());
        System.out.println(getTeacherSex());
        System.out.println(getTeacherAge());
        System.out.println(getTeacherNumber());
        System.out.println(getTeacherCollege());
    }
}