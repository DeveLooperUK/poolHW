package poolStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HWinfinitiveAddition1 {


	public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 List<Integer> numbers = new ArrayList<>();
	 for(int i = 0; i < numbers.size()+1; i++) {
	 System.out.println("Number: ");
	 numbers.add(input.nextInt());
	 
	 int sum = 0;
	 for(int i1 = 0; i1 < numbers.size(); i1++){
		 sum = sum + numbers.get(i1); 
		 System.out.println(sum);
		 	}
	 	}
	}
}
