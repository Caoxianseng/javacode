package part02;

public class People extends Animal implements IfEat,IfSleep,IfSpeak,IfThink{
    public People(String type){
        super(type);
    }

    @Override
    public void eatFood() {
        System.out.println(getType() + "用筷子吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + "躺在床上睡觉");
    }

    @Override
    public void speakThing() {
        System.out.println(getType() + "用嘴说话");
    }

    @Override
    public void thinkThing() {
        System.out.println(getType() + "用大脑思考问题");
    }
}
