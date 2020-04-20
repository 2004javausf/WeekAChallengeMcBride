package com.revature.javabeans;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// Scanner
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("What's your name?");

	    String yourName = myObj.nextLine();  
	    System.out.println("Hi " + yourName);
		
		// Wrapper
	    
	    char no ='c';
	    Character c = no;
		
	//Print out of Java Beans - Color and Name	
		Name n= new Name();
		n.setName("Dom");
		n.setHeight(5.9);
		n.setAge(35);
	
		Colors c= new Colors();
		c.setColor("blue");
		
		System.out.println(n.getName());
		System.out.println(c.getColor()); 
		// IF statement
		int i=5;
		if (i < 5) {
			System.out.println("My number is less than 5");
		}
		else { System.out.println("My number could be greater than 5");
	}

		//Switch Case
		String MyColor = "green";
		switch (MyColor) 
		{
			case "white": 
				System.out.println("My color is white");
				break;
			case "red": 
				System.out.println("My color is red");
			break;
			case "green": 
				System.out.println("My color is money green");
				break;
			default:
				System.out.println("I'm pretty dumb today!");
		}
		
		// Enhanced for loop
		
		int[] myNumbers = {9,29,84,20,17,2};
		
		for (int num:myNumbers) {
			System.out.print(num + " ");
		}
		
	// FOR LOOP
		for (int o = 0; o < 3; o++) {
			System.out.println("I live in " + o + " place(s)");
		}
		// WHILE and DO WHILE
		
		int yo = 1;
		while (yo < 4){
			System.out.print("You're the BEST, ");
			yo++;
		}
		
		int counter = 1; 
		do {
			System.out.println("Come on man");
			counter++;
		}while (counter < 4);
		
	//Overloading	 
		  
		class Add { 
		  
		    // Overload
		    public int add(int x, int y) 
		    { 
		        return (x + y); 
		    } 
		  
		 //Overload
		    public int add(int x, int y, int z) 
		    { 
		        return (x + y + z); 
		    } 
		  
		    // Overload  
		    public double add(double x, double y) 
		    { 
		        return (x + y); 
		    } 
		  
		 // Java program to demonstrate working of method 
		 // overloading in Java. 
		   
		 class Sum { 
		   
		     // Overload
		     public int sum(int x, int y) 
		     { 
		         return (x + y); 
		     } 
		   
		     // Overloaded  
		     public int sum(int x, int y, int z) 
		     { 
		         return (x + y + z); 
		     } 
		   
		     // Overloaded  
		     public double sum(double x, double y) 
		     { 
		         return (x + y); 
		     } 
		   
		     
		     // Can't seem to get it to print
		     /* Sum s = new Sum(); 
		         System.out.println(s.sum(10, 20)); 
		         System.out.println(s.sum(10, 20, 30)); 
		         System.out.println(s.sum(10.5, 20.5));
		*/
		}		
		
}
}}