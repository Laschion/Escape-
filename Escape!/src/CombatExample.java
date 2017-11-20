import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CombatExample {
	public static void CombatBGuard(String[] args) {
		Random rand = new Random();
		EscapeGame items = new EscapeGame();
		
		int VTrollHealth = 100;
		int PlayerHealth = 200;
		int WeaponValue = 0;
		int rgnPills = 20; 
		String[] Inventory1 = EscapeGame.Inventory;
		String enemy = "Burly Guard";
		// we can go ahead and change just this value for each fight
		Scanner KillMonster = new Scanner(System.in);
		Scanner WeaponScanner = new Scanner(System.in);

		do {
			System.out.print("You see a "+enemy+"\nWhat do you want to do? : ");

			String KillTroll = KillMonster.nextLine();
			if (KillTroll.equalsIgnoreCase("Inventory")) {
				System.out.println(Arrays.toString(Inventory1));
				continue;
			}
			System.out.print("With?: ");
			String weapon = WeaponScanner.nextLine();
			System.out.println("You chose " + weapon);
			// will probably have to find a way to back check these against inventory
			
			
			
			
			
			
			if (weapon.equalsIgnoreCase("sword")&& Arrays.asList(Inventory1).contains("sword")) {
				WeaponValue = 10;
			}
			else if (weapon.equalsIgnoreCase("knife")&& Arrays.asList(Inventory1).contains("knife")) {
				WeaponValue = 8;
			}
			else if (weapon.equalsIgnoreCase("rock")&& Arrays.asList(Inventory1).contains("rock") ) {
				WeaponValue = 6;
			}
			else if (weapon.equalsIgnoreCase("axe")&& Arrays.asList(Inventory1).contains("axe")) {
				WeaponValue = 9;
			}
			else if (weapon.equalsIgnoreCase("dirty syringe")&& Arrays.asList(Inventory1).contains("dirty syringe")) {
				WeaponValue = 4;
			}
			else if (weapon.equalsIgnoreCase("hands")) {
				WeaponValue = 2;
			}
			else if (weapon.equalsIgnoreCase("pills")&& Arrays.asList(Inventory1).contains("pills")) {
				WeaponValue = 8675309;
			}
			else if (weapon.equalsIgnoreCase("orange")&& Arrays.asList(Inventory1).contains("orange")) {
				WeaponValue = 8675309;
			}
			else {
				System.out.println("You do not have "+weapon);
				continue;
			}

			if (KillTroll.equalsIgnoreCase("kill "+enemy)) {

				if (WeaponValue == 8675309) {
					System.out.println("great job you healed the "+enemy);
					
				VTrollHealth=VTrollHealth + rgnPills;
				
				}
				
				
				
				int x = rand.nextInt(WeaponValue + 1);
				// adds one because Random shuffles through the numbers before it i.e. an 11
				// will shuffle 0-10
				
				
				if (WeaponValue<5 & WeaponValue > -1) {
					System.out.println("You Notice that your "+weapon+" is next to useless against the "+enemy);
				}

				if (x == 0) {
					PlayerHealth = PlayerHealth - 100000;
					System.out.println("your " + weapon + " has failed you, you have died");
					break;
				}
				else if (x == 1 || x == 2) {
					PlayerHealth = PlayerHealth - 50;
					System.out.println("The "+enemy+"  delivered a hit to " + "your gut dealing some serious damage");
				}
				else if (x == 3 || x == 4) {
					PlayerHealth = PlayerHealth - 20;
					System.out.println("The "+enemy+" clipped your arm but you've had worse");
				}
				
				else if (x == 5 || x == 6) {
					VTrollHealth = VTrollHealth - 20;
					System.out.println("you manage to nick the "+enemy+" with your " + weapon);
				}
				else if (x == 7 || x == 8) {
					VTrollHealth = VTrollHealth - 50;
					System.out.println("You managed to get a good hit on the "+enemy+" with your " + weapon);
				}
				else if (x == 9 || x == 10) {
					VTrollHealth = VTrollHealth - 10000;
					System.out.println("in a glorious flip you managed to assassinate the "+enemy+" with your " + weapon);
					return;
				}
				
				
				if (VTrollHealth <= 0) {
					System.out.println("You Win");
					return;

				}
				if (PlayerHealth <= 0) {
					System.out.println("You Lose");
					break;
				}
				System.out.println(enemy+" Health: " + VTrollHealth);
				System.out.println("PlayersHealth: " + PlayerHealth);
				System.out.println("");

			} 
			
			else if (KillTroll.equalsIgnoreCase("restore health") ||KillTroll.equalsIgnoreCase("heal")  & (weapon.equalsIgnoreCase("pills"))) {
				PlayerHealth= PlayerHealth + rgnPills;
				System.out.println(enemy+" Health: " + VTrollHealth);
				System.out.println("PlayersHealth: " + PlayerHealth);
				System.out.println("");
			}
			
			
			else {
				System.out.println("not a valid command");
			}

		} 
		while (PlayerHealth > 0 || VTrollHealth > 0);
		// states that itll do the loop while playerhealth is more than 0 OR
		// VTrollHealth is more than 0

		KillMonster.close();
		WeaponScanner.close();
	}

public static void CombatHenchman(String[] args) {
	Random rand = new Random();
	EscapeGame items = new EscapeGame();
	int VTrollHealth = 100;
	String[] Inventory1 = EscapeGame.Inventory;
	int PlayerHealth = 200;
	int WeaponValue = 0;
	int rgnPills = 20; 
	String enemy = "Henchman";
	// we can go ahead and change just this value for each fight
	Scanner KillMonster = new Scanner(System.in);
	Scanner WeaponScanner = new Scanner(System.in);

	do {
		System.out.print("You see a "+enemy+"\nWhat do you want to do? : ");

		String KillTroll = KillMonster.nextLine();
		if (KillTroll.equalsIgnoreCase("Inventory")) {
			System.out.println(Arrays.toString(Inventory1));
			continue;
		}
		System.out.print("With?: ");
		String weapon = WeaponScanner.nextLine();
		System.out.println("You chose " + weapon);
		// will probably have to find a way to back check these against inventory
		
		
		
		
		
		
		if (weapon.equalsIgnoreCase("sword")&& Arrays.asList(Inventory1).contains("sword")) {
			WeaponValue = 10;
		}
		else if (weapon.equalsIgnoreCase("knife")&& Arrays.asList(Inventory1).contains("knife")) {
			WeaponValue = 8;
		}
		else if (weapon.equalsIgnoreCase("rock")&& Arrays.asList(Inventory1).contains("rock") ) {
			WeaponValue = 6;
		}
		else if (weapon.equalsIgnoreCase("axe")&& Arrays.asList(Inventory1).contains("axe")) {
			WeaponValue = 9;
		}
		else if (weapon.equalsIgnoreCase("dirty syringe")&& Arrays.asList(Inventory1).contains("dirty syringe")) {
			WeaponValue = 4;
		}
		else if (weapon.equalsIgnoreCase("hands")) {
			WeaponValue = 2;
		}
		else if (weapon.equalsIgnoreCase("pills")&& Arrays.asList(Inventory1).contains("pills")) {
			WeaponValue = 8675309;
		}
		else if (weapon.equalsIgnoreCase("orange")&& Arrays.asList(Inventory1).contains("orange")) {
			WeaponValue = 8675309;
		}
		else {
			System.out.println("You do not have "+weapon);
			continue;
		}

		if (KillTroll.equalsIgnoreCase("kill "+enemy)) {

			if (WeaponValue == 8675309) {
				System.out.println("great job you healed the "+enemy);
				
			VTrollHealth=VTrollHealth + rgnPills;
			
			}
			
			
			
			int x = rand.nextInt(WeaponValue + 1);
			// adds one because Random shuffles through the numbers before it i.e. an 11
			// will shuffle 0-10
			
			
			if (WeaponValue<5 & WeaponValue > -1) {
				System.out.println("You Notice that your "+weapon+" is next to useless against the "+enemy);
			}

			if (x == 0) {
				PlayerHealth = PlayerHealth - 100000;
				System.out.println("your " + weapon + " has failed you, you have died");
				break;
			}
			else if (x == 1 || x == 2) {
				PlayerHealth = PlayerHealth - 50;
				System.out.println("The "+enemy+"  delivered a hit to " + "your gut dealing some serious damage");
			}
			else if (x == 3 || x == 4) {
				PlayerHealth = PlayerHealth - 20;
				System.out.println("The "+enemy+" clipped your arm but you've had worse");
			}
			
			else if (x == 5 || x == 6) {
				VTrollHealth = VTrollHealth - 20;
				System.out.println("you manage to nick the "+enemy+" with your " + weapon);
			}
			else if (x == 7 || x == 8) {
				VTrollHealth = VTrollHealth - 50;
				System.out.println("You managed to get a good hit on the "+enemy+" with your " + weapon);
			}
			else if (x == 9 || x == 10) {
				VTrollHealth = VTrollHealth - 10000;
				System.out.println("in a glorious flip you managed to assassinate the "+enemy+" with your " + weapon);
				return;
			}
			
			
			if (VTrollHealth <= 0) {
				System.out.println("You Win");
				return;

			}
			if (PlayerHealth <= 0) {
				System.out.println("You Lose");
				break;
			}
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");

		} 
		
		else if (KillTroll.equalsIgnoreCase("restore health") ||KillTroll.equalsIgnoreCase("heal")  & (weapon.equalsIgnoreCase("pills"))) {
			PlayerHealth= PlayerHealth + rgnPills;
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");
		}
		
		
		else {
			System.out.println("not a valid command");
		}

	} 
	while (PlayerHealth > 0 || VTrollHealth > 0);
	// states that itll do the loop while playerhealth is more than 0 OR
	// VTrollHealth is more than 0

	KillMonster.close();
	WeaponScanner.close();
}
public static void CombatHenchwoman(String[] args) {
	Random rand = new Random();
	EscapeGame items = new EscapeGame();
	int VTrollHealth = 100;
	int PlayerHealth = 200;
	String[] Inventory1 = EscapeGame.Inventory;
	int WeaponValue = 0;
	int rgnPills = 20; 
	String enemy = "Henchwoman";
	// we can go ahead and change just this value for each fight
	Scanner KillMonster = new Scanner(System.in);
	Scanner WeaponScanner = new Scanner(System.in);

	do {
		System.out.print("You see a "+enemy+"\nWhat do you want to do? : ");

		String KillTroll = KillMonster.nextLine();
		if (KillTroll.equalsIgnoreCase("Inventory")||KillTroll.equalsIgnoreCase("i")) {
			System.out.println(Arrays.toString(Inventory1));
			continue;
		}
		System.out.print("With?: ");
		String weapon = WeaponScanner.nextLine();
		System.out.println("You chose " + weapon);
		// will probably have to find a way to back check these against inventory
		
		
		
		
		
		
		if (weapon.equalsIgnoreCase("sword")&& Arrays.asList(Inventory1).contains("sword")) {
			WeaponValue = 10;
		}
		else if (weapon.equalsIgnoreCase("knife")&& Arrays.asList(Inventory1).contains("knife")) {
			WeaponValue = 8;
		}
		else if (weapon.equalsIgnoreCase("rock")&& Arrays.asList(Inventory1).contains("rock") ) {
			WeaponValue = 6;
		}
		else if (weapon.equalsIgnoreCase("axe")&& Arrays.asList(Inventory1).contains("axe")) {
			WeaponValue = 9;
		}
		else if (weapon.equalsIgnoreCase("dirty syringe")&& Arrays.asList(Inventory1).contains("dirty syringe")) {
			WeaponValue = 4;
		}
		else if (weapon.equalsIgnoreCase("hands")) {
			WeaponValue = 2;
		}
		else if (weapon.equalsIgnoreCase("pills")&& Arrays.asList(Inventory1).contains("pills")) {
			WeaponValue = 8675309;
		}
		else if (weapon.equalsIgnoreCase("orange")&& Arrays.asList(Inventory1).contains("orange")) {
			WeaponValue = 8675309;
		}
		else {
			System.out.println("You do not have "+weapon);
			continue;
		}

		if (KillTroll.equalsIgnoreCase("kill "+enemy)) {

			if (WeaponValue == 8675309) {
				System.out.println("great job you healed the "+enemy);
				
			VTrollHealth=VTrollHealth + rgnPills;
			
			}
			
			
			
			int x = rand.nextInt(WeaponValue + 1);
			// adds one because Random shuffles through the numbers before it i.e. an 11
			// will shuffle 0-10
			
			
			if (WeaponValue<5 & WeaponValue > -1) {
				System.out.println("You Notice that your "+weapon+" is next to useless against the "+enemy);
			}

			if (x == 0) {
				PlayerHealth = PlayerHealth - 100000;
				System.out.println("your " + weapon + " has failed you, you have died");
				break;
			}
			else if (x == 1 || x == 2) {
				PlayerHealth = PlayerHealth - 50;
				System.out.println("The "+enemy+"  delivered a hit to " + "your gut dealing some serious damage");
			}
			else if (x == 3 || x == 4) {
				PlayerHealth = PlayerHealth - 20;
				System.out.println("The "+enemy+" clipped your arm but you've had worse");
			}
			
			else if (x == 5 || x == 6) {
				VTrollHealth = VTrollHealth - 20;
				System.out.println("you manage to nick the "+enemy+" with your " + weapon);
			}
			else if (x == 7 || x == 8) {
				VTrollHealth = VTrollHealth - 50;
				System.out.println("You managed to get a good hit on the "+enemy+" with your " + weapon);
			}
			else if (x == 9 || x == 10) {
				VTrollHealth = VTrollHealth - 10000;
				System.out.println("in a glorious flip you managed to assassinate the "+enemy+" with your " + weapon);
				return;
			}
			
			
			if (VTrollHealth <= 0) {
				System.out.println("You Win");
				return;

			}
			if (PlayerHealth <= 0) {
				System.out.println("You Lose");
				break;
			}
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");

		} 
		
		else if (KillTroll.equalsIgnoreCase("restore health") ||KillTroll.equalsIgnoreCase("heal")  & (weapon.equalsIgnoreCase("pills"))) {
			PlayerHealth= PlayerHealth + rgnPills;
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");
		}
		
		
		else {
			System.out.println("not a valid command");
		}

	} 
	while (PlayerHealth > 0 || VTrollHealth > 0);
	// states that itll do the loop while playerhealth is more than 0 OR
	// VTrollHealth is more than 0

	KillMonster.close();
	WeaponScanner.close();
}
public static void CombatKidnapper(String[] args) {
	Random rand = new Random();
	EscapeGame items = new EscapeGame();
	int VTrollHealth = 600;
	int PlayerHealth = 200;
	String[] Inventory1 = EscapeGame.Inventory;
	int WeaponValue = 0;
	int rgnPills = 20; 
	String enemy = "your kidnapper";
	// we can go ahead and change just this value for each fight
	Scanner KillMonster = new Scanner(System.in);
	Scanner WeaponScanner = new Scanner(System.in);

	do {
		System.out.print("You see  "+enemy+"\nWhat do you want to do? : ");

		String KillTroll = KillMonster.nextLine();
		if (KillTroll.equalsIgnoreCase("Inventory")) {
			System.out.println(Arrays.toString(Inventory1));
			continue;
		}
		System.out.print("With?: ");
		String weapon = WeaponScanner.nextLine();
		System.out.println("You chose " + weapon);
		// will probably have to find a way to back check these against inventory
		

		
		
		
		
		if (weapon.equalsIgnoreCase("sword")&& Arrays.asList(Inventory1).contains("sword")) {
			WeaponValue = 10;
		}
		else if (weapon.equalsIgnoreCase("knife")&& Arrays.asList(Inventory1).contains("knife")) {
			WeaponValue = 8;
		}
		else if (weapon.equalsIgnoreCase("rock")&& Arrays.asList(Inventory1).contains("rock") ) {
			WeaponValue = 6;
		}
		else if (weapon.equalsIgnoreCase("axe")&& Arrays.asList(Inventory1).contains("axe")) {
			WeaponValue = 9;
		}
		else if (weapon.equalsIgnoreCase("dirty syringe")&& Arrays.asList(Inventory1).contains("dirty syringe")) {
			WeaponValue = 4;
		}
		else if (weapon.equalsIgnoreCase("hands")) {
			WeaponValue = 2;
		}
		else if (weapon.equalsIgnoreCase("pills")&& Arrays.asList(Inventory1).contains("pills")) {
			WeaponValue = 8675309;
		}
		else if (weapon.equalsIgnoreCase("orange")&& Arrays.asList(Inventory1).contains("orange")) {
			WeaponValue = 8675309;
		}
		else {
			System.out.println("You do not have "+weapon);
			continue;
		}

		if (KillTroll.equalsIgnoreCase("kill "+enemy)) {

			if (WeaponValue == 8675309) {
				System.out.println("great job you healed the "+enemy);
				
			VTrollHealth=VTrollHealth + rgnPills;
			
			}
			
			
			
			int x = rand.nextInt(WeaponValue + 1);
			// adds one because Random shuffles through the numbers before it i.e. an 11
			// will shuffle 0-10
			
			
			if (WeaponValue<5 & WeaponValue > -1) {
				System.out.println("You Notice that your "+weapon+" is next to useless against the "+enemy);
			}

			if (x == 0) {
				PlayerHealth = PlayerHealth - 100000;
				System.out.println("your " + weapon + " has failed you, you have died");
				break;
			}
			else if (x == 1 || x == 2) {
				PlayerHealth = PlayerHealth - 50;
				System.out.println("The "+enemy+"  delivered a hit to " + "your gut dealing some serious damage");
			}
			else if (x == 3 || x == 4) {
				PlayerHealth = PlayerHealth - 20;
				System.out.println("The "+enemy+" clipped your arm but you've had worse");
			}
			
			else if (x == 5 || x == 6) {
				VTrollHealth = VTrollHealth - 20;
				System.out.println("you manage to nick the "+enemy+" with your " + weapon);
			}
			else if (x == 7 || x == 8) {
				VTrollHealth = VTrollHealth - 50;
				System.out.println("You managed to get a good hit on the "+enemy+" with your " + weapon);
			}
			else if (x == 9 || x == 10) {
				VTrollHealth = VTrollHealth - 10000;
				System.out.println("in a glorious flip you managed to assassinate the "+enemy+" with your " + weapon);
				return;
			}
			
			
			if (VTrollHealth <= 0) {
				System.out.println("You Win");
				return;

			}
			if (PlayerHealth <= 0) {
				System.out.println("You Lose");
				break;
			}
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");

		} 
		
		else if (KillTroll.equalsIgnoreCase("restore health") ||KillTroll.equalsIgnoreCase("heal")  & (weapon.equalsIgnoreCase("pills"))) {
			PlayerHealth= PlayerHealth + rgnPills;
			System.out.println(enemy+" Health: " + VTrollHealth);
			System.out.println("PlayersHealth: " + PlayerHealth);
			System.out.println("");
		}
		
		
		else {
			System.out.println("not a valid command");
		}

	} 
	while (PlayerHealth > 0 || VTrollHealth > 0);
	// states that itll do the loop while playerhealth is more than 0 OR
	// VTrollHealth is more than 0

	KillMonster.close();
	WeaponScanner.close();
}
}