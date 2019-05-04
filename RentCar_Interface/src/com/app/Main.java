package com.app;

public class Main {
	public static void main(String[] args) {
		// criaodo loja
		Store store = new Store("teste");
		// adicionando usuários a lista de cliente da loja
		System.out.println("Add user: "+ store.AddUser( new User("Victor","862288875-48", "vfbr@gmail.com", "999278378")));
		System.out.println("Add user: "+ store.AddUser( new User("Ana","121212", "ana@unifacs.edu.br", "0000")));
		// adicionando carros á loja
		System.out.println("Add car Uno: "+ store.AddCar( new Car("Uno com escada","VFB 1291" , "Branco gelo", "Superluxo", 1993)));
		System.out.println("Add car gol: "+store.AddCar( new Car("gol","VFB 1271" , "Branco gelo", "Superluxo", 1993)));
		// gerando pedidos
		System.out.println("usuário Victor pede uno "+ store.addRent(new Rent(store.searchPlate("VFB 1291"),store.searchCpf("862288875-48"))));		
		System.out.println("usuário Ana pede uno "+ store.addRent(new Rent(store.searchPlate("VFB 1291"),store.searchCpf("121212"))));
		// retira o automóvel e inicia a cobrança
		System.out.println("usuário Victor retira carro "+ store.pickCar(store.searchUniqueRent("862288875-48", "VFB 1291")));
		// como victor retirou o carro ana irá pegar um outro carro similar
		System.out.println("usuário Ana retira carro "+ store.pickCar(store.searchUniqueRent("121212", "VFB 1291")));
		// imprime os dados de victor e de ana
		store.userDataPrint(store.searchCpf("862288875-48"));
		store.userDataPrint(store.searchCpf("121212"));
		// victor entrega o carro que está em sua mão
		store.endRent(store.searchUniqueRent("862288875-48","VFB 1291"));
		/// imprime os dados de victor e de ana de novo
		store.userDataPrint(store.searchCpf("862288875-48"));
		store.userDataPrint(store.searchCpf("121212"));
	}
}