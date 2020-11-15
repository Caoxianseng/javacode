package part02;

public class Cat extends Animal implements IfEat,IfSleep{
    public Cat(String type){
        super(type);
    }

    @Override
    public void eatFood() {
        System.out.println(getType() +  "³ÔÀÏÊó");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + "òéÒ»ÍÅË¯¾õ");
    }
}
