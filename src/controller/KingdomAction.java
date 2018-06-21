package controller;

public class KingdomAction {
	static boolean checkUnitAndFind(kingdom kingdom1) { // checkUnit
		System.out.println("--->Inside KingdomAction.checkUnit()!");
		System.out.println("You chose to battle!\n");
		if(kingdom.getKingdomUnitAmount(kingdom1) == 1){ // if only 1 unit
			System.out.println("--->Inside KingdomAction.checkUnit() if statement.");
			System.out.println("but lets create some units first...\n");
			return true;
		} else { 
			return false;
		}
	}
	
	static boolean create(kingdom kingdom1) {
		System.out.println("--->Inside KingdomAction.create() "); 
		System.out.println("Create " + kingdom.getKingdomRace(kingdom1) + " unit\n");
		return true;
	}
	
	public static kingdom createOpponent() {
		//this will create opponent object and units
		System.out.println("--->Inside KingdomAction.createOpponent()!");
		String opponentRaceType = "elves";
		String opponentKingdomName = "opponent kingdom";
		//Attributes.startingRaceResources(raceType);
		Resources opponentResources = Attributes.startingRaceResources(opponentRaceType); //haha
		int workers = 1;
		Level level = new Level(2, 1, 1);
		UnitStat unitStat = new UnitStat(3, 5, 10, 5, 3, 6, 7); // strength, defense, chance, range, healthpoints, (Speed?), armor, (natural defense + armor = defense), opponent finesse
		Unit unit = new Unit(opponentRaceType, level.unitLevel, 33, unitStat);
		Experience experience = new Experience(1, 3); // randomly generate all these int numbers in a scope
		kingdom opponentKingdom = new kingdom(opponentRaceType, opponentKingdomName, opponentResources, unit, level, workers, experience);
		//unit = KingdomAction.createOpponentUnits(opponentKingdom, unit);
		KingdomAction.createOpponentUnits(opponentKingdom);
		Display.kingdomStats(opponentKingdom);
		return opponentKingdom;
	}
	
	public static void createOpponentUnits(kingdom opponentKingdom){
		System.out.println("--->Inside KingdomAction.createOpponentUnits()!");
		Unit.createUnit(opponentKingdom);
	}

	public static kingdom CreateKingdom(String raceType, String kingdomName) {
		Resources resources = Attributes.startingRaceResources(raceType); 
		int workers = 1;
		Level level = new Level(1, 1, 1);
		UnitStat unitStat = new UnitStat(3, 5, 7, 8, 3, 6, 10);
		Unit unit = new Unit(raceType, level.unitLevel, 1, unitStat);
		Experience experience = new Experience(1, 1);
		kingdom kingdom1 = new kingdom(raceType, kingdomName, resources, unit, level, workers, experience);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		return kingdom1;
	}
}
