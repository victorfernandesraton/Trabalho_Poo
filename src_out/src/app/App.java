package app;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
    	// um carro único
        Car car1 = new Car("Clio","Red","JGR 5615",(short) 2012,200);
        Car car2 = new Car("Mercedes 15", "Pink", "IFG 1200", (short) 2, (short) 1996, 90000, 1);
        // uma lista de carros do tipo 1 que é o básico
        Store store1 = new Store("teste");
        // detalhe ela inicia com 3 categorias
        store1.addCartoProd(car1); // adiciona o carro 1
        store1.addCartoProd(car2); // adiciona o carro 2
        System.out.println(store1.getcar(0, 0).getStatus()); // obs criar busca por placa no sistema inteiro
        System.out.println(store1.getcar(0, 1).getModel()); // buscar por categoria e outras coisqas
        System.out.println(store1.getProd(0).getUnity()); /// unidade de determinados carros de uma mesma categorai
    }
}