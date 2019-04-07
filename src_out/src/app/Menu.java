package app;

import  java.io.*;
// necessário o import de classe para trabalhar com objetos internos
// o bluej esconde

public class Menu {
    // lista de clientes
    private User listaCliente[] = new User[100];
    // menu principal
    boolean initmenu() throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        boolean tempout = false;
        System.out.println("--Selecionar opção--");
        System.out.println("1) Adicionar cliente");

        switch (Integer.valueOf(input.readLine()).intValue()) {
            case 1:
                addCliente();
                tempout = true;
                break;
            case 0:
                System.out.println("saindo");
                tempout = false;
                break;
            case 2:
            	verCliente();
                tempout = true;
                break;
        }
        return tempout;
    }

    // add clienete
    void addCliente()  throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        String tempnome, tempcpf;
        System.out.println("Inserir nome");
        tempnome = input.readLine();
        System.out.println("Inserir CPF");
        tempcpf = input.readLine();
        User pessoa = new User(tempnome,tempcpf);
        addClientToList(pessoa);
    }

    // add clientea lista

    void addClientToList(User cliente) {
        for (int i = 0; i < this.listaCliente.length; i++) {
            if (listaCliente[i] == null) {
                listaCliente[i] = cliente;
                break;
            }
        }
    }

    void verCliente() {
        verCliente(0);
    }
    // verlista de cliente por indice
    void verCliente(int index) {
        if (index == 0) {
            for (int i = 0; i < this.listaCliente.length; i++) {
            	if (listaCliente[i] != null) {            		
            		System.out.println(listaCliente[i].getName());
            	}
            }
        } else {
            --index;
            for (int i = 0; i < this.listaCliente.length; i++) {
                if (i == index) {
                    System.out.println(listaCliente[i].getName());
                }
            }
        }
    }
}
