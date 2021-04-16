package com.capg.corejava.lab4;

public abstract class Item {

	private int identification_number;
    private String title;
    private int number_of_copies;
    
		Item(int identification_number, String title,int number_of_copies)
		{
		this.identification_number = identification_number;
    	this.title = title;
    	this.number_of_copies = number_of_copies;
		}
			
		
		 public int getIdentification_number() {
				return identification_number;
			}



			public String getTitle() {
				return title;
			}



			public int getNumber_of_copies() {
				return number_of_copies;
			}
			public void setIdentification_number(int identification_number) {
				this.identification_number = identification_number;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public void setNumber_of_copies(int number_of_copies) {
				this.number_of_copies = number_of_copies;
			}
			public void addItem()
			{
				number_of_copies++;	
			}
			public void checkIn()
			{
				number_of_copies = number_of_copies + 1;
			}
			public  void checkOut()
			{
				number_of_copies = number_of_copies - 1;
			}
			
			public void print()
			{   System.out.println("identification number "+identification_number);
				System.out.println("Title "+title);
				
				System.out.println("Number of copies are "+number_of_copies);
			}
			

}
