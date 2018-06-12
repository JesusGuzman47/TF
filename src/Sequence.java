
public class Sequence {
	public static void main(String[] args){
		System.out.println("All methods will be called sequentially from here.");
		System.out.println("Can only choose elves.\n");
		kingdom kingdom1 = Action.CreateKingdom();
		Display.displayKingdomStats(kingdom1);
		repeatSequence(kingdom1); 
	}
	
	
	/* 
	 * battle or create, check if you have units,
	 * find opponent, battle opponent
	*/
	public static void repeatSequence(kingdom kingdom1){
		if(Choice.battleOrCreateChoice(kingdom1)){
			if(Action.checkUnitAndFind(kingdom1)){
				Unit.createUnit(kingdom1);
				repeatSequence(kingdom1);
			} else {
				System.out.println("Did we hit?");
				if(Find.findOpponent(kingdom1)){
					Battle.battleOpponent(kingdom1);
				} else {	
					System.out.println("Inside sequence.");
				}
			}
		} else {
			if(Action.create(kingdom1)){
				Unit.createUnit(kingdom1);
			} else {
				System.out.println("didnt create unit!");
			}
		}
	}
	
	
}
