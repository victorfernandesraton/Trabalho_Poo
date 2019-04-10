package app;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
        Car car1 = new Car("Clio","Red","JGR 5615",(short) 2012,200);
        Prod prod1 = new Prod(car1);
        prod1.addUnity();
       
    }
}