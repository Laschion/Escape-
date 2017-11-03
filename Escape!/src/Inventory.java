import java.util.Arrays;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		int MaxInven = 5;
		String[] Inventory = new String[MaxInven];
		String[] Items = new String[9];

		int i = 0;
		Items[0] = "Sword";
		Items[1] = "Lantern";
		Items[2] = "Match";
		Items[3] = "Glass";
		Items[4] = "Matt";
		
		// Will change this in room to room only adding the values here for testing
		// purposes
		
		/*note for later find a way to clear the inventory maybe after going throuhg each room unless the item is taken,
		 *in other words once an item is taken set the vlaue of Items to null for that specific item in that room. and on 
		 *a different set once the player enters north south east or west clear the values of items but not reset them for
		 *that room just clear them so that a new set of items can be intialized for the room
		 */
		while (true) {
			@SuppressWarnings("resource")
			Scanner take = new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner ItemReplace = new Scanner(System.in);
			System.out.println("What do you want to do?");
			String Answer = take.nextLine();
			if (Answer.equalsIgnoreCase("Inventory") || Answer.equalsIgnoreCase("i")) {
				String[] ShowInven = Arrays.copyOfRange(Inventory, 0, 4);
				System.out.println(Arrays.toString(ShowInven));
				continue;
			}
			if (i > 3) {
				System.out.println("Your inventory is full, which item slot do you want to drop?");
				String[] ShowInven = Arrays.copyOfRange(Inventory, 0, 4);
				System.out.println(Arrays.toString(ShowInven));
				System.out.println("   1,     2,     3,     4?");
				String Replace = ItemReplace.nextLine();
				if (Replace.equals("1")) {
					
				} else if (Replace.equals("2")) {

				} else if (Replace.equals("3")) {

				} else if (Replace.equals("4")) {

				}
				else {
					System.out.println("not valid");
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

				}
			} else if (Answer.equalsIgnoreCase("Take " + Items[1]) || Answer.equalsIgnoreCase("Pick up " + Items[1])) {

				if (Inventory[0] == Items[1] || Inventory[1] == Items[1] || Inventory[2] == Items[1]
						|| Inventory[3] == Items[1]) {
					System.out.println("You Already Have this item");
					continue;
				}

				else {
					Inventory[i] = Items[1];
					System.out.println("you now have a " + Items[1] + " in your " + (i + 1) + " inventory slot");
					i++;
				}
			} else if (Answer.equalsIgnoreCase("Take " + Items[2]) || Answer.equalsIgnoreCase("Pick Up " + Items[2])) {
				if (Inventory[0] == Items[2] || Inventory[1] == Items[2] || Inventory[2] == Items[2]
						|| Inventory[3] == Items[2]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[2];
					System.out.println("you now have a " + Items[2] + " in your " + (i + 1) + " inventory slot");
					i++;

				}
			} else if (Answer.equalsIgnoreCase("Take " + Items[3]) || Answer.equalsIgnoreCase("Pick Up " + Items[3])) {
				if (Inventory[0] == Items[3] || Inventory[1] == Items[3] || Inventory[2] == Items[3]
						|| Inventory[3] == Items[3]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[3];
					System.out.println("you now have a " + Items[3] + " in your " + (i + 1) + " inventory slot");
					i++;

				}
			} else if (Answer.equalsIgnoreCase("Take " + Items[4]) || Answer.equalsIgnoreCase("Pick Up " + Items[4])) {
				if (Inventory[0] == Items[4] || Inventory[1] == Items[4] || Inventory[2] == Items[4]
						|| Inventory[3] == Items[4]) {
					System.out.println("You Already Have this items");
					continue;
				} else {
					Inventory[i] = Items[4];
					System.out.println("you now have a " + Items[4] + " in your " + (i + 1) + " inventory slot");
					i++;

				}
			} 
		}
	}

}
