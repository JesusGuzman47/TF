
public class Battle extends Action{
	public static void main(String[] args){
		//This is where unit go to battle
	}
	
	public static boolean battleOpponent(kingdom kingdom1) {
		System.out.println("--->Inside Action.battleOpponent()!");
		//kingdom opponentKingdom = Action.createOpponent(); //create opponent inside battle opponent? or should be created sooner?
		return true;
	}
	
	public static boolean unitBattle(kingdom kingdom1, kingdom opponentKingdom){
		// who has biggest army		
		if(kingdom.getKingdomUnitAmount(kingdom1) >= kingdom.getKingdomUnitAmount(opponentKingdom)){
			System.out.println("You're army wins"); 
			// based off army size and army level
			//Gain.gains();
			return true;
		} else {
			System.out.println("You're army loses");
			return false;
		}
	}
	
}
