package supportingConcepts;

public class InterestingSwitchingCase {

	public static void main(String[] args){
		int s=7;
		
		switch(s){
		case 2:
		case 4:
		case 6:
		case 10:
		case 12:
			System.out.println("interesting!");
			break;
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Boring!");
			break;
			default:
				System.out.println("I am netural");
				break;
		}
	}
	
	
}
