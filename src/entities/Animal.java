package entities;

import java.util.Objects;

public abstract class Animal {
	// La classe Animal sarà la classe PADRE
	// In questa classe andrò ad inserire tutte le caratteristiche comuni a tutti gli animali

	// Lista attributi
	protected String name;
	protected int age;


	// Lista costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Lista metodi
	// Nelle classi astratte posso inserire sia metodi CONCRETI che metodi ASTRATTI

	// METODI ASTRATTI
	// I metodi astratti sono dei metodi 'vuoti' che servono per obbligare i figli ad avere un certo
	// metodo
	// Ogni figlio deciderà come implementare tale metodo facendone un @Override
	// Questo mi garantirà quindi che ogni figlio avrà con certezza un metodo fatto così
	public abstract void getInfo();

	// METODI CONCRETI
	// I metodi concreti vengono ereditati dai figli e questi possono decidere o di usarli per come sono
	// oppure di sovrascriverli facendo un @Override
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return age == animal.age && Objects.equals(name, animal.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
