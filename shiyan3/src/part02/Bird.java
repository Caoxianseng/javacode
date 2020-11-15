package part02;

public class Bird extends Animal implements IfEat,IfSleep,IfFly{
    public Bird(String type){
        super(type);
    }

    @Override
    public void eatFood() {
        System.out.println(getType() + "吃饭吃虫子");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + "在电线上睡觉");
    }

    @Override
    public void flyInSky() {
        System.out.println(getType() + "用翅膀飞");
    }
}

