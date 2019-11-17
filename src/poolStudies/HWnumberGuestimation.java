package poolStudies;

import java.util.Scanner;

public class HWnumberGuestimation {
	public static void main(String args[])
	{
	System.out.println("Hi mate," + "\nPlease guess a number between 0 and 101");
    
    int number = (int)(Math.random() * 101); 
    Scanner input = new Scanner(System.in); 

    int guestimation = 0; 

    while(number != guestimation){ 
        System.out.print("Your Estimation: ");

        guestimation = input.nextInt(); 

        if(guestimation == number){
            System.out.println("Congratulations! You`ve found it out");

        }else if(guestimation > number){
            System.out.println("\nPlease decrease your estimation");

        }else{
            System.out.println("\nPlease increase your estimation");
            }         
        }
    input.close();
    }	
}
