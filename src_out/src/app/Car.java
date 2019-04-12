package app;

public class Car {

	private String model,color, plate, category;
	private double price;
	private short yfactory;
	private boolean status;
	
	public Car(String model, String color, String plate, short yfactory, double price) 
	{
		this(model, color, plate, "Basico", yfactory, price,0);
	}

	public Car(String model, String color, String plate, String category, short yfactory, double price,int  unity) {
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.category = category;
		this.yfactory = yfactory;
		this.price = price;
		this.status = true;
	}
	
	public String getModel() 
	{
		return this.model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public String getColor() 
	{
		return this.color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public String getPlate() 
	{
		return this.plate;
	}

	public void setPlate(String plate) 
	{
		this.plate = plate;
	}

	public String getCategory() 
	{
		return this.category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public short getYfactory() 
	{
		return this.yfactory;
	}

	public void setYfactory(short yfactory) 
	{
		this.yfactory = yfactory;
	}


	public double getPrice() 
	{
		return this.price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public boolean getStatus() {
		return status;
	}

	public void changeStatus() {
		if (status = true) {
			status = false;
		} else status = false;
	}
	
	
	
}
