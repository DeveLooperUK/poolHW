package poolStudies;

import java.util.Scanner;

public class RandomNumberArrayMaxMin {
	public static void main(String args[])
	{	Scanner scanner = new Scanner(System.in);
		System.out.println("Size of Number Array: "); 
		int x = scanner.nextInt();
		System.out.println("Upper Bound: "); 
		int y = scanner.nextInt();
		
		// create a number array
	int [] number = new int[x+1];
	for (int i=1 ; i<number.length ; i++) {
		number[i]= (int)(Math.random()*y);
		System.out.print(i+") ");
		System.out.println(number[i]);} 
	
	// find its minimum and min's index out
	int IndexMin = 1000;
	int min = 1000;
	for (int i = 1; i < number.length; i++) {
		if (number[i] < min) { min = number[i];
		IndexMin = i;}
		}
	
		// find maximum and mx's index out
	int IndexMax = 0;
	int Max = 0;
	for( int i = 0; i < number.length; i++) 
			{
		if(Max < number[i]) { Max = number[i];
		IndexMax = i;
			}
		}
	System.out.println("Min: " + min + "\nIndexMin: " + IndexMin);
	System.out.println("Max: " + Max + "\nIndexMax: " + IndexMax);	
		scanner.close();}
}
