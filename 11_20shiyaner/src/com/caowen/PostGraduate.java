package com.caowen;

public class PostGraduate {//�о���
    public String postName;//����
    public String postSex;//�Ա�
    public int postAge;//����
    public String postNumber;//ѧ�� p00000000
    public String postMajor;//רҵ
    public String postCollege;//ѧԺ

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

    //�о�����Ϣ��ӡ
    public void postPrint(){
        System.out.println(getPostName());
        System.out.println(getPostSex());
        System.out.println(getPostAge());
        System.out.println(getPostNumber());
        System.out.println(getPostMajor());
        System.out.println(getPostCollege());
    }
}
