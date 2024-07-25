package entities;

import enums.TipoStudente;
import interfaces.Jumper;
import interfaces.Runner;

import java.util.Objects;
import java.util.Random;

public class Student implements Runner, Jumper {
	// ATTRIBUTI STATICI (attributi di classe, cioè non serve un oggetto per accedervi)
	private static int numStudentiCreati = 0;
	// public String surname; // Se metto PUBLIC allora chiunque in tutta l'app potrà accedere a questo membro
	// String name; // Se non metto niente l'accessibilità viene definita come PACKAGE-FRIENDLY ovvero
	// solo le classi all'interno dello stesso package possono accedere a questo membro
	// ATTRIBUTI (caratteristiche di tutti gli studenti)
	private int id; // Se è PRIVATE si può leggere/scrivere solo dall'interno di questa classe
	private String name;
	private String surname;
	private boolean isFullStack;
	private TipoStudente tipoStudente;

	// COSTRUTTORI (metodi speciali che mi servono a creare un nuovo Studente)
	// I COSTRUTTORE
	public Student() {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = "Nome di default";
		this.surname = "Cognome di default";
		this.isFullStack = true;
		this.tipoStudente = TipoStudente.FULLSTACK;
		numStudentiCreati++;
	}

	// II COSTRUTTORE
	public Student(String name) {
		this();
		this.name = name;
	}

	// III COSTRUTTORE
	public Student(String name, String surname, boolean isFullStack, TipoStudente tipoStudente) {
		this(name);
		this.surname = surname;
		this.isFullStack = isFullStack;
		this.tipoStudente = tipoStudente;
	}

	// METODI STATICI (metodi di classe, ovvero non serve un oggetto per poterli usare)
	public static int getNumStudentiCreati() {
		return numStudentiCreati;
	}

	// METODI (ovvero le azioni che un oggetto Studente potrà eseguire)
	public void sayHello() {
		System.out.println("Ciao io sono " + this.name + ", " + this.surname + ", il mio id è: " + this.id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id && isFullStack == student.isFullStack && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && tipoStudente == student.tipoStudente;
	}


	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullStack=" + isFullStack +
				", tipoStudente=" + tipoStudente +
				'}';
	}

	// GETTERS & SETTERS

	public int getId() { // Per l'id faccio solo il getter perché non voglio sia sovrascrivibile
		return id;
	}

	public String getName() { // Per il nome faccio sia getter che setter perché mi sta bene poter sia
		// leggere che sovrascrivere il nome
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 3)
			this.name = name;
		else System.out.println("Nome troppo corto");
	}

	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		if (surname.length() >= 3)
			this.surname = name;
		else System.out.println("Nome troppo corto");
	}

	public boolean isFullStack() {
		return isFullStack;
	}

	public void setFullStack(boolean fullStack) {
		isFullStack = fullStack;
	}

	public TipoStudente getTipoStudente() {
		return tipoStudente;
	}

	public void setTipoStudente(TipoStudente tipoStudente) {
		this.tipoStudente = tipoStudente;
	}


	@Override
	public void jump(int cm) {
		System.out.println("Ciao mi chiamo " + this.name + " e salterò " + cm + " esami");
	}

	@Override
	public void run(int km) {
		System.out.println("Ciao mi chiamo " + this.name + " e correrò " + km + " km per scappare da lezione");
	}
}
