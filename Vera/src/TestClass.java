import java.util.*;

//Blake Cannoe
//Blake Gibson
public class TestClass {
	public final static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int quarters = 0;
		int choice = 0;
		int count = 0;
		quarters = getQuarters(quarters);
	
		while(quarters > 0 && choice != 6) {
			
		
		
		
		do {
			
			String message = "Enter a selection\n";
			message += "1. Slot machine 1\n";
			message += "2. Slot machine 2\n";
			message += "3. Slot machine 3\n";
			message += "4. Slot machine 4\n";
			message += "5. Display quarters\n";
			message += "6. Quit\n";
			
			System.out.println(message);
			choice = scan.nextInt();
			
			
			
			switch(choice) {
			case 1:
		
				quarters = slot1(quarters);
				
				break;
				
			case 2:
				
				break;
				
			case 3:
	
				break;
	
			case 4:
	
				break;
	
			case 5:
				System.out.println(quarters);
				break;
				
			case 6:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Invalid");
				break;
				
			}
		
			
		
		
		}while(choice != 6 && quarters > 0);
		
	}
	if(quarters <= 0) {
		System.out.println("Sorry you are broke");
	}
		
}
	
	public static int getQuarters(int quarters) {
		System.out.println("How many quarters do you have");
		quarters = scan.nextInt();
		return quarters;
		
	}
	
	
	public static int slot1(int quarters) {
		int []plays = new int [31];
		int quartersOut = 25;
		int nothing = 0;
	
		for (int i = 0; i < plays.length; i++) {
			if(plays[i] == 31) {
		
				quarters += quartersOut;
				System.out.println("you won 25 quarters");
		
			} else if (plays[i] < 31) {
				quarters--;
		}
		
			return quarters;
		}
		
		return nothing;
	
		
	}	
		

		
		
		
		
	
	

}
