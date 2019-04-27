package com.app;
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

	public boolean addRent(Rent rent) {
		if (rentList.add(rent) && history.add(rent)) {
			return true;
		} else return false;
	}

	public Rent[] searchRentListWithUser(String cpf) {
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

	public Rent searchRent(String cpf) {
		for(Rent rent: rentList) {
			if(rent.getUserCpf().equals(cpf)) {
				return rent;
			}
		}
		return null;
	}

	public void isPick(Car car, Rent rent) {
		car.changeStatus();
		rent.setStatus("Carro retirado");
	}

	public boolean pickCar(Rent rent) {
		for(Rent list: rentList) {
			if (rent.equals(list)) {
				for(Car car: carList) {
					if (car.getPlate().equals(list.getCarPlate()) && car.getStatus()) {
						if (car.getPlate().equals(rent.getCarPlate())) {
							car.changeStatus();
							list.setStatus("Carro retirado");
							System.out.println("Busca interna");
							return true;
						}
					}
				}
			} else {
				System.out.println("Busca externa");
				for (Car car2: carList) {
					if (car2.getStatus() && searchPlate(rent.getCarPlate()).compareCar(car2)) {
						System.out.println(car2.getPlate());
						rent.setCarPlate(car2.getPlate());
							car2.changeStatus();
							rent.setStatus("Carro retirado");
							return false;
					}
				}
			}
		}
		return false;
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

	public void searchCategoryfull(String cpf, String category ) {
		if (searchRentListWithUser(cpf) != null) {
			for(int i = 0; i < searchRentListWithUser(cpf).length; i++) {
				if (searchRentListWithUser(cpf)[i] != null) {
					if (searchPlate(searchRentListWithUser(cpf)[i].getCarPlate()).getCategory().equals(category) && searchRentListWithUser(cpf)[i].getStatus().equals("Carro retirado")) {
						searchPlate(searchRentListWithUser(cpf)[i].getCarPlate()).printCar();
						searchRentListWithUser(cpf)[i].printRent();
						for (Car car: carList) {
							if (searchRentListWithUser(cpf)[i].getCarPlate().equals(car)) {
								car.printCar();
							}

						}

					}
				}
			}
		} else System.out.println("Lista vazia, busca não resultou em nada");
	}

	public double rentTotalCoast(String cpf) {
		double aux = 0;
		if (searchRentListWithUser(cpf) != null) {
			for (int i = 0; i < searchRentListWithUser(cpf).length; i++) {
				if (searchRentListWithUser(cpf)[i].getStatus().equals("Encerrado")) {
					aux += searchRentListWithUser(cpf)[i].rentCoast();
				}
			}
		}
		if (aux == 0) {
			System.out.println("Não houve registro");
			return 0;
		} else return aux;
	}

	public void userDataPrint(String cpf) {
		for (int i = 0; i < userList.size(); i++) {
			userList.get(i).userPrint();
		}
		for (int i = 0; i < history.size(); i++) {
			if (history.get(i).getUserCpf().equals(cpf))
				history.get(i).printRent();
					for (Car car: carList) {
						if (history.get(i).getCarPlate().equals(car.getPlate())) {
						car.printCar();
					}
				}
			}
		}

	public boolean AddUser(User user) {
		if (userList.add(user)) {
			return true;
		} else return false;
	}

	public boolean AddCar(Car car) {
		if (carList.add(car)) {
			return true;
		} else return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getUserList() {
		return userList;
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
}