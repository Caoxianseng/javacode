package part02;

public class Test {

	 public static void main(String[] args) {
	        Cat cat = new Cat("è");
	        cat.eatFood();
	        cat.sleep();

	        People person = new People("�й���");
	        person.eatFood();
	        person.sleep();
	        person.speakThing();
	        person.thinkThing();

	        Bird bird = new Bird("��");
	        bird.eatFood();
	        bird.flyInSky();
	        bird.sleep();
	    }

}
