package com.cooksys.butterpillar.model;

public class Catterfly {
	
	double wingspan;
	double weight;

	public Catterfly(double d, double e) {
		wingspan = d;
		weight = e;
	}

	public Catterfly() {
		// TODO Auto-generated constructor stub
	}

	public double getWingspan() {
		return wingspan; // to be implemented
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public double getWeight() {
		return weight; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean equals(Catterfly c) {
		return wingspan == c.wingspan && weight == c.weight;
	}
	
	@Override
	public String toString() {
		return "Catterpillar [wingspan:" + wingspan + ", weight: " + weight + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
