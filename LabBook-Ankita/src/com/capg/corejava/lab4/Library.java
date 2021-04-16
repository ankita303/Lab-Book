package com.capg.corejava.lab4;

public class Library {

	public static void main(String[] args) {
		Book b = new Book(12843,"The Alchemist", 2, "Paul Cohelo"); 
		
		b.addItem();
		b.print();
		System.out.println("After check out number of copies left ");
		b.checkOut();
		b.print();
		System.out.println("After adding another one element  number of copies left ");
		b.addItem();
		b.print();
		Video v = new Video(1111, "The Pursuit of Hapyness", 3, 215, "ff", "drama", 1981);
		v.addItem();
		v.print();
		System.out.println("After check in number of copies left ");
		v.checkIn();
		v.print();
		

		
		

	}
}



