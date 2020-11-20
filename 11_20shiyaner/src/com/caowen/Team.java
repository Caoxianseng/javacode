package com.caowen;

public class Team {
    public String source;//学校
    public String name;//团队队名
    public String location;//团队定位
    public int personNum;//团队总人数
    public int teacherNumMax;//团队教师最大人数
    public int teacherNum;//团队教师人数
    private Teacher[] teacherList;
    public int postNumMax;//团队研究生最大人数
    public int postNum;//团队研究生人数
    private PostGraduate[] postList;
    public int underNumMax;//团队本科生最大人数
    public int underNum;//团队本科生人数
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

    //人员招聘
    //教师招聘
    public void teacherRecruit(Teacher teacher){
        teacherNum++;
        for(int i=0;i<teacherList.length;i++){
            if(teacherList[i]==null){
                teacherList[i]=teacher;
                System.out.println();
                System.out.print("教师："+teacher.getTeacherName()+" 招聘成功");
                break;
            }
        }
    }
    //研究生招生
    public void postGraduateRecruit(PostGraduate post){
        postNum++;
        for(int i=0;i<postList.length;i++){
            if(postList[i]==null){
                postList[i]=post;
                System.out.println();
                System.out.print("研究生："+post.getPostName()+" 招生成功");
                break;
            }
        }
    }
    //本科生招生
    public void underGraduateRecruit(UnderGraduate under){
        underNum++;
        for(int i=0;i<underList.length;i++){
            if(underList[i]==null){
                underList[i]=under;
                System.out.println();
                System.out.print("本科生："+under.getUnderName()+" 招生成功");
                break;
            }
        }
    }

    //团队信息打印
    public void teamPrint(){
        System.out.println();
        System.out.println(">>>团队信息表：");
        System.out.println();
        System.out.println("* * * * * * *  "+getSource()+"  * * * * * * *");
        System.out.println();
        System.out.println("队名：   "+getName());
        System.out.println("定位：   "+getLocation());
        System.out.println("总人数:  "+getPersonNum()+"/人");
        System.out.println("负责人:  "+teacherList[0].getTeacherName());
        System.out.println("————————————————————————————————————————");
        System.out.println("教师：");
        for(int i=0;i<teacherNum;i++){
            System.out.print("   "+teacherList[i].getTeacherName());
            System.out.print("   "+teacherList[i].getTeacherNumber());
            System.out.print("   "+teacherList[i].getTeacherCollege());
            if(i!=teacherNum-1) System.out.println();
        }
        System.out.println();
        System.out.println("————————————————————————————————————————");
        System.out.println("研究生：");
        for(int i=0;i<postNum;i++){
            System.out.print("   "+postList[i].getPostName());
            System.out.print("   "+postList[i].getPostNumber());
            System.out.print("   "+postList[i].getPostMajor());
            System.out.print("   "+postList[i].getPostCollege());
            if(i!=postNum-1) System.out.println();
        }
        System.out.println();
        System.out.println("————————————————————————————————————————");
        System.out.println("本科生：");
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
