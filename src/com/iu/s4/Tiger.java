package com.iu.s4;

public class Tiger extends Animal{
	
	public String getWeapon() {
		return weapon;
	}



	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}



	private String weapon;
	
	

	@Override
	public void sound() {
		System.out.println("어흥~~~");
	}
	
	
	public void wash() {
		System.out.println("온천욕 하기");
	}
	
	

}
