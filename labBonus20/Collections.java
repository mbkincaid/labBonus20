package labBonus20;

import java.text.ParseException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue = null;
		
		System.out.println("Here is a list of our products");
		
		
		do {
			try {
				Map<String, Integer> prices = new HashMap<>();
				prices.put("Basketball", 20);
				prices.put("Banana", 1);
				prices.put("Orange", 1);
				prices.put("Green Pepper", 1);
				prices.put("Car", 10000);
				prices.put("Lime", 1);
				prices.put("Beer", 5);
				prices.put("Steak", 10);
				System.out.println(prices);
	
				System.out.println("Please select an item.");
				String userChoice = scnr.nextLine();
				
				System.out.println("You picked: " + userChoice + ", $" + prices.get(userChoice));
				System.out.println("Would you like to add something else to your cart?(yes/no)");
				userContinue = scnr.nextLine();
			} catch (NullPointerException ex) {
				System.out.println("Sorry, we don't have that. Please select again.");
				}
			
				
			
			
		} while (userContinue.equalsIgnoreCase("yes"));
			
		
		
	}

}

//Hashtable<String, Integer> names = new Hashtable<String, Integer>();
//Scanner in = new Scanner(System.in);
//while (in.hasNext()) {
//    String name = in.next();
//    if (EXIT_KEYWORD.equals(name)) {
//        break;
//    }
//    int age = in.nextInt();
//    names.put(name, age);
//}
//
//for (Map.Entry<String, Integer> entry : names.entrySet()) {
//    System.out.println(entry.getKey() + " " + entry.getValue());
//}
//} 
