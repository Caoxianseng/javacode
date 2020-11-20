package com.caowen;

public class Team {
    public String source;//ѧУ
    public String name;//�ŶӶ���
    public String location;//�ŶӶ�λ
    public int personNum;//�Ŷ�������
    public int teacherNumMax;//�Ŷӽ�ʦ�������
    public int teacherNum;//�Ŷӽ�ʦ����
    private Teacher[] teacherList;
    public int postNumMax;//�Ŷ��о����������
    public int postNum;//�Ŷ��о�������
    private PostGraduate[] postList;
    public int underNumMax;//�Ŷӱ������������
    public int underNum;//�Ŷӱ���������
    private UnderGraduate[] underList;

    public Team(String source,String name,String location){
        setSource(source);
        setName(name);
        setLocation(location);
    }

    public void setSource(String source){
        this.source=source;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setPersonNum(int personNum){
        this.personNum=personNum;
    }
    public void setTeacherNumMax(int teacherNumMax){
        this.teacherNumMax=teacherNumMax;
        teacherList=new Teacher[teacherNumMax];
    }
    public void setPostNumMax(int postNumMax){
        this.postNumMax=postNumMax;
        postList=new PostGraduate[postNumMax];
    }
    public void setUnderNumMax(int underNumMax){
        this.underNumMax=underNumMax;
        underList=new UnderGraduate[underNumMax];
    }

    public String getSource(){
        return source;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getPersonNum(){
        return personNum;
    }
    public int getTeacherNumMax(){
        return teacherNumMax;
    }
    public int getPostNumMax(){
        return postNumMax;
    }
    public int getUnderNumMax(){
        return underNumMax;
    }

    //��Ա��Ƹ
    //��ʦ��Ƹ
    public void teacherRecruit(Teacher teacher){
        teacherNum++;
        for(int i=0;i<teacherList.length;i++){
            if(teacherList[i]==null){
                teacherList[i]=teacher;
                System.out.println();
                System.out.print("��ʦ��"+teacher.getTeacherName()+" ��Ƹ�ɹ�");
                break;
            }
        }
    }
    //�о�������
    public void postGraduateRecruit(PostGraduate post){
        postNum++;
        for(int i=0;i<postList.length;i++){
            if(postList[i]==null){
                postList[i]=post;
                System.out.println();
                System.out.print("�о�����"+post.getPostName()+" �����ɹ�");
                break;
            }
        }
    }
    //����������
    public void underGraduateRecruit(UnderGraduate under){
        underNum++;
        for(int i=0;i<underList.length;i++){
            if(underList[i]==null){
                underList[i]=under;
                System.out.println();
                System.out.print("��������"+under.getUnderName()+" �����ɹ�");
                break;
            }
        }
    }

    //�Ŷ���Ϣ��ӡ
    public void teamPrint(){
        System.out.println();
        System.out.println(">>>�Ŷ���Ϣ��");
        System.out.println();
        System.out.println("* * * * * * *  "+getSource()+"  * * * * * * *");
        System.out.println();
        System.out.println("������   "+getName());
        System.out.println("��λ��   "+getLocation());
        System.out.println("������:  "+getPersonNum()+"/��");
        System.out.println("������:  "+teacherList[0].getTeacherName());
        System.out.println("��������������������������������������������������������������������������������");
        System.out.println("��ʦ��");
        for(int i=0;i<teacherNum;i++){
            System.out.print("   "+teacherList[i].getTeacherName());
            System.out.print("   "+teacherList[i].getTeacherNumber());
            System.out.print("   "+teacherList[i].getTeacherCollege());
            if(i!=teacherNum-1) System.out.println();
        }
        System.out.println();
        System.out.println("��������������������������������������������������������������������������������");
        System.out.println("�о�����");
        for(int i=0;i<postNum;i++){
            System.out.print("   "+postList[i].getPostName());
            System.out.print("   "+postList[i].getPostNumber());
            System.out.print("   "+postList[i].getPostMajor());
            System.out.print("   "+postList[i].getPostCollege());
            if(i!=postNum-1) System.out.println();
        }
        System.out.println();
        System.out.println("��������������������������������������������������������������������������������");
        System.out.println("��������");
        for(int i=0;i<underNum;i++){
            System.out.print("   "+underList[i].getUnderClass());
            System.out.print("   "+underList[i].getUnderName());
            System.out.print("   "+underList[i].getUnderNumber());
            System.out.print("   "+underList[i].getUnderCollege());
            if(i!=underNum) System.out.println();
        }
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
    }
}
