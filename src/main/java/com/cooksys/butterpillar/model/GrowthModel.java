package com.cooksys.butterpillar.model;

public class GrowthModel {

	private double lengthToWingspan;
	private double leavesEatenToWeight;

	public double getLengthToWingspan() {
		return lengthToWingspan; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		// to be implemented
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		double le = butterpillar.getLeavesEaten();
		double len = butterpillar.getLength();
		return new Catterfly(le * leavesEatenToWeight, len * lengthToWingspan); // to be implemented
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		double le = catterfly.getWingspan();
		double len = catterfly.getWeight();
		return new Butterpillar(le / leavesEatenToWeight, len / lengthToWingspan); 
	}
	
	public boolean equals(GrowthModel g) {
		return leavesEatenToWeight == g.leavesEatenToWeight && lengthToWingspan == g.lengthToWingspan;
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
