package com.example.PetStore;

public class Pet {

	private int id;
	private String name;
	private String breed;
	
	public Pet() {}
	public Pet(int id, String name, String breed) {
		this.id = id;
		this.name = name;
		this.breed = breed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "pet info : " + getId() + " : " + getName() + " : " + getBreed();
	}
}
