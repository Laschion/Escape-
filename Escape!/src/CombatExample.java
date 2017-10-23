import java.util.Random;
import java.util.Scanner;

public class CombatExample {

	public static void main(String[] args) {
		Random rand = new Random();
		int VTrollHealth = 100;
		int PlayerHealth = 200;
		int WeaponValue = 0;
		Scanner KillMonster = new Scanner(System.in);
		Scanner WeaponScanner = new Scanner(System.in);

		do {
			System.out.print("What do you want to do? : ");

			String KillTroll = KillMonster.nextLine();
			System.out.print("With?: ");
			String weapon = WeaponScanner.nextLine();
			System.out.println("You chose " + weapon);
			// will probably have to find a way to back check against inventory
			if (weapon.equalsIgnoreCase("sword")) {
				WeaponValue = 10;
			}
			if (weapon.equalsIgnoreCase("dagger")) {
				WeaponValue = 8;
			}
			if (weapon.equalsIgnoreCase("rock")) {
				WeaponValue = 6;
			}
			if (weapon.equalsIgnoreCase("hands")) {
				WeaponValue = 1;
			}
			if (weapon.equalsIgnoreCase("manhood")) {
				WeaponValue = 0;
			}

			if (KillTroll.equalsIgnoreCase("kill troll")) {

				int x = rand.nextInt(WeaponValue + 1);
				// adds one because Random shuffles through the numbers before it i.e. an 11
				// will shuffle 0-10

				if (x == 0) {
					PlayerHealth = PlayerHealth - 100000;
					System.out.println("your " + weapon + " has failed you, you have died");
					break;
				}
				if (x == 1 || x == 2) {
					PlayerHealth = PlayerHealth - 50;
					System.out.println("The Troll delivered a hit to " + "your gut dealing some serious damage");
				}
				if (x == 3 || x == 4) {
					PlayerHealth = PlayerHealth - 20;
					System.out.println("The troll clipped your arm but you've had worse");
				}
				if (x == 5 || x == 6) {
					VTrollHealth = VTrollHealth - 20;
					System.out.println("you manage to nick the troll with " + weapon);
				}
				if (x == 7 || x == 8) {
					VTrollHealth = VTrollHealth - 50;
					System.out.println("You managed to get a good hit on the troll with your " + weapon);
				}
				if (x == 9 || x == 10) {
					VTrollHealth = VTrollHealth - 10000;
					System.out.println("in a glorious flip you managed to assassinate the troll with your " + weapon);
					break;
				}
				if (VTrollHealth <= 0) {
					System.out.println("You Win");
					break;

				}
				if (PlayerHealth <= 0) {
					System.out.println("You Lose");
					break;
				}
				System.out.println("Trolls Health: " + VTrollHealth);
				System.out.println("PlayersHealth: " + PlayerHealth);
				System.out.println("");

			} else {
				System.out.println("not a valid command");
			}

		} while (PlayerHealth > 0 || VTrollHealth > 0);
		// states that itll do the loop while playerhealth is more than 0 OR
		// VTrollHealth is more than 0

		KillMonster.close();
		WeaponScanner.close();
	}
}
