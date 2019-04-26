package app;

public class Car {
	private String model, plate, color;
	private String category;
	private int ymake;
	private double price;
	private boolean status;
	
	// sobrecarga
	public Car(String model, String plate,String color, int ymake) {
		this(model,plate,color,"Básico",ymake);
	}
	
	// construtor
	public Car(String model, String plate,String color, String category, int ymake) {
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.category =  category;
		this.ymake = ymake;
		 if (category == "Luxo") {
			this.price = 160;
		} else if (category == "Superluxo") {
			this.price = 210;
		} else this.price = 120;
		 this.status = true;
	}
	
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
	
	public void changeStatus() {
		if (status == true) {
			status = false;
		} else status = true;
	}
	
	public boolean compareCar(Car car) {
		if (car.getStatus() == this.status && car.getYmake() >= this.ymake) {
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
	}
}
