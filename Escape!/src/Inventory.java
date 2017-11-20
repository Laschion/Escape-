import java.util.Arrays;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		int MaxInven = 5;
		String[] Inventory = new String[MaxInven];
		String[] Items = new String[9];

		int i = 0;
		int k = 0;
		boolean FullInven = false;
		//Items[0]="String";  would be the format
		String userAnswer = null;
		Items[0]="mace";
		Items[1]="Sword";
				Items[2]="Key";
						Items[3]="Hat";
								Items[4]="garbage";

		// Will change this in room to room only adding the values here for testing
		// purposes

		/*
		 * note for later find a way to clear the inventory maybe after going throuhg
		 * each room unless the item is taken, in other words once an item is taken set
		 * the vlaue of Items to null for that specific item in that room. and on a
		 * different set once the player enters north south east or west clear the
		 * values of items but not reset them for that room just clear them so that a
		 * new set of items can be intialized for the room
		 */
		while (true) {
			@SuppressWarnings("resource")
			Scanner take = new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner ItemReplace = new Scanner(System.in);
			System.out.println("What do you want to do?");
			String Answer = take.nextLine();
			if (Answer.equalsIgnoreCase("Inventory") || Answer.equalsIgnoreCase("i")) {
				String[] ShowInven = Arrays.copyOfRange(Inventory, 0, (MaxInven - 1));
				System.out.println(Arrays.toString(ShowInven));
				continue;
			}
			if (Answer.equalsIgnoreCase("Items") || Answer.equalsIgnoreCase("Look around")) {
				System.out.println("Heres whats around you");
				System.out.println(Arrays.toString(Items));
				continue;
			}
			if (Answer.equalsIgnoreCase("Take " + Items[0]) || Answer.equalsIgnoreCase("Pick Up " + Items[0])) {
				userAnswer = Items[0];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[1]) || Answer.equalsIgnoreCase("Pick Up " + Items[1])) {
				userAnswer = Items[1];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[2]) || Answer.equalsIgnoreCase("Pick Up " + Items[2])) {
				userAnswer = Items[2];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[3]) || Answer.equalsIgnoreCase("Pick Up " + Items[3])) {
				userAnswer = Items[3];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[4]) || Answer.equalsIgnoreCase("Pick Up " + Items[4])) {
				userAnswer = Items[4];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[5]) || Answer.equalsIgnoreCase("Pick Up " + Items[5])) {
				userAnswer = Items[5];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[6]) || Answer.equalsIgnoreCase("Pick Up " + Items[6])) {
				userAnswer = Items[6];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[7]) || Answer.equalsIgnoreCase("Pick Up " + Items[7])) {
				userAnswer = Items[7];
			}
			if (Answer.equalsIgnoreCase("Take " + Items[8]) || Answer.equalsIgnoreCase("Pick Up " + Items[8])) {
				userAnswer = Items[8];
			}

			if (FullInven == true || (i > 3 && (Answer.equalsIgnoreCase("Take " + Items[0]) || (Answer.equalsIgnoreCase("Take " + Items[1])|| (Answer.equalsIgnoreCase("Take " + Items[2]) || (Answer.equalsIgnoreCase("Take " + Items[3])|| (Answer.equalsIgnoreCase("Take " + Items[4])|| (Answer.equalsIgnoreCase("Take " + Items[5])|| (Answer.equalsIgnoreCase("Take " + Items[6])|| (Answer.equalsIgnoreCase("Take " + Items[7])|| (Answer.equalsIgnoreCase("Take " + Items[8])))))))))))) {
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

			if (Answer.equalsIgnoreCase("Take " + Items[0]) || Answer.equalsIgnoreCase("Pick Up " + Items[0])) {

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
			} else if (Answer.equalsIgnoreCase("Take " + Items[1]) || Answer.equalsIgnoreCase("Pick up " + Items[1])) {
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
			} else if (Answer.equalsIgnoreCase("Take " + Items[2]) || Answer.equalsIgnoreCase("Pick Up " + Items[2])) {
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
			} else if (Answer.equalsIgnoreCase("Take " + Items[3]) || Answer.equalsIgnoreCase("Pick Up " + Items[3])) {
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
			} else if (Answer.equalsIgnoreCase("Take " + Items[4]) || Answer.equalsIgnoreCase("Pick Up " + Items[4])) {
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

			} else if (Answer.equalsIgnoreCase("Take " + Items[5]) || Answer.equalsIgnoreCase("Pick Up " + Items[5])) {

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
			} else if (Answer.equalsIgnoreCase("Take " + Items[6]) || Answer.equalsIgnoreCase("Pick Up " + Items[6])) {

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
			} else if (Answer.equalsIgnoreCase("Take " + Items[7]) || Answer.equalsIgnoreCase("Pick Up " + Items[7])) {

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
			} else if (Answer.equalsIgnoreCase("Take " + Items[8]) || Answer.equalsIgnoreCase("Pick Up " + Items[8])) {

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
			} else {
				System.out.println("Not valid try again");
			}
		}
	}
}
