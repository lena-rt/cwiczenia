import java.util.*;


public class Instrukcje {

	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean shouldContinue = true;
		
		Party party = new Party();
		
		while(shouldContinue) {
			System.out.println(" ");
			System.out.println("Wybierz opcjê");
			System.out.println("1. Wyœwietl goœci");
			System.out.println("2. Dodaj goœcia");
			System.out.println("3. Wyœwietl potrawy");
			System.out.println("4. Znajdz po numerze telefonu");
			System.out.println("5. Wyjœcie");
			
			int userChoice = scanner.nextInt();
			
			
     		switch (userChoice) {
			case 1 -> party.displayGuests();
			case 2 -> party.addGuest();
			case 3 -> party.displayMeals();
			case 4 -> party.displayGuestsByPhoneNumber();
			case 5 -> shouldContinue = false;
			}
	
		
		}
	}
}