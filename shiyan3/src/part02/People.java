package part02;

public class People extends Animal implements IfEat,IfSleep,IfSpeak,IfThink{
    public People(String type){
        super(type);
    }

    @Override
    public void eatFood() {
        System.out.println(getType() + "�ÿ��ӳԷ�");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + "���ڴ���˯��");
    }

    @Override
    public void speakThing() {
        System.out.println(getType() + "����˵��");
    }

    @Override
    public void thinkThing() {
        System.out.println(getType() + "�ô���˼������");
    }
}
