package entities;

import java.util.Objects;

public class Animal {
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
