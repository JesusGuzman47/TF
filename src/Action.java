
public class Action {
	static void battle(kingdom kingdom1) {
		System.out.println("You chose to battle!\n");
		if(kingdom1.kingdomUnits.unitAmount == 1){
			System.out.println("but lets create some units first...\n");
			Unit.createUnit(kingdom1);
		} else {
			Find.findOpponent(kingdom1);
		}
	}
	
	static void create(kingdom kingdom1) {
		 System.out.println("Create " + kingdom1.raceName + " unit\n");
		 Unit.createUnit(kingdom1);
	}
}
