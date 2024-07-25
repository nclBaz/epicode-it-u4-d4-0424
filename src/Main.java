import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {

		Animal a = new Animal("Giorgio", 30);
		a.sayYourName();


		Dog d = new Dog("Rex", 5, true);
		d.sayYourName();
		d.bark();

		Cat c = new Cat("Felix", 8, true);
		c.sayYourName();
		c.meow();
		
	}
}