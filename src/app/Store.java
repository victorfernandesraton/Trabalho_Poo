package app;

import java.util.*;

public class Store {
	private String name;
	private ArrayList<Car> carList;
	private ArrayList<User> userList;
	private ArrayList<Rent> rentList;
	private ArrayList<Rent> history;
	
	public Store(String name) {
		this.name = name;
		this.carList = new ArrayList<Car>();
		this.rentList = new ArrayList<Rent>();
		this.history = new ArrayList<Rent>();
		this.userList = new ArrayList<User>();
	}
	
	public boolean AddUser(User user) {
		if (userList.add(user)) {
			return true;
		} else return false;
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	public boolean AddCar(Car car) {
		if (carList.add(car)) {
			return true;
		} else return false;
	}
	
	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	public ArrayList<Rent> getRentList() {
		return rentList;
	}
	
	public ArrayList<Rent> getHistory() {
		return rentList;
	}
	
	public Rent[] serachRent(String cpf) {
		Rent[] tempRents;
		int index = 0;
		tempRents = new Rent[history.size()];
		for (Rent rent : history) {
			if (rent.getUserCpf().equals(cpf)) {
				tempRents[index] = rent;
				index++;
			}
		}
		if (index == 0) {
			return null;
		} else return tempRents;
	}
	
	public double rentTotalCoast(String cpf) {
		double aux = 0;
		if (serachRent(cpf) != null) {			
			for (int i = 0; i < serachRent(cpf).length; i++) {
				if (serachRent(cpf)[i].getStatus().equals("Encerrado")) {
					aux += serachRent(cpf)[i].rentCoast();
				}
			}
		}
		if (aux == 0) {
			System.out.println("Não houve registro");
			return 0;
		} else return aux;
	}
	
	public void searchCategoryfull(String cpf, String category ) {
		if (serachRent(cpf) != null) {
			for(int i = 0; i < serachRent(cpf).length; i++) {
				if (searchPlate(serachRent(cpf)[i].getCarPlate()).getCategory().equals(category) && serachRent(cpf)[i].getStatus().equals("Carro retirado")) {
					searchPlate(serachRent(cpf)[i].getCarPlate()).printCar();
					serachRent(cpf)[i].printRent();
				}
			}
		} else System.out.println("Lista vazia, busca não resultou em nada");
	}
	
	public void userDataPrint(String cpf) {
		for (int i = 0; i < userList.size(); i++) {
			userList.get(i).userPrint();
		}
		for (int i = 0; i < history.size(); i++) {
			history.get(i).printRent();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addRent(Rent rent) {
		if (rentList.add(rent) && history.add(rent)) {			
			return true;
		} else return false;
	}
	
	public User searchCpf(String cpf) {
		for (User user : userList) {
			if (user.getCpf().equals(cpf)) {
				return user;
			}
		}
		return null;
	}
	
	public Car searchPlate(String plate) {
		for (Car car : carList) {
			if (car.comparePlate(plate)) {
				return car;
			}
		}
		return null;
	}
	
	public void pickCar(Rent rent) {
		if (searchPlate(rent.getCarPlate()) != null) {
			for (Car car : carList) {
				if(car.getPlate().equals(rent.getCarPlate())) {
					if (car.getStatus()) {						
						car.changeStatus();
						for (User user : userList) {
							if (user.getCpf().equals(rent.getUserCpf())) {								
								user.addActive(car);
								history.add(rent);
								System.out.println("Carro retirado");
							}
						}
					} else {
						for (Car car2 : carList) {
							if (car2.compareCar(car)) {
								for (User user : userList) {
									if (user.getCpf().equals(rent.getUserCpf())) {								
										user.addActive(car);
										history.add(rent);
									}
								}		
							}
						}
					}
				}
			} 
		} else {
			System.out.println("Error, carro não disponíevl");
		}
	}
	public boolean endRent(Rent rent) {
		for (Rent rents: rentList) {
			if (rents.equals(rent)) {
				for (Car car: searchCpf(rent.getUserCpf()).getActive()) {
					if (car.equals(searchPlate(rent.getCarPlate()))) {
						// remove o carro dos ativos do usuário
						searchCpf(rent.getUserCpf()).getActive().remove(searchPlate(rent.getCarPlate()));
					}
				}
				rents.setEnd();
				history.add(rents);
				return true;
			}
		}
		return false;
	}
}
