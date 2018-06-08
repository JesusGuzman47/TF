
public class Action {
	static void battle(kingdom kingdom1) {
		System.out.println("--->Inside Action.battle()!");
		System.out.println("You chose to battle!\n");
		if(kingdom1.kingdomUnits.unitAmount == 1){
			System.out.println("--->Inside Action.battle() if statement.");
			System.out.println("but lets create some units first...\n");
			Unit.createUnit(kingdom1);
			battle(kingdom1);
		} else {
			System.out.println("--->Inside Action.battle() if statement for find.");
			if(Find.findOpponent(kingdom1)){
				System.out.println("--->Inside Action.battle() if statement return true to Action battleOpponent.");
				
			} else {
				
			}
		}
	}
	
	static void battleOpponent(kingdom kingdom1) {
		System.out.println("--->Inside Action.battleOpponent()!");
		Display.displayKingdomStats(Opponent.getOpponent());
		
	}
	
	static void create(kingdom kingdom1) {
		System.out.println("--->Inside Action.create() "); 
		System.out.println("Create " + kingdom1.raceName + " unit\n");
		 Unit.createUnit(kingdom1);
	}
}
