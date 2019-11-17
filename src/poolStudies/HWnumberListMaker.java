package poolStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HWnumberListMaker {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
			for(;;) { System.out.print("A number for list: ");
			Scanner y = new Scanner(System.in);
			int i = y.nextInt();
			numbers.add(i);
			System.out.println(numbers);
			}
	}
}
