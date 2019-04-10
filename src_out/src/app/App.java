package app;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
    	Car car1 = new Car("Clio", "Red", "JFK 12012", (short) 2012, 20000);
    	Prod prod1 = new Prod(car1);
    	System.out.println(prod1.getCar().getColor());
    }
}
