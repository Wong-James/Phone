package com.james.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy samsung = new Galaxy("S20", 100, "Verizon", "Ring ring ring!");
		Iphone apple = new Iphone("12", 98, "AT&T", "Ding ding ding!");
		samsung.displayInfo();
		System.out.println(samsung.ring());
		System.out.println(samsung.unlock());
		
		
		apple.displayInfo();
		System.out.println(apple.ring());
		System.out.println(apple.unlock());

	}

}