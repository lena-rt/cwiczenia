import java.util.*;


public class Instrukcje {

	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean shouldContinue = true;
		
		Party party = new Party();
		
		while(shouldContinue) {
			System.out.println(" ");
			System.out.println("Wybierz opcj�");
			System.out.println("1. Wy�wietl go�ci");
			System.out.println("2. Dodaj go�cia");
			System.out.println("3. Wy�wietl potrawy");
			System.out.println("4. Znajdz po numerze telefonu");
			System.out.println("5. Wyj�cie");
			
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