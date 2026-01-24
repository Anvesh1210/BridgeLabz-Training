package com.collections.votingsystem;

//class to represent a Candidate
public class Candidate {

	//candidate attributes
    private String name;

    //constructor to initialize candidate
    public Candidate(String name) {
        this.name = name;
    }

    //method to get candidate name
    public String getName() {
        return name;
    }

    //overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Candidate)) return false;
        Candidate other = (Candidate) obj;
        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    //overriding toString() method to display candidte
    @Override
    public String toString() {
        return name;
    }
}

