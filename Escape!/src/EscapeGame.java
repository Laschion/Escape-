import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class EscapeGame {

	public static void main(String[] args) {
		/*
		 * This is the Movement Section!
		 */
		@SuppressWarnings("resource")
		Scanner Move = new Scanner(System.in);
		String currentRoom = "o";
		String Destination;
		String FloorNumber = "3";
		String RoomComplete = "3o";
		String FDestination;
		Random rand = new Random();
		int VTrollHealth;
		int PlayerHealth;
		int WeaponValue;
		int rgnPills; 
		String enemy;
		Scanner KillMonster = new Scanner(System.in);
		Scanner WeaponScanner = new Scanner(System.in);
		boolean burlyGuard = true;
		int MaxInven = 5;
		String[] Inventory = new String[MaxInven];
		String[] Items = new String[9];
		int i = 0;
		int k = 0;
		boolean FullInven = false;
		//Items[0]="String";  would be the format
		String userAnswer = null;

		System.out.println("You awaken in a dark room,somehow you realize that the room is called 3o but everything else seems fuzzy to you.");
		do {

			System.out.println("what do you want to do?");
			String PlayerMovement = Move.nextLine();
			if (PlayerMovement.equalsIgnoreCase("North")) {
				//Win Condition
				// will have to add "&& burlyguarddead" here to ensure that they must kill the guard first
		if (RoomComplete.equals("1c") && PlayerMovement.equalsIgnoreCase("north")/*&& burlyguarddead*/) {
			System.out.println("Congratulations you escaped");
			break;
		}
				// 4th Floor 3rd column
				if (RoomComplete.equals("4i")) {
					FDestination = "4f";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4f")) {
					FDestination = "4c";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4c")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor 2nd column
				if (RoomComplete.equals("4h")) {
					FDestination = "4e";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4e")) {
					FDestination = "4b";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4b")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor 1st column
				if (RoomComplete.equals("4g")) {
					FDestination = "4d";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4d")) {
					FDestination = "4a";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4a")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th column
				if (currentRoom.equals("p")) {
					Destination = "l";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("l")) {
					Destination = "h";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("h")) {
					Destination = "d";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("d")) {
					System.out.println("You can not go any further");
					continue;
				}
				// seperation 3rd column
				if (currentRoom.equals("o")) {
					Destination = "k";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("k")) {
					Destination = "g";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("g")) {
					Destination = "c";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("c")) {

					System.out.println("you can not go any further");
					continue;
				}
				// Seperation 2nd column
				if (currentRoom.equals("n")) {
					Destination = "j";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("j")) {
					Destination = "f";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("f")) {
					Destination = "b";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("b")) {
					System.out.println("you can not go any further");
					continue;
				}
				// Seperation 1st Column
				if (currentRoom.equals("m")) {
					Destination = "i";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("i")) {
					Destination = "e";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("e")) {
					Destination = "a";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("a"))
					System.out.println("you can not go any further");
				continue;
			}

			else if (PlayerMovement.equalsIgnoreCase("West")) {
				// 4th Floor 1st row
				if (RoomComplete.equals("4c")) {
					FDestination = "4b";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4b")) {
					FDestination = "4a";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4a")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor 2nd Row
				if (RoomComplete.equals("4f")) {
					FDestination = "4e";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4e")) {
					FDestination = "4d";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4d")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor 3rd Row
				if (RoomComplete.equals("4i")) {
					FDestination = "4h";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4h")) {
					FDestination = "4g";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4g")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th row
				if (currentRoom.equals("m")) {
					System.out.println("you can not go any further");
					continue;
				}
				if (currentRoom.equals("n")) {
					Destination = "m";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("o")) {
					Destination = "n";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("p")) {
					Destination = "o";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				// 3rd row
				if (currentRoom.equals("l")) {
					Destination = "k";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("k")) {
					Destination = "j";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("j")) {
					Destination = "i";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("i")) {

					System.out.println("you can not go any further ");
					continue;
				}
				// 2nd row
				if (currentRoom.equals("h")) {
					Destination = "g";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("g")) {
					Destination = "f";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("f")) {
					Destination = "e";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("e")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 1st row
				if (currentRoom.equals("d")) {
					Destination = "c";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("c")) {
					Destination = "b";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("b")) {
					Destination = "a";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("a")) {
					System.out.println("You can not go any further ");
					continue;
				}

			} else if (PlayerMovement.equalsIgnoreCase("East")) {
				// 4th Floor 1st Row
				if (RoomComplete.equals("4a")) {
					FDestination = "4b";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4b")) {
					FDestination = "4c";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4c")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th floor 2nd Row
				if (RoomComplete.equals("4d")) {
					FDestination = "4e";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4e")) {
					FDestination = "4f";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4f")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor 3rd Row
				if (RoomComplete.equals("4g")) {
					FDestination = "4h";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4h")) {
					FDestination = "4i";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4i")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th row
				if (currentRoom.equals("m")) {
					Destination = "n";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("n")) {
					Destination = "o";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("o")) {
					Destination = "p";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("p")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 3rd row
				if (currentRoom.equals("i")) {
					Destination = "j";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("j")) {
					Destination = "k";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("k")) {
					Destination = "l";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("l")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 2nd row
				if (currentRoom.equals("e")) {
					Destination = "f";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("f")) {
					Destination = "g";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("g")) {
					Destination = "h";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("h")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 1st row
				if (currentRoom.equals("a")) {
					Destination = "b";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("b")) {
					Destination = "c";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("c")) {
					Destination = "d";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("d")) {
					System.out.println("you can not go any further ");
					continue;
				}
			} else if (PlayerMovement.equalsIgnoreCase("South")) {
				// 4th floor 1st column
				if (RoomComplete.equals("4a")) {
					FDestination = "4d";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4d")) {
					FDestination = "4g";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4g")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor second column
				if (RoomComplete.equals("4b")) {
					FDestination = "4e";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4e")) {
					FDestination = "4h";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4h")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 4th Floor third column
				if (RoomComplete.equals("4c")) {
					FDestination = "4f";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4f")) {
					FDestination = "4i";
					RoomComplete = FDestination;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4i")) {
					System.out.println("you can not go any further");
					continue;
				}
				// 1st column
				if (currentRoom.equals("a")) {
					Destination = "e";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("e")) {
					Destination = "i";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("i")) {
					Destination = "m";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("m")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 2nd column
				if (currentRoom.equals("b")) {
					Destination = "f";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("f")) {
					Destination = "j";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("j")) {
					Destination = "n";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("n")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 3rd column
				if (currentRoom.equals("c")) {
					Destination = "g";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("g")) {
					Destination = "k";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("k")) {
					Destination = "o";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("o")) {
					System.out.println("you can not go any further ");
					continue;
				}
				// 4th column
				if (currentRoom.equals("d")) {
					Destination = "h";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("h")) {
					Destination = "l";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("l")) {
					Destination = "p";
					currentRoom = Destination;
					RoomComplete = FloorNumber + currentRoom;
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (currentRoom.equals("p")) {
					System.out.println("you can not go any further ");
					continue;
				}
			} else if (PlayerMovement.equalsIgnoreCase("up")) {
				if (RoomComplete.equals("1p")) {
					FDestination = "2p";
					RoomComplete = FDestination;
					FloorNumber = "2";
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("2k")) {
					FDestination = "3k";
					RoomComplete = FDestination;
					FloorNumber = "3";
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("3d")) {
					FDestination = "4c";
					RoomComplete = FDestination;
					FloorNumber = "4";

					System.out.println("you are now in " + RoomComplete);
					continue;
				} else {
					System.out.println("You can not do that right now");
					continue;
				}
			} else if (PlayerMovement.equalsIgnoreCase("down")) {
				if (RoomComplete.equals("3k")) {
					FDestination = "2k";
					RoomComplete = FDestination;
					FloorNumber = "2";
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("2p")) {
					FDestination = "1p";
					RoomComplete = FDestination;
					FloorNumber = "1";
					System.out.println("you are now in " + RoomComplete);
					continue;
				}
				if (RoomComplete.equals("4c")) {
					FDestination = "3d";
					RoomComplete = FDestination;
					FloorNumber = "3";
					System.out.println("you are now in " + RoomComplete);
					continue;
				} else {
					System.out.println("You can not do that right now");
					continue;
				}
			}
			else {
				System.out.println("Command Unrecognized try again");
			}
		if (RoomComplete== "1c"&& burlyGuard==true) {
			 VTrollHealth = 100;
			 PlayerHealth = 200;
			 WeaponValue = 0;
			 rgnPills = 20; 
			 enemy = "Burly Guard";
			 do {
					System.out.print("What do you want to do? : ");

					String KillTroll = KillMonster.nextLine();
					System.out.print("With?: ");
					String weapon = WeaponScanner.nextLine();
					System.out.println("You chose " + weapon);
					// will probably have to find a way to back check these against inventory
					
					
					
					
					
					
					if (weapon.equalsIgnoreCase("sword")) {
						WeaponValue = 10;
					}
					else if (weapon.equalsIgnoreCase("dagger")) {
						WeaponValue = 8;
					}
					else if (weapon.equalsIgnoreCase("rock")) {
						WeaponValue = 6;
					}
					else if (weapon.equalsIgnoreCase("hands")) {
						WeaponValue = 1;
					}
					else if (weapon.equalsIgnoreCase("manhood")) {
						WeaponValue = 0;
					}
					else if (weapon.equalsIgnoreCase("pills")) {
						WeaponValue = 8675309;
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
						System.out.println(enemy+" Health: " + VTrollHealth);
						System.out.println("PlayersHealth: " + PlayerHealth);
						System.out.println("");

					} 
					
					else if (KillTroll.equalsIgnoreCase("restore health") & (weapon.equalsIgnoreCase("pills"))) {
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
		}
		
		} while (true);
		
		
	}
}


	


