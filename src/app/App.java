package app;

import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		Car[] car = new Car[100];
		User[] user = new User[2];
		Rent[] rent = new Rent[100];
		user[0] = new User("Victor","862288875-48", "vfbr@gmail.com", "999278378");
		car[0] = new Car("Uno com escada","VFB 1201" , "Branco gelo", "Superluxo", 1993);
		car[1] = new Car("Corsa","GGG 777","Branco gelo","Superluxo",1994);
		rent[0] = new Rent(car[0], user[0]);
		Store store = new Store("teste");
		System.out.println(car[0].compareCar(car[1]));
		System.out.println(store.AddCar(car[0]));
		System.out.print(store.getCarList().get(0).getModel());
		rent[0].setEnd();
		rent[0].printRent();
	}
}
