import java.util.Scanner;

public class MovementTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Move = new Scanner(System.in);
		String currentRoom = "o";
		String Destination;
		String FloorNumber = "3";
		String RoomComplete = "3o";
		String FDestination;

		System.out.println("You are in 3o");
		do {

			System.out.println("what do you want to do?");
			String PlayerMovement = Move.nextLine();
			if (PlayerMovement.equalsIgnoreCase("North")) {
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
		} while (true);
	}
}
