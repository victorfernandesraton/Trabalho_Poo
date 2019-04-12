package app;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
    	// um carro único
        Car car1 = new Car("Clio","Red","JGR 5615",(short) 2012,200);
        User user1 = new User("Victor", "86228887548");
        Car car2 = new Car("Mercedes 15", "Pink", "IFG 1200", "Esporte", (short) 1996, 90000, 1);
        // uma lista de carros do tipo 1 que é o básico
        Store store1 = new Store("teste");
        // detalhe ela inicia com 3 categorias
        store1.addCartoCategory(car1); // adiciona o carro 1
        System.out.println(car1.getCategory()); // adiciona o carro 2
        System.out.println(store1.getcar("Clio","Basico").getStatus());
        System.out.println(store1.addUser(user1));
        store1.rentCar(car1);        
    }
}