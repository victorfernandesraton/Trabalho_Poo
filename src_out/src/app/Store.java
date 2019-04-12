package app;

class Store {
    private String name;
    private Rent[] history;
    private Category[] categoryList;
    private User[] userList;
    
	public Store(String name) {
		super();
		this.name = name;
		this.history = new Rent[100];
		this.categoryList = new Category[3];
		this.userList = new User[100];
		categoryList[0] = new Category("Basico");
		categoryList[1] = new Category("Esporte");
		categoryList[2] = new Category("Superluxo");
		
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

	public boolean isUser(User user) {
		for(int i = 0; i < userList.length; i++) {
			if (userList[i] != null && user.getCpf().equals(userList[i].getCpf()) == true) {
				return true;
			}
		}
		return false;
	}

	public boolean addUser(User user) {
		if (isUser(user) != true) {
			for(int i= 0; i < userList.length;i++) {
				if (userList[i] == null) {
					userList[i] = user;
					return true;
				}
			}
		}
		return false;
	}
	
	public Rent getHistory(int index) {
		if (isHistory(index) == true) {
			return history[index];
		} else return null;
	}
	
	public void addCategory(Category newCategory) {
		for(int i = 0; i < categoryList.length;i++) {
			if (categoryList[i] == newCategory) {
				break;
			} else if (categoryList[i] == null) {
				categoryList[i] = newCategory;
			}
		}
	}
	
	public Category getCategory(int index) {
		if (categoryList[index] != null) {
			return categoryList[index];
		} else return null;
	}
	
	public boolean addCartoCategory(Car car) {
		for(int i = 0; i < categoryList.length;i++) {
			if (categoryList[i].isCar(car) == true && categoryList[i].existCar(car) == false) { 
				categoryList[i].addCar(car);
				return true;
			}
		}
		return false;
	}
	
	public Car getcar(String carname, String category) {
		for (int i= 0; i< categoryList.length; i++) {
			if (category.equals(categoryList[i].getName())) {
				for (int j = 0; j < categoryList[i].getCarList().length; j++) {
					if (carname.equals(categoryList[i].getCar(j).getModel()) == true) {
						return categoryList[i].getCar(j);
					}
				}
			}
		}
		return null;
	}
	
	 public void rentCar(Car car) {
		 for (int j = 0; j < categoryList.length; j++) {
			 if (categoryList[j].existCar(car)== true) {
		    		for (int i = 0; i < categoryList[j].getCarList().length; i++) {
						if (categoryList[j].getCar(i) == car && categoryList[j].getCar(i).getStatus() == true) {
							categoryList[j].subUnity();
							categoryList[j].getCar(i).changeStatus();
							System.out.println("O status do carro" +  categoryList[j].getCar(i).getModel()+ " è "+ categoryList[j].getCar(i).getStatus());
						}
					}
		    	}
		    }
		 }
	    	
}