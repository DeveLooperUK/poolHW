package poolStudies;

import java.util.Scanner;

public class HWsearchWord {

	public static void main(String[] arg) {
		
	String rhyme;
	String AskedWord;
	
	System.out.println("Hi mate! Please type a rhyme you know");
	Scanner scan = new Scanner(System.in);
	rhyme = scan.nextLine();
	System.out.println("Okay! Now type a word to know its number of inside, please");
	Scanner scan1 = new Scanner(System.in);
	AskedWord = scan1.nextLine();
	
	String[] words = rhyme.split(" ");
	
	 int i=0;
     int count=0;
     while (i < words.length) {
     
         if (words[i].equalsIgnoreCase(AskedWord.trim()) == false) {
             i++;
             continue;
         	}
         count++;
         i++;
     	 }
     System.out.println("Number of " + AskedWord.toLowerCase() + ": " + count);
    scan.close(); scan1.close();
	}
}
