package com.app;

import java.util.ArrayList;

public class User {
	private String cpf, email, phone, name;
	private ArrayList<Car> actuallist;
	private double debit;

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public ArrayList<Car> getActuallist() {
		return actuallist;
	}

	public User(String name, String cpf, String email, String phone) {
		this(name,cpf,email,phone,0,4);
	}

	public User(String name, String cpf, String email, String phone, double debit, int limitactive) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
		this.actuallist = new ArrayList<Car>();
		this.debit = debit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf()
	{
		return this.cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public boolean addActive(Car car) {
		if (actuallist.add(car)) {
			return true;
		}
		return false;
	}

	public boolean removeActive(Car car) {
		for (Car obj : actuallist) {
			if (obj.getPlate().equals(car.getPlate()) {
				actuallist.remove(index)
			}
		}
	}

	public ArrayList<Car> getActive() {
		return actuallist;
	}

	public void userPrint() {
		System.out.println("--DADOS DO USUARIO--");
		System.out.println("Nome: "+this.name + " CPF: "+this.cpf);
		System.out.println("--LISTA DE ATIVOS--");
		for (Car car : actuallist) {
			for (int i = 0; i < actuallist.size(); i++) {
				car.printCar();
			}
		}
	}
}

