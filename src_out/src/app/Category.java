package app;

import java.util.*;
class Category {
    private Car[] carList;
    private String name;
    private int unity;
    public Category() {
        this("Basico",new Car[100],0);
    }
    public Category(String name) {
      this(name, new Car[100],0);
    }
    
    public Category(String name, Car[] carList, int unity) {
    	this.carList = carList;
        this.unity = 0;
        this.name = name;
    }
    
    public boolean isCar(Car newcar) {
    	 if (newcar.getCategory().equals(name) == true) {
    		return true;
    	 } else return false;
    }
    
    public void addCar(Car newcar) {
    	if (isCar(newcar) == true && existCar(newcar) == false) {    		
    		for (int i = 0; i < carList.length;i++) {
    			if (carList[i] == null) {
    				carList[i] = newcar;
    				this.unity++;
    				break;
    			} 
    		}
    	}
    }

    public boolean existCar(Car car) {
    	boolean out = false;
    	for (int i = 0; i < carList.length;i++) {
    		if (carList[i] == car) {
    			out = true;
    		}
    	}
    	return out;
    }
    public Car getCar(int index) {
    	if (carList[index] != null) {    		
    		return this.carList[index];
    	} else return null;
    }
    
   public Car[] getCarList() {
	   return carList;
   }

   public String getName() {
       return name;
   }

    public int getUnity() 
    {
        return this.unity;
    }

    public void setUnity(int unity) 
    {
        this.unity = unity; 
    }

    public void addUnity(int unity) {
        this.unity += unity;
    }

    public void addUnity() {
        addUnity(1);
    }

    public void subUnity(int unity) {
        this.unity -= unity;
    }

    public void subUnity() {
        subUnity(1);
    }

}