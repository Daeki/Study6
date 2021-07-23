package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();
		computer.setCompany("Imac");
		phone.setCompany("Apple");
		tablet.setCompany("Samsung");
		
		computer.info();
		phone.info();
		tablet.info();
		
		computer.info2();
		
		

	}

}
