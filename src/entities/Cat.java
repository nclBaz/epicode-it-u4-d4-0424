package entities;

public class Cat extends Animal {
	// Cat è FIGLIO di Animal
	// Ciò significa che eredita name, age ed i metodi dal padre
	// Eventualmente possiamo anche aggiungere ulteriori attributi/metodi
	// Lista attributi
	public boolean hasBoots; // <-- Questo è un attributo che solo i gatti hanno

	// Lista costruttori
/*	public Cat(String name, int age) { // Costruttore I
		super(name, age); // Tramite super() richiamo uno dei costruttori del padre
	}*/

	public Cat(String name, int age, boolean hasBoots) { // OVERLOAD DI COSTRUTTORE
		super(name, age);
		this.hasBoots = hasBoots;
	}

	// Lista metodi
	public void meow() { // <-- Questo è un metodo che solo i gatti hanno
		System.out.println("MEOW!");
	}

	public boolean isHasBoots() {
		return hasBoots;
	}

	public void setHasBoots(boolean hasBoots) {
		this.hasBoots = hasBoots;
	}

	public void walk() {
		System.out.println("Sono un gatto e sto camminando");
	}

	public void walk(int numPassi) { // OVERLOAD DI METODO
		System.out.println("Sono un gatto e camminerò per " + numPassi + " passi");
	}
}
