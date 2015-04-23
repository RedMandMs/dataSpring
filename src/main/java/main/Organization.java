package main;

import java.util.List;


public class Organization{
	
	
	
	public Organization(int id, String name, int iNN, String addres) {
		super();
		this.id = id;
		this.name = name;
		INN = iNN;
		Addres = addres;
	}

	private int id;
	
	private String name;
	
	private int INN;
	
	private String Addres;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getINN() {
		return INN;
	}

	public void setINN(int iNN) {
		INN = iNN;
	}

	public String getAddres() {
		return Addres;
	}

	public void setAddres(String addres) {
		Addres = addres;
	}

	@Override
	public String toString() {
		return "id = " + id + "; name = " + name + "; INN = " + INN + "; address = " + Addres ;
	}
	
	

}
