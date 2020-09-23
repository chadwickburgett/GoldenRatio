package model;

public class CoffeeConverter {
	private int coffee;
	private double water;
	
	public CoffeeConverter() {
	super();
	// TODO Auto-generated constructor stub
	}
	
	public CoffeeConverter(int coffee) {
	super();
	this.coffee = coffee;
	setRatio(coffee);
	}
	
	public void setCoffee(int coffee) {
	this.coffee = coffee;
	setRatio(coffee);
	}
	
	public int getCoffee() {
		return coffee;
	}
	
	public void setWater(float water) {
		this.water = water;
	}
	
	public double getWater() {
		return water;
	}
	
	public void setRatio(int coffee) {
	final double GOLDEN_RATIO = 17.42;
	float a = Math.round(coffee*GOLDEN_RATIO);
	setWater(a);
	}
	@Override
	public String toString() {
	return "CoffeeConverter [coffee=" + coffee + ", water=" + water + "]";
	}
}
