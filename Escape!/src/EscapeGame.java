import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class EscapeGame {
static String[] Inventory;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner Move = new Scanner(System.in);
		String currentRoom = "o";
		String Destination;
		String FloorNumber = "3";
		String RoomComplete = "3o";
		String FDestination;
		boolean rockItem=true;
		boolean knifeItem=true;
		boolean orangeItem=true;
		boolean DSyringeItem=true;
		boolean swordItem=true;
		boolean pillItem=true;
		boolean axeItem=true;
		int MaxInven = 5;
		Inventory = new String[MaxInven];
		boolean burlyGuard = true;
		boolean Henchman=true;
		boolean Henchwoman=true;
		boolean Kidnapper=true;
		
		
		
		String[] Items = new String[9];
		int i = 0;
		int k = 0;
		boolean FullInven = false;
		//Items[0]="String";  would be the format
		String userAnswer = null;
		@SuppressWarnings("resource")
		Scanner ItemReplace = new Scanner(System.in);

		System.out.println("You wake up in a dark and eerie room. The door is cracked open, and a small sliver of light passes through. You realize that you have been kidnapped and that you have to escape,somehow you also realize that the room is called 3o but everything else seems fuzzy to you.");
		
		do {
			/*
			 * Room Descriptions
			 */
			if (RoomComplete.equals("3p")) {
				System.out.println("You are in a closet.");
				if (rockItem==true) {
					System.out.print("You notice something on the top shelf, maybe you should 'look around' ");
					Items[0]= "rock";
					
					
					
				}
				else {
					System.out.println("there is nothing in here");
				}
			}
			else if (RoomComplete.equals("1c") && burlyGuard==true) {
				CombatExample.CombatBGuard(args);
				burlyGuard=false;
			}
			else if (RoomComplete.equals("1a")) {
				System.out.println("You are in an empty room");
				}
			else if (RoomComplete.equals("1b")) {
				System.out.println("You are in an empty room with a painting on the wall");
				}
			else if (RoomComplete.equals("1d")) {
				System.out.println("You are in the dining room");
			if (orangeItem==true) {
				System.out.println("There seems to be something on the table");
				Items[0]="orange";
			}
			else {
				System.out.println("there is nothing on the table");
			}
			}
			else if (RoomComplete.equals("1e")) {
				System.out.println("You are in the Kitchen");
			if (knifeItem==true) {
				System.out.println("There seems to be something on the table");
				Items[0]="knife";
			}
			else {
				System.out.println("there is nothing on the table");
			}
			}
			else if (RoomComplete.equals("1f")) {
				System.out.println("You are in a room with a self playing piano in it, you seem to start grooving along as you listen");
			}
			else if (RoomComplete.equals("1g")) {
				System.out.println("You are in a room with a self playing piano near it, you can only faintly hear the music");
			}
			else if (RoomComplete.equals("1h")) {
				System.out.println("You are in the Bathroom");
			if (DSyringeItem==true) {
				System.out.println("There seems to be something on the toilet");
				Items[0]="dirty syringe";
			}
			else {
				System.out.println("there is nothing on the table");
			}
			}
			else if (RoomComplete.equals("1i")) {
				System.out.println("You are in the hallway, there are paintings lining the wall");
				}
			else if (RoomComplete.equals("1j")) {
				System.out.println("You are in the hallway, the walls seem to twist and turn with every step");
				}
			else if (RoomComplete.equals("1k")) {
				System.out.println("You are in the hallway");
				}
			else if (RoomComplete.equals("1l")) {
				System.out.println("You are in the hallway");
				}
			else if (RoomComplete.equals("1m") && Henchman==true) {
				CombatExample.CombatHenchman(args);
				Henchman=false;
			}
			else if (RoomComplete.equals("1n")) {
				System.out.println("You are in the bedroom, there is a corpse decaying on the bed");
				}
			else if (RoomComplete.equals("1o")) {
				System.out.println("You are in the bedroom you see some dressers around");
				}
			else if (RoomComplete.equals("1p")) {
				System.out.println("there seems to be some stairs here");
				}
			else if (RoomComplete.equals("2a") && Henchwoman==true) {
				CombatExample.CombatHenchwoman(args);
				Henchwoman=false;
			}
			else if (RoomComplete.equals("2b")) {
				System.out.println("You are in a dark bedroom");
			if (swordItem==true) {
				System.out.println("There seems to be something hanging on the wall");
				Items[0]="sword";
			}
			else {
				System.out.println("there is nothing on the table");
			}
			}
			else if (RoomComplete.equals("2c")) {
				System.out.println("you are in a bedroom with a bed haphazardly made");
				}
			else if (RoomComplete.equals("2d")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("2e")) {
				System.out.println("you are in the bathroom, there is a jacuzzi running");
				}
			else if (RoomComplete.equals("2f")) {
				System.out.println("You are now in the game room, there are a couple of broken pool tables scattered around the room");
				}
			else if (RoomComplete.equals("2g")) {
				System.out.println("you are in the gameroom, there is a small arcade in here but all the screens are broken");
				}
			else if (RoomComplete.equals("2h")) {
				System.out.println("You are in another bathroom");
			if (pillItem==true) {
				System.out.println("There seems to be something on the countertop");
				Items[0]="pills";
			}
			else {
				System.out.println("there is nothing on the countertop");
			}
			}
			else if (RoomComplete.equals("2i")) {
				System.out.println("you are in the guestroom, there is a stuffed puppy doll in here, sown into the carpet");
				}
			else if (RoomComplete.equals("2j")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("2k")) {
				System.out.println("there are some stairs going up here");
				}
			else if (RoomComplete.equals("2l")) {
				System.out.println("You are in a dark bedroom");
			if (axeItem==true) {
				System.out.println("There seems to be something in here");
				Items[0]="axe";
			}
			else {
				System.out.println("there is nothing else in here");
			}
			}
			else if (RoomComplete.equals("2m")) {
				System.out.println("you are in an room with a cat, as long as you dont bother it, it wont bother you");
				}
			else if (RoomComplete.equals("2n")) {
				System.out.println("you are in the library there is a book called 'the bee movie script' i wonder what that could be?");
				}
			else if (RoomComplete.equals("2o")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("2p")) {
				System.out.println("you see some stairs leading downstairs");
				}
			else if (RoomComplete.equals("3a")) {
				System.out.println("There is a Tortured Prisoner here he whispers 'run! run as fast as you can!'");
				}
			else if (RoomComplete.equals("3b")) {
				System.out.println("you are in a conservatory filled with plants");
				}
			else if (RoomComplete.equals("3c")) {
				System.out.println("you are in a cinema, there is a cheesy horror movie playing in the background");
				}
			else if (RoomComplete.equals("3d")) {
				System.out.println("you see some stairs leading upstairs");
				}
			else if (RoomComplete.equals("3e")) {
				System.out.println("you are in an empty storage room");
			}
			else if (RoomComplete.equals("3f")) {
				System.out.println("you are in a room with there only being a painting of a group of dogs plauing poker");
				}
			else if (RoomComplete.equals("3g")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("3h")) {
				System.out.println("you are in a room with a sledge hammer inside a safe however due to time you dont think youll be able to get it");
				}
			else if (RoomComplete.equals("3i")) {
				System.out.println("you are in a room with a prisoner, he looks like he needs help but you cant figure out what he needs, oh well");
				}
			else if (RoomComplete.equals("3j")) {
				System.out.println("you are in what appears to be an art gallery.... for the artistically ungifted, or as the sign says 'modern artists'");
				
				}
			else if (RoomComplete.equals("3k")) {
				System.out.println("there seems to be some stairs heading down here");
			}
			else if (RoomComplete.equals("3l")) {
				System.out.println("you are in the gym, there appears to be no one here");
				}
			else if (RoomComplete.equals("3m")) {
				System.out.println("you are in the laundry room");
				}
			else if (RoomComplete.equals("3n")) {
				System.out.println("you are on the balcony but it looks like its a long way down");
				}
			else if (RoomComplete.equals("3o")) {
				System.out.println("This is the room you start in!");
				}
			else if (RoomComplete.equals("4a")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("4b") && Kidnapper==true) {
				CombatExample.CombatKidnapper(args);
				Kidnapper=false;
			}
			else if (RoomComplete.equals("4c")) {
				System.out.println("there are some stairs leading down");
				}
			else if (RoomComplete.equals("4d")) {
				System.out.println("you are in what appears to be a janitors closet, there is a skeleton from a long time ago in here, it looks strangely like you");
				}
			else if (RoomComplete.equals("4e")) {
				System.out.println("you are in a bathroom");
				}
			else if (RoomComplete.equals("4f")) {
				System.out.println("you are in a room with a window you can see that you are in the middle of no where however towards the bottom you can see a car that you could maybe get away in");
				}
			else if (RoomComplete.equals("4g")) {
				System.out.println("you are in an empty room");
				}
			else if (RoomComplete.equals("4h")) {
				System.out.println("you are in what appears to be an elaborate cinema laced with gold everywhere, there is a fantasy movie playing");
				}
			else if (RoomComplete.equals("4i")) {
				System.out.println("you are in an empty room");
				}
				
				
				
				
				
			/*
			 * movement and stuff 
			 */
			System.out.println("what do you want to do?");
		
			String PlayerMovement = Move.nextLine();
			if (PlayerMovement.equalsIgnoreCase("Take Rock")&& RoomComplete.equalsIgnoreCase("3p")) {
				rockItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take knife")&& RoomComplete.equalsIgnoreCase("1e")) {
				knifeItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take orange")&& RoomComplete.equalsIgnoreCase("1d")) {
				orangeItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take dirty syringe")&& RoomComplete.equalsIgnoreCase("1h")) {
				DSyringeItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take sword")&& RoomComplete.equalsIgnoreCase("2b")) {
				swordItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take pills")&& RoomComplete.equalsIgnoreCase("2h")) {
				swordItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("Take axe")&& RoomComplete.equalsIgnoreCase("2l")) {
				axeItem=false;
			}
			if (PlayerMovement.equalsIgnoreCase("read bee movie script")&& RoomComplete.equalsIgnoreCase("2n")) {
				beeMovie.beeMovieScript(args);
			}
			if (PlayerMovement.equalsIgnoreCase("Inventory") || PlayerMovement.equalsIgnoreCase("i")) {
				String[] ShowInven = Arrays.copyOfRange(Inventory, 0, (MaxInven - 1));
				System.out.println(Arrays.toString(ShowInven));
				continue;
			}
			if (PlayerMovement.equalsIgnoreCase("Items") || PlayerMovement.equalsIgnoreCase("Look around")) {
				System.out.println("Heres whats around you");
				System.out.println(Arrays.toString(Items));
				continue;
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[0]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[0])) {
				userAnswer = Items[0];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[1]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[1])) {
				userAnswer = Items[1];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[2]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[2])) {
				userAnswer = Items[2];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[3]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[3])) {
				userAnswer = Items[3];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[4]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[4])) {
				userAnswer = Items[4];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[5]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[5])) {
				userAnswer = Items[5];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[6]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[6])) {
				userAnswer = Items[6];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[7]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[7])) {
				userAnswer = Items[7];
			}
			if (PlayerMovement.equalsIgnoreCase("Take " + Items[8]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[8])) {
				userAnswer = Items[8];
			}

			if (FullInven == true || (i > 3 && (PlayerMovement.equalsIgnoreCase("Take " + Items[0]) || (PlayerMovement.equalsIgnoreCase("Take " + Items[1])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[2]) || (PlayerMovement.equalsIgnoreCase("Take " + Items[3])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[4])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[5])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[6])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[7])|| (PlayerMovement.equalsIgnoreCase("Take " + Items[8])))))))))))) {
				System.out.println("Your inventory is full, which item slot do you want to drop?");
				String[] ShowInven = Arrays.copyOfRange(Inventory, 0, 4);
				System.out.println(Arrays.toString(ShowInven));
				System.out.println("   1,     2,     3,     4?");
				String Replace = ItemReplace.nextLine();
				if (Replace.equals("1")) {
					FullInven = true;
					System.out.println("You Dropped: " + Inventory[0] + "\nYou Picked up: " + userAnswer);
				do {
					if (Items[k]== null) {
					Items[k] = Inventory[0];
				}
				else if(Items[k]!=null) {
					k++;
					continue;
				}
				
				
					Inventory[0] = userAnswer;
					if (userAnswer == Items[0]) {

						Items[0] = null;

					} else if (userAnswer == Items[1]) {

						Items[1] = null;

					} else if (userAnswer == Items[2]) {

						Items[2] = null;

					} else if (userAnswer == Items[3]) {

						Items[3] = null;
						// works

					} else if (userAnswer == Items[4]) {

						Items[4] = null;

					} else if (userAnswer == Items[5]) {

						Items[5] = null;

					} else if (userAnswer == Items[6]) {

						Items[6] = null;

					} else if (userAnswer == Items[7]) {

						Items[7] = null;

					} else if (userAnswer == Items[8]) {

						Items[8] = null;

					}
					k=0;
					break;
				}
					while(true);
					continue;

				} else if (Replace.equals("2")) {
					FullInven = true;
					System.out.println("You Dropped: " + Inventory[1] + "\nYou Picked up: " + userAnswer);
					do {
						if (Items[k]== null) {
						Items[k] = Inventory[1];
					}
					else if(Items[k]!=null) {
						k++;
						continue;
					}
					Inventory[1] = userAnswer;
					if (userAnswer == Items[0]) {

						Items[0] = null;
					} else if (userAnswer == Items[1]) {

						Items[1] = null;
					} else if (userAnswer == Items[2]) {

						Items[2] = null;
					} else if (userAnswer == Items[3]) {

						Items[3] = null;
						// works
					} else if (userAnswer == Items[4]) {

						Items[4] = null;
					} else if (userAnswer == Items[5]) {

						Items[5] = null;

					} else if (userAnswer == Items[6]) {

						Items[6] = null;

					} else if (userAnswer == Items[7]) {

						Items[7] = null;

					} else if (userAnswer == Items[8]) {

						Items[8] = null;

					}
					k=0;
					break;
				}
					while(true);
					
					continue;
				} else if (Replace.equals("3")) {
					FullInven = true;
					System.out.println("You Dropped: " + Inventory[2] + "\nYou Picked up: " + userAnswer);

					do {
						if (Items[k]== null) {
						Items[k] = Inventory[2];
					}
					else if(Items[k]!=null) {
						k++;
						continue;
					}
					Inventory[2] = userAnswer;
					if (userAnswer == Items[0]) {

						Items[0] = null;
					} else if (userAnswer == Items[1]) {

						Items[1] = null;
					} else if (userAnswer == Items[2]) {

						Items[2] = null;
					} else if (userAnswer == Items[3]) {

						Items[3] = null;
					} else if (userAnswer == Items[4]) {

						Items[4] = null;
					} else if (userAnswer == Items[5]) {

						Items[5] = null;

					} else if (userAnswer == Items[6]) {

						Items[6] = null;

					} else if (userAnswer == Items[7]) {

						Items[7] = null;

					} else if (userAnswer == Items[8]) {

						Items[8] = null;

					}
					k=0;
					break;
				}
					while(true);
					continue;
					

				} else if (Replace.equals("4")) {
					FullInven = true;
					System.out.println("You Dropped: " + Inventory[3] + "\nYou Picked up: " + userAnswer);
					do {
						if (Items[k]== null) {
						Items[k] = Inventory[3];
					}
					else if(Items[k]!=null) {
						k++;
						continue;
					}
					Inventory[3] = userAnswer;
					if (userAnswer == Items[0]) {

						Items[0] = null;
					} else if (userAnswer == Items[1]) {

						Items[1] = null;
					} else if (userAnswer == Items[2]) {

						Items[2] = null;
					} else if (userAnswer == Items[3]) {

						Items[3] = null;
						// works
					} else if (userAnswer == Items[4]) {

						Items[4] = null;
					} else if (userAnswer == Items[5]) {

						Items[5] = null;

					} else if (userAnswer == Items[6]) {

						Items[6] = null;

					} else if (userAnswer == Items[7]) {

						Items[7] = null;

					} else if (userAnswer == Items[8]) {

						Items[8] = null;

					}
					k=0;
					break;
				}
					while(true);
					continue;
				

				} else {
					System.out.println("not valid");
					continue;
				}

			}

			if (PlayerMovement.equalsIgnoreCase("Take " + Items[0]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[0])) {

				if (Inventory[0] == Items[0] || Inventory[1] == Items[0] || Inventory[2] == Items[0]
						|| Inventory[3] == Items[0]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[0];
					System.out.println("you now have a " + Items[0] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[0] = null;

				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[1]) || PlayerMovement.equalsIgnoreCase("Pick up " + Items[1])) {
				userAnswer = Items[1];
				if (Inventory[0] == Items[1] || Inventory[1] == Items[1] || Inventory[2] == Items[1]
						|| Inventory[3] == Items[1]) {
					System.out.println("You Already Have this item");
					continue;
				}

				else {
					Inventory[i] = Items[1];
					System.out.println("you now have a " + Items[1] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[1] = null;
				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[2]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[2])) {
				userAnswer = Items[2];
				if (Inventory[0] == Items[2] || Inventory[1] == Items[2] || Inventory[2] == Items[2]
						|| Inventory[3] == Items[2]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[2];
					System.out.println("you now have a " + Items[2] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[2] = null;
				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[3]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[3])) {
				userAnswer = Items[3];
				if (Inventory[0] == Items[3] || Inventory[1] == Items[3] || Inventory[2] == Items[3]
						|| Inventory[3] == Items[3]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[3];
					System.out.println("you now have a " + Items[3] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[3] = null;
				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[4]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[4])) {
				userAnswer = Items[4];
				if (Inventory[0] == Items[4] || Inventory[1] == Items[4] || Inventory[2] == Items[4]
						|| Inventory[3] == Items[4]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[4];
					System.out.println("you now have a " + Items[4] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[4] = null;
				}

			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[5]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[5])) {
				userAnswer = Items[5];
				if (Inventory[0] == Items[5] || Inventory[1] == Items[5] || Inventory[2] == Items[5]
						|| Inventory[3] == Items[5]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[5];
					System.out.println("you now have a " + Items[5] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[5] = null;

				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[6]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[6])) {
				userAnswer = Items[6];
				if (Inventory[0] == Items[6] || Inventory[1] == Items[6] || Inventory[2] == Items[6]
						|| Inventory[3] == Items[6]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[6];
					System.out.println("you now have a " + Items[6] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[6] = null;

				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[7]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[7])) {
				userAnswer = Items[7];
				if (Inventory[0] == Items[7] || Inventory[1] == Items[7] || Inventory[2] == Items[7]
						|| Inventory[3] == Items[7]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[0];
					System.out.println("you now have a " + Items[7] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[7] = null;

				}
			} else if (PlayerMovement.equalsIgnoreCase("Take " + Items[8]) || PlayerMovement.equalsIgnoreCase("Pick Up " + Items[8])) {
				userAnswer = Items[8];
				if (Inventory[0] == Items[8] || Inventory[1] == Items[8] || Inventory[2] == Items[8]
						|| Inventory[3] == Items[8]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[8];
					System.out.println("you now have a " + Items[8] + " in your " + (i + 1) + " inventory slot");
					i++;
					Items[8] = null;

				}
			}
			
			
				else if (PlayerMovement.equalsIgnoreCase("North")) {
				//Win Condition
				// will have to add "&& burlyguarddead" here to ensure that they must kill the guard first
		if (RoomComplete.equals("1c") && PlayerMovement.equalsIgnoreCase("north")&& (burlyGuard== false)) {
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
		
		
		} 
			
		
		while (true);		
		
}


}


	


