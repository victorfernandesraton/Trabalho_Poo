package com.app;

public class Car {
	private String model, plate, color;
	private String category;
	private int ymake;
	private double price;
	private boolean status;

	// sobrecarga
	public Car(String model, String plate,String color, int ymake) {
		this(model,plate,color,new Category("ásica",130),ymake);
	}

	// construtor
	public Car(String model, String plate,String color, Category category, int ymake) {
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.category =  category.getName();
		this.ymake = ymake;
		this.price = category.getPrice();
	}

	// gettters & setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYmake() {
		return ymake;
	}

	public void setYmake(int ymake) {
		this.ymake = ymake;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void changeStatus() {
		if (status == true) {
			status = false;
		} else status = true;
	}

	public boolean compareCar(Car car) {
		if (car.getCategory().equals(category) && car.getYmake() >= this.ymake) {
			return true;
		} else return false;
	}

	public boolean comparePlate(String plate) {
		if (plate.equals(this.plate)) {
			return true;
		} else return false;
	}

	public void printCar() {
		System.out.println("Modelo: "+this.model + " Placa :"+this.plate);
		System.out.println("Categoria"+this.category);
	}
}
