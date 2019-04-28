package com.app;

import java.text.SimpleDateFormat;
import java.util.Calendar; // para facilitar a aplicação da data
import java.util.Random; // para gerar um id de protocolo

public class Rent {
	private String id, status, userName, userCpf, carPlate, carModel;
	private double total;
	private Calendar datastart, dataend;

	// porque não pude aplicar sobrecarga completa: neste formato ocorre erro
	// ao gerar n de protocolo randônico
	public Rent(Car car, User user) {
        Random random = new Random();
		this.status = "Pedido realizado";
		this.id = Integer.toString(random.nextInt(999999)+1000000);
		this.carModel = car.getModel();
		this.carPlate = car.getPlate();
		this.userCpf = user.getCpf();
		this.userName = user.getName();
		this.total = car.getPrice();
		this.datastart = Calendar.getInstance();
	}

	public Rent(Car car, String id, User user, String status) {
		this.carPlate = car.getPlate();
		this.id = id;
		this.userName = user.getName();
		this.userCpf = user.getCpf();
		this.status = status;
	}

	public void initRent() {
		this.status = "Pedidio retiraro";
	}

	public Calendar getDatastart() {
		return datastart;
	}

	public void setDatastart(Calendar datastart) {
		this.datastart = datastart;
	}

	public void setEnd() {
		this.dataend = Calendar.getInstance();
		this.status = "Encerrado";
	}

	public Calendar getDataend() {
		return this.dataend;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public void SetCarPlate(Car car) {
		setCarPlate(car.getPlate());
	}
	
	public String getCar() {
		return carPlate;
	}
	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCpf() {
		return userCpf;
	}

	public void setUserCpf(String userCpf) {
		this.userCpf = userCpf;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public double rentCoast() {
		if (dataend == null) {
			setEnd();
		}
		double dif = Math.abs(dataend.get(Calendar.MILLISECOND)) - Math.abs(datastart.get(Calendar.MILLISECOND));
		if (dif < 1) {
			return 0;
		} else {
			return Math.ceil(dif/86400000)*total;
		}
	}

	public void printRent() {
		System.out.println("--ALUGUEL--");
		SimpleDateFormat  sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Cliente: " +userName + " CPF: "+userCpf);
		System.out.println("Carro: "+carModel + " Placa: "+carPlate);
		System.out.println("Status: "+ this.status);
		System.out.println("Data de entrada: "+ sdt.format(datastart.getTime()));
		if (dataend != null) {
			System.out.println("Data de saída: "+sdt.format(dataend.getTime()));
			System.out.println("Custo :"+ rentCoast());
		}
	}
}
