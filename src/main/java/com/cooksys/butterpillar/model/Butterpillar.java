package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	private double length;
	private double leavesEaten;

	public Butterpillar(double d, double e) {
		length = d;
		leavesEaten = e;
	}

	public Butterpillar() {
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length; // TODO: to be implemented
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten; // TODO: to be implemented
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}
	
	public boolean equals(Butterpillar b) {
		return length == b.length && leavesEaten == b.leavesEaten;
	}
	
	@Override
	public String toString() {
		return "Butterpillar [length:" + length + ", leavesEaten: " + leavesEaten + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
