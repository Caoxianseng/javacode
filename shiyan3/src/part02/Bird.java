package part02;

public class Bird extends Animal implements IfEat,IfSleep,IfFly{
    public Bird(String type){
        super(type);
    }

    @Override
    public void eatFood() {
        System.out.println(getType() + "�Է��Գ���");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + "�ڵ�����˯��");
    }

    @Override
    public void flyInSky() {
        System.out.println(getType() + "�ó���");
    }
}

