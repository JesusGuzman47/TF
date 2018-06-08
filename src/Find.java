
public class Find {

	public static void main(String[] args){
		
	}
	
	public static void findOpponent(kingdom kingdom1) {
		System.out.println("We are seeking an opponent!\n");
		//we'll start at a 50% for simplicity
		String found = engine.randomChoice();
		if(found == "1"){
			System.out.println("We found opponent!\n");
			//opponentFound();
		} else {
			System.out.println("We couldnt find opponent!\n");
			System.out.println("Continue searching? \n");
			String yes = engine.randomChoice();
			if(yes == "1"){
				findOpponent(kingdom1);
			} else {
				Choice.battleOrCreateChoice(kingdom1);
			}
		}
	}

}
