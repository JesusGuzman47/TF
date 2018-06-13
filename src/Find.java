
public class Find extends Action{

	public static void main(String[] args){
		
	}
	
	public static boolean findOpponent(kingdom kingdom1) {
		System.out.println("--->Inside Find.findOpponent()");
		System.out.println("We are seeking an opponent!\n");
		//we'll start at a 50% for simplicity
		String found = Engine.randomChoice();
		if(found == "1"){
			System.out.println("--->Inside Find.findOpponent() if statement");
			System.out.println("We found opponent!\n");
			return true; //
		} else {
			System.out.println("--->Inside Find.findOpponent() else statement");
			System.out.println("We couldnt find opponent!\n");
			System.out.println("Continue searching? \n");
			String yes = Engine.randomChoice();
			if(yes == "1"){
				System.out.println("--->Inside Find.findOpponent() 'yes' if statement");
				findOpponent(kingdom1);
				return false;
			} else {
				System.out.println("--->Inside Find.findOpponent() 'no' if statement");
				Choice.battleOrCreateChoice(kingdom1);
				return false;
			}
		}
	}

}
