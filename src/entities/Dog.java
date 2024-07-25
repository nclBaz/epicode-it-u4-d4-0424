package entities;

public class Dog extends Animal {
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
}
