package com.birdsanctuary;

//base bird class
public abstract class Bird {

	// attributes for Bird
	protected String name;
	protected String species;
	protected String id;

	// constructor for bird
	public Bird(String name, String species, String id) {
		this.name = name;
		this.species = species;
		this.id = id;
	}

	// method for bird eating
	public void eat() {
		System.out.println(name + " is eating");
	}

	// method for getting bird id
	public String getId() {
		return id;
	}

	// method for getting bird name
	public String getName() {
		return name;
	}

	// method for getting bird species
	public String getSpecies() {
		return species;
	}
}
