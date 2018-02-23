import java.util.*;

//Blake Cannoe
//Blake Gibson
public class TestClass {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] playsSlotOne = new int [32];
		int[] playsSlotTwo = new int [70];
		int[] playsSlotThree = new int[8];
		int[] playsSlotFour = new int [6];
		int quarters = 0;
		int choice = 0;
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countTotal = 0;
		int out = 0;
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
			
			
			
			
//			int[] playsSlotOne = new int [count];
//			int[] playsSlotTwo = new int [count];
//			int[] playsSlotThree = new int[count];
//			int[] playsSlotFour = new int [count];
			
			switch(choice) {
			case 1:
				countOne++;
				if(countOne >= 31) {
					countOne = 0;
				}
				quarters = slotOne(quarters, playsSlotOne, countOne);
				countTotal++;
				break;
				
			case 2:
				countTwo++;
				if(countTwo >= 69) {
					countTwo = 0;
				}
				quarters = slotTwo(quarters, playsSlotTwo, countTwo);
				countTotal++;
				break;
				
			case 3:
				countThree++;
				if(countThree >= 7) {
					countThree = 0;
				}
				quarters = slotThree(quarters, playsSlotThree, countThree);
				countTotal++;
				break;
	
			case 4:
				
				if(countFour >= 5) {
					countFour = 0;
				}
				quarters = slotFour(quarters, playsSlotFour, countFour);
				countFour++;
				countTotal++;
				break;
	
			case 5:
				System.out.println(quarters);
				break;
				
			case 6:
				System.out.println("Goodbye");
				System.out.println(" You played: " + out + " times");
				break;
				default:
				System.out.println("Invalid");
				break;
				
			}
				
			
		
			out = countTotal;
			
		}while(choice != 6 && quarters > 0);
		
	}
	if(quarters <= 0) {
		System.out.println("Sorry you are broke");
		System.out.println(" You played: " + out + "times");
	}
		
}
	
	public static int getQuarters(int quarters) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many quarters do you have");
		quarters = scan.nextInt();
		return quarters;
		
	}
	
	
	public static int slotOne(int quarters, int plays[], int count) {
		int quartersOut = 25;
		double moneyTotal = 0;
		count++;	
		plays[count] = count;
		if(plays[count] == 31) {
			quarters += quartersOut;
			for(int i = 0; i < plays.length; i++) {
				plays[i] = 0;
			}
			moneyTotal = (double) quarters/4.00;
			System.out.println("you won 25 quarters on slot 1 you have " + quarters + " quarters which equals $" + moneyTotal);
		
		} else if (plays[count] < 31) {
				quarters--;
			}
		
			
		
		
		return quarters;
	
	
		
	}	
	
	public static int slotTwo(int quarters, int plays[], int count) {
		int quartersOut = 75;
		double moneyTotal = 0;
		count++;
		plays[count] = count;
		if(plays[count] == 69) {
			quarters += quartersOut;
			for(int i = 0; i < plays.length; i++) {
				plays[i] = 0;
			}
			moneyTotal = quarters/4.00;
			System.out.println("You won 75 quarters on slot 2 you have " + quarters + " quarters remaining which equals $" + moneyTotal);
		} else if (plays[count] < 69) {
			quarters--;
		}
		
		
		return quarters;
	}
		
	public static int slotThree(int quarters, int plays[], int count) {
		int quartersOut = 7;
		double moneyTotal = 0;
		count++;
		plays[count] = count;
		if(plays[count] == 7) {
			quarters += quartersOut;
			for(int i = 0; i < plays.length; i++) {
				plays[i] = 0;
			}
			moneyTotal = quarters/4.00;
			System.out.println("You won 7 quarters on slot 3 you have " + quarters + " quarters remaining which equals $" + moneyTotal);
		} else if (plays[count] < 7) {
			quarters--;
		}
		
		
		return quarters;
	}
	
	public static int slotFour(int quarters, int plays[], int count) {
		int quartersOut = 2;
		double moneyTotal = 0;
		count++;
		plays[count] = count;
		if(plays[count] == 5) {
			quarters += quartersOut;
			for(int i = 0; i < plays.length; i++) {
				plays[i] = 0;
			}
			moneyTotal = (double)quarters / 4.00;
			System.out.println("You won 2 quarters on slot four you have " + quarters + " quarters remaining which equals $" + moneyTotal);
		} else if (plays[count] < 5) {
			quarters--;
		}
		
		
		return quarters;
	}	
		
		
		
	
	

}
