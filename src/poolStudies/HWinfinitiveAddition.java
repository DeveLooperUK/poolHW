package poolStudies;

import java.util.Scanner;

public class HWinfinitiveAddition {

public static void main(String[] args) {
		
		System.out.print("A number for addition: ");
		Scanner y = new Scanner(System.in);
		int a = y.nextInt();
		System.out.println(a);
		
		int result = a;	
		for(;;) {
		System.out.println("A number for addition: ");
		Scanner z = new Scanner(System.in);
		int b = z.nextInt();		
		int lastResult = result + b;
		System.out.println(lastResult);
		result = lastResult;
		} 	
}
}
