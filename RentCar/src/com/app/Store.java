package com.app;
import java.util.*;
//
public class Store {
	private String name;
	private ArrayList<Car> carList;
	private ArrayList<User> userList;
	private ArrayList<Rent> rentList;
	private ArrayList<Category> categoryList;

	public Store(String name) {
		this.name = name;
		this.carList = new ArrayList<Car>();
		this.rentList = new ArrayList<Rent>();
		this.userList = new ArrayList<User>();
		this.categoryList = new ArrayList<Category>();
	}
	
	public boolean addCategory(Category category)  {
		if (categoryList.add(category)) {
			return true;
		} else return false;
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

	public boolean addRent(Rent rent) {
		if (rentList.add(rent)) {
			return true;
		} else return false;
	}

	public boolean endRent(Rent rent) {
		for (Rent obj : rentList) {
			if (obj.equals(rent)) {
				obj.setEnd();
				for(User obj2 : userList) {
					if (obj2.getCpf().equals(obj.getUserCpf())) {
						obj2.removeActive(searchPlate(obj.getCarPlate()));
						obj2.addDebit(obj.getTotal());
					}
				}
				return true;			
			}
		}
		return false;
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

	public Rent searchUniqueRent(String cpf, String plate) {
		for (Rent obj :rentList) {
			if (obj.getCarPlate().equals(plate) && obj.getUserCpf().equals(cpf)) {
				return obj;
			}
		}
		return null;
	}

	public boolean pickCar(Rent tmpRent) {
		if (searchPlate(tmpRent.getCarPlate()).getStatus()) {
			for (Rent obj : rentList) {
				if (tmpRent.equals(obj)) {
					obj.initRent();
					for (Car obj2 : carList) {
						if (obj2.getPlate().equals(tmpRent.getCarPlate())) {
							obj2.changeStatus();
							for (User user : userList) {
								if (user.getCpf().equals(obj.getUserCpf())) {
									user.addActive(obj2);
								}
							}
							return true;
						}
					}
				}
			}
		} else {
			for (Rent obj : rentList) {
				if (tmpRent.equals(obj)) {
					obj.initRent();
					for (Car obj2 : carList) {
						if (obj2.getStatus() && obj2.compareCar(searchPlate(obj.getCarPlate()))) {
							obj.SetCarPlate(obj2);
							for (User user : userList) {
								if (user.getCpf().equals(obj.getUserCpf())) {
									user.addActive(obj2);
								}
							}
							obj2.changeStatus();
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public int totalRentSameCategory(String cpf, String category) {
		int total = 0;
		for (Rent obj : rentList) {
			if (obj.getUserCpf().equals(cpf)) {
				for (Car obj2 : carList) {
					if (obj2.getPlate().equals(obj.getCarPlate()) && obj2.getCategory().equals(category)) {
						total++;
					}
				}
			}
		}
		return total;
	}

	public void userDataPrint(User user) {
		String cpf = user.getCpf();
		System.out.println(cpf);
		for (User obj : userList) {
			if (obj.getCpf().equals(cpf)) {
				obj.userPrint();
				System.out.println("O custo total dos alugueis é:"+ obj.getDebit());
				System.out.println("total de carros básicos alugados "+totalRentSameCategory(obj.getCpf(), "Básico"));
				System.out.println("total de carros luxo alugados "+totalRentSameCategory(obj.getCpf(), "Luxo"));
				System.out.println("total de carros superluxo alugados "+totalRentSameCategory(obj.getCpf(), "Superluxo"));

			}
		}
		for (Rent obj :rentList) {
			if (obj.getUserCpf().equals(cpf)) {
				obj.printRent();
				for (Car obj2 : carList) {
					if (obj2.getPlate().equals(obj.getCarPlate())) {
						obj2.printCar();
					}
				}
			}
		}
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}