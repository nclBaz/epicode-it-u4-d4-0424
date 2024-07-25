package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {
	// Dog è FIGLIO di Animal
	// Ciò significa che eredita name, age ed i metodi dal padre
	// Eventualmente possiamo anche aggiungere ulteriori attributi/metodi
	// Lista attributi
	public boolean isACop; // <-- Questo è un attributo che solo i cani hanno


	// Lista costruttori
	private Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, boolean isACop) { // OVERLOAD DI COSTRUTTORE
		this(name, age);
		this.isACop = isACop;
	}

	@Override
	public void getInfo() {
		System.out.println("Il mio nome è " + this.name);
		System.out.println("La mia età è " + this.age);
		System.out.println("Sono un poliziotto? " + this.isACop);
	}

	// Lista metodi
	public void bark() { // <-- Questo è un metodo che solo i cani hanno
		System.out.println("BAU!");
	}

	public boolean isACop() {
		return isACop;
	}

	public void setACop(boolean ACop) {
		isACop = ACop;
	}

	@Override
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più specifici sono un Cane di nome " + this.name + " e ho " + this.age + " anni.");
	}

	@Override
	public void run(int km) {
		System.out.println("Ciao sono un cane e ora correrò per " + km + " km");
	}
}
