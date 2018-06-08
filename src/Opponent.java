
public class Opponent {
	private static final kingdom opponentKingdom = null;
	
	public static void main(String[] args){
		
		System.out.println("this is opponent class.");
		//rough draft of what opponent is
		String opponentRaceType = Choice.chooseRace();
		String opponentKingdomName = entry.enterName();
		//Attributes.startingRaceResources(raceType);
		Resources opponentResources = Attributes.startingRaceResources(opponentRaceType); //haha
		int workers = 1;
		Level level = new Level(1, 1, 1);
		//Action.createOpponentUnits();
		//
		Unit unit = new Unit(opponentRaceType, level.newUnitLevel, 1);
	
		kingdom opponentKingdom = new kingdom(opponentRaceType, opponentKingdomName, opponentResources, unit, level, workers);
		Display.displayKingdomStats(opponentKingdom);
	}
		
	public static kingdom getOpponent(){
		return opponentKingdom;// returns opponentKingdom object Opponent.getOpponent();
	}

}
