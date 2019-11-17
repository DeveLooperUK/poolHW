package poolStudies;

import java.util.Scanner;

public class HWcallingMethod {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("From where: ");
		String from = scan.nextLine();
		System.out.print("Where to: ");
		String to = scan.nextLine();
		System.out.print("Your speed: ");
		int speed = scan.nextInt();
	run(from , to , speed);
	scan.close();
	}
	
	public static void run(String from, String to, int speed) {  
	System.out.println("I've run from " + from + " to " + to + " at " + speed + " m/s");
		} 
}
