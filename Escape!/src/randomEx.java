import java.util.Random ;
public class randomEx {
	
public static void main(String[] args) {
	Random rand = new Random();
	int VTrollHealth= 100;
	int PlayerHealth= 200;
	int x = rand.nextInt(10);
	while (PlayerHealth>0) {
	System.out.println(x);
	
	
	
	if (x== 0) {
	PlayerHealth= PlayerHealth - PlayerHealth ;	
	
	}
	else if (x == 2) {
		PlayerHealth= PlayerHealth - 50 ;
	}
	else if (x == 1) {
		PlayerHealth= PlayerHealth - 50 ;
	}
	}
	 {
		
	}
}
}
