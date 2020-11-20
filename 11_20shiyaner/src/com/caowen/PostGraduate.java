package com.caowen;

public class PostGraduate {//研究生
    public String postName;//姓名
    public String postSex;//性别
    public int postAge;//年龄
    public String postNumber;//学号 p00000000
    public String postMajor;//专业
    public String postCollege;//学院

    public PostGraduate(String postName,String postSex,int postAge,String postNumber,String postMajor,String postCollege){
        setPostName(postName);
        setPostSex(postSex);
        setPostAge(postAge);
        setPostNumber(postNumber);
        setPostMajor(postMajor);
        setPostCollege(postCollege);
    }

    public void setPostName(String postName){
        this.postName=postName;
    }
    public void setPostSex(String postSex){
        this.postSex=postSex;
    }
    public void setPostAge(int postAge){
        this.postAge=postAge;
    }
    public void setPostNumber(String postNumber){
        this.postNumber=postNumber;
    }
    public void setPostMajor(String postMajor){
        this.postMajor=postMajor;
    }
    public void setPostCollege(String postCollege){
        this.postCollege=postCollege;
    }

    public String getPostName(){
        return postName;
    }
    public String getPostSex(){
        return postSex;
    }
    public int getPostAge(){
        return postAge;
    }
    public String getPostNumber(){
        return postNumber;
    }
    public String getPostMajor(){
        return postMajor;
    }
    public String getPostCollege(){
        return postCollege;
    }

    //研究生信息打印
    public void postPrint(){
        System.out.println(getPostName());
        System.out.println(getPostSex());
        System.out.println(getPostAge());
        System.out.println(getPostNumber());
        System.out.println(getPostMajor());
        System.out.println(getPostCollege());
    }
}
