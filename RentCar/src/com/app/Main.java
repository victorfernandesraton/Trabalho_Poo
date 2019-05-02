package com.app;

public class Main {
	public static void main(String[] args) {
		Car[] car = new Car[100];
		User[] user = new User[2];
		Rent[] rent = new Rent[100];
		user[0] = new User("Victor","862288875-48", "vfbr@gmail.com", "999278378");
		user[1] = new User("Paulo","8478375", "vfbr@gmail.com", "999278378");
		car[0] = new Car("Uno com escada","VFB 1271" , "Branco gelo", "Superluxo", 1993);
		car[1] = new Car("Uno com escada","VFB 1201" , "Branco gelo", "Superluxo", 1993);
		rent[0] = new Rent(car[0], user[0]);
		rent[1] = new Rent(car[0],user[1]);
		Store store = new Store("teste");
		store.AddCar(car[0]);
		store.AddCar(car[1]);
		store.addRent(rent[0]);
		store.addRent(rent[1]);
		System.out.println(store.getCarList().get(0).getStatus());
		System.out.println("alugar"+store.pickCar(store.getRentList().get(0)));
		System.out.println("alugar"+store.pickCar(store.getRentList().get(1)));
		System.out.println(store.getCarList().get(0).getStatus());
		System.out.println(store.getCarList().get(1).getStatus());
		System.out.println(store.getRentList().get(0).getCarPlate());
		System.out.println(store.getRentList().get(1).getCarPlate());
		store.userDataPrint("862288875-48");
	}
}