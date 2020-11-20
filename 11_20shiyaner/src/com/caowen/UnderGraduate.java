package com.caowen;

public class UnderGraduate {//本科生
    public String underClass;//班级
    public String underName;//姓名
    public String underSex;//性别
    public int underAge;//年龄
    public String underNumber;//学号 u20180000
    public String underMajor;//专业
    public String underCollege;//学院

    public UnderGraduate(String underClass,String underName,String underSex,int underAge,String underNumber,String underMajor,String underCollege){
        setUnderClass(underClass);
        setUnderName(underName);
        setUnderSex(underSex);
        setUnderAge(underAge);
        setUnderNumber(underNumber);
        setUnderMajor(underMajor);
        setUnderCollege(underCollege);
    }

    public void setUnderClass(String underClass){
        this.underClass=underClass;
    }
    public void setUnderName(String underName){
        this.underName=underName;
    }
    public void setUnderSex(String underSex){
        this.underSex=underSex;
    }
    public void setUnderAge(int underAge){
        this.underAge=underAge;
    }
    public void setUnderNumber(String underNumber){
        this.underNumber=underNumber;
    }
    public void setUnderMajor(String underMajor){
        this.underMajor=underMajor;
    }
    public void setUnderCollege(String underCollege){
        this.underCollege=underCollege;
    }

    public String getUnderClass(){
        return underClass;
    }
    public String getUnderName(){
        return underName;
    }
    public String getUnderSex(){
        return underSex;
    }
    public int getUnderAge(){
        return underAge;
    }
    public String getUnderNumber(){
        return underNumber;
    }
    public String getUnderMajor(){
        return underMajor;
    }
    public String getUnderCollege(){
        return underCollege;
    }

    //本科生信息打印
    public void underPrint(){
        System.out.println(getUnderClass());
        System.out.println(getUnderName());
        System.out.println(getUnderSex());
        System.out.println(getUnderAge());
        System.out.println(getUnderNumber());
        System.out.println(getUnderMajor());
        System.out.println(getUnderCollege());
    }
}

