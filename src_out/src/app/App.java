package app;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Menu mainmenu = new Menu();
        while(mainmenu.initmenu() == true);
    }
}