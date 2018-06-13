
public class Action {
	//
	static boolean checkUnitAndFind(kingdom kingdom1) { // checkUnit
		System.out.println("--->Inside Action.checkUnit()!");
		System.out.println("You chose to battle!\n");
		if(kingdom.getKingdomUnitAmount(kingdom1) == 1){ // if only 1 unit
			System.out.println("--->Inside Action.checkUnit() if statement.");
			System.out.println("but lets create some units first...\n");
			return true;
			//Unit.createUnit(kingdom1);
			//checkUnitAndFind(kingdom1);
		} else { // more than 1 unit
			/*System.out.println("--->Inside Action.checkUnit() if statement for find.");
			if(Find.findOpponent(kingdom1)){ //if we found an opponent
				System.out.println("--->Inside Action.checkUnit() if statement return true to Action.battleOpponent().");
				//Battle.battleOpponent(kingdom1);
				return false;
			} else { //wE DIDNT FIND ANYTHING
				System.out.println("\nDidnt find anything..\n;");
				return false;
			}*/
			return false;
		}
	}
	
	
	static boolean create(kingdom kingdom1) {
		System.out.println("--->Inside Action.create() "); 
		System.out.println("Create " + kingdom1.getRace() + " unit\n");
		return true;
	}
	
	public static kingdom createOpponent() {
		//this will create opponent object and units
		System.out.println("--->Inside Action.createOpponent()!");
				String opponentRaceType = "elves";
				String opponentKingdomName = "opponent kingdom";
				//Attributes.startingRaceResources(raceType);
				Resources opponentResources = Attributes.startingRaceResources(opponentRaceType); //haha
				int workers = 1;
				Level level = new Level(1, 1, 1);
				Unit unit = new Unit(opponentRaceType, level.getUnitLevel(), 0);
				Experience experience = new Experience(0,100);
				kingdom opponentKingdom = new kingdom(opponentRaceType, opponentKingdomName, opponentResources, unit, level, workers, experience);
				//unit = Action.createOpponentUnits(opponentKingdom, unit);
				Action.createOpponentUnits(opponentKingdom);
				Display.displayKingdomStats(opponentKingdom);
				return opponentKingdom;
	}
	
	public static void createOpponentUnits(kingdom opponentKingdom){
		System.out.println("--->Inside Action.createOpponentUnits()!");
		Unit.createUnit(opponentKingdom);
	}

	public static kingdom CreateKingdom() {
		// TODO Auto-generated method stub
		String raceType = Choice.chooseRace();
		String kingdomName = kingdomEntry.enterName();
		//Attributes.startingRaceResources(raceType);
		Resources resources = Attributes.startingRaceResources(raceType); //haha
		int workers = 1;
		Level level = new Level(1, 1, 1);
		Unit unit = new Unit(raceType, level.newUnitLevel, 1);
		Experience experience = new Experience(0,100);
		kingdom kingdom1 = new kingdom(raceType, kingdomName, resources, unit, level, workers, experience);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		return kingdom1;
	}
}
