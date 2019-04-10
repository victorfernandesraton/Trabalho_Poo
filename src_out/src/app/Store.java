package app;

class Store {
    private String name;
    private Rent[] history;
    private Prod[] prodList;
    private User[] userList;
    
	public Store(String name) {
		super();
		this.name = name;
		this.history = new Rent[100];
		this.prodList = new Prod[3];
		this.userList = new User[100];
		prodList[0] = new Prod((short) 1);
		prodList[1] = new Prod((short) 2);
		prodList[2] = new Prod((short) 3);
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isHistory(int index) {
		if (history[index] != null) {
			return true;
		} else return false;
	}
	
	public void addHistory(Rent newrent) {
		for (int i = 0; i < history.length; i++) {
			if (history[i] == null) {
				history[i] = newrent;
				break;
			}
		}
	}
	
	public Rent getHistory(int index) {
		if (isHistory(index) == true) {
			return history[index];
		} else return null;
	}
	
	public void addProd(Prod newprod) {
		for(int i = 0; i < prodList.length;i++) {
			if (prodList[i] == newprod) {
				break;
			} else if (prodList[i] == null) {
				prodList[i] = newprod;
			}
		}
	}
	
	public Prod getProd(int index) {
		if (prodList[index] != null) {
			return prodList[index];
		} else return null;
	}
	
	public void addCartoProd(Car car) {
		for(int i = 0; i < prodList.length;i++) {
			if (prodList[i].isCar(car) == true && prodList[i].existCar(car) == false) { 
				prodList[i].addCar(car);
			}
		}
	}
	
	public Car getcar(int index, int prodtype) {
		return prodList[prodtype].getCar(index);
	}
	
	 public void rentCar(Car car) {
		 for (int j = 0; j < prodList.length; j++) {
			 if (prodList[j].existCar(car)== true) {
		    		for (int i = 0; i < prodList[j].getCarList().length; i++) {
						if (prodList[j].getCar(i) == car && prodList[j].getCar(i).getStatus() == true) {
							prodList[j].subUnity();
							prodList[j].getCar(i).changeStatus();
							System.out.println("O status do carro" +  prodList[j].getCar(i).getModel()+ " è "+ prodList[j].getCar(i).getStatus());
						}
					}
		    	}
		    }
		 }
	    	
}