import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {

		/*Animal a = new Animal("Giorgio", 30); // <-- essendo Animal astratta, significa che non posso più istanziarla
		a.sayYourName();*/


		Dog d = new Dog("Rex", 5, true);
	/*	d.sayYourName();
		d.bark();*/

		Cat c = new Cat("Felix", 8, true);
	/*	c.sayYourName();
		c.meow();*/

		Student aldo = new Student("Aldo");

		// --------------------- POLIMORFISMO -------------------------
		// Il polimorfismo è la caratteristica degli oggetti di avere "più forme"
		// Ad esempio un oggetto cane sarà sia Dog che Animal che Object (e considerando
		// anche le interfacce sarà pure un Runner)
		// Un oggetto gatto invece sarà di tipo Cat, ma anche Animal ma anche Object (inoltre grazie
		// all'interfaccia sarà pure un Jumper)

		Animal[] animals = {d, c, new Cat("Tom", 1, false), new Dog("Lassie", 4, false)};
		// Array polimorfico, ovvero un array misto di cani e gatti..posso farlo perché entrambi sono animali

/*		for (int i = 0; i < animals.length; i++) {
			Animal currentAnimal = animals[i];
			currentAnimal.getInfo();
			currentAnimal.sayYourName();
			// Se inserisco cani e gatti nello stesso array polimorfico, probabilmente mi interessa proprio utilizzare i metodi che entrambi possiedono

			// Se volessi usare i metodi specifici di un animale tipo Dog e Cat potrei anche farlo utilizzando il casting esplicito...l'importante
			// però è sincerarsi del fatto se l'animale è effettivamente un cane o un gatto prima di convertirlo (istanceof è molto utile in questo caso)
			if (currentAnimal instanceof Dog) {
				Dog currentDog = (Dog) currentAnimal; // CAST ESPLICITO da Animal a Dog. Qua posso farlo senza problemi perché con instanceof ho prima controllato
				currentDog.bark();
			} else { // Per esclusione se non è un Dog sarà un Cat
				Cat currentCat = (Cat) currentAnimal; // CAST ESPLICITO da Animal a Cat. Qua posso farlo senza problemi perché con l'else sono sicuro che sia un gatto
				currentCat.meow();
			}
		}*/

		Runner[] runners = {d, aldo};

		for (int i = 0; i < runners.length; i++) {
			runners[i].run(i + 1);
		}

		Jumper[] jumpers = {aldo, c};
		for (int i = 0; i < jumpers.length; i++) {
			jumpers[i].jump(i + 10);
		}

		printAnimal(c);
		printAnimal(d);
	}

	/*public static void printAnimal(Dog d){
		System.out.println(d);
		d.sayYourName();
	}*/

	public static void printAnimal(Animal animal) {
		// Sempre grazie al polimorfismo posso creare dei metodi che accettino dei parametri più generici per renderli compatibili con più tipi
		// Ad esempio questo metodo (a differenza di quello commentato) non accetta un solo tipo di animale (il cane) ma accetta sia cani che gatti
		System.out.println(animal);
		animal.sayYourName();
	}
}