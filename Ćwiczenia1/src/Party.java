import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Party {
	private List<Guest> guests = new ArrayList<>();
	private Set<String> meals = new HashSet<>();
	private Map<Integer, Guest> phoneToGuest = new HashMap<>();
	
	Scanner scanner = new Scanner(System.in);
	
	public void addGuest() {
		System.out.println("Podaj imiê goœcia");
		String name = scanner.nextLine();
		
		System.out.println("Podaj preferowany posi³ek");
		String meal = scanner.nextLine();
		
		System.out.println("Podaj numer telefonu");
		int phoneNumber = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Czy weganin (Y/N)");
		String isVeganString = scanner.nextLine();
		
		boolean isVegan;
		
		if (isVeganString.equals("Y")) {
			isVegan = true;
 		} else {
 			isVegan = false;
			
		}
			
		Guest guest = new Guest(name, meal, phoneNumber, isVegan);	
		
		meals.add(meal);
		phoneToGuest.put(phoneNumber, guest);
		guests.add(guest);
	}
	
	
	public void displayMeals() {
		for (String meal : meals) {
		System.out.println(meal);
		}
	}
	
	public void displayGuestsByPhoneNumber(){
		System.out.println("podaj numer telefonu");
		Integer phoneNumber = Integer.valueOf(scanner.nextLine());
		Guest guest = phoneToGuest.get(phoneNumber);
		
		guest.displayGuestInformation();
	}
		
	
	public void displayGuests(){
		for(Guest guest : guests) {
			guest.displayGuestInformation();
		}
	}
}
