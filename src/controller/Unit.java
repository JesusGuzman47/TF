package controller;
public class Unit {
	int unitLevel;
	String unitRace;
	String unitType;
	int unitAmount;
	UnitStat unitStat;

	Unit(String race, int level, int amount, UnitStat unitStat){
		// send in inside race kingdom getRace
		this.unitLevel = level;
		this.unitRace = raceChoice(race);
		this.unitType = raceUnitType(race);
		this.unitAmount = amount;
		this.unitStat = unitStat;
	}

	static String raceUnitType(String race){
		if(race == "elves"){
			return "bowmen";
		} 
		if(race == "dwarves"){
			return "axemen";
		} 
		if(race == "humans"){
			return "swordsmen";
		} 
		if(race == "orcs"){
			return "grunt";
		} else { 
			System.out.println("No race entered!");
			return null;
		}
		
	}
	
	
	public static String raceChoice(String race){
		String unitRace;
		if(race == "elves"){
			unitRace = race;
			return unitRace;
		} 
		if(race == "dwarves"){
			unitRace = race;
			return unitRace;
		} 
		if(race == "humans"){
			unitRace = race;
			return unitRace;
		} 
		if(race == "orcs"){
			unitRace = race;
			return unitRace;
		} 
		else { 
			System.out.println("No race entered!");
			return null;
		}
		
	}
	
	public static void createUnit(kingdom kingdom1){
		//directly change the field of object
		Display.kingdomStats(kingdom1);
		Display.unitDisplayPrompt(kingdom1);
		int unitAmount = Engine.randomlyCreateUnitAmount(kingdom1);
		// based upon amount of gold currently have 
		//  should be random also //when you click 5 you can only hope to get 5 units
		//  this is because you may be able to create or to not create because there are no units to make, create people
		System.out.println("--->Inside Unit.createUnit()!");
		System.out.println("You chose to create: " + unitAmount + " units.");
			if(kingdom.getKingdomRace(kingdom1) == "elves"){
				Resources.setGold(kingdom1, (Resources.getGold(kingdom1) - (2 * unitAmount)));
				Resources.setFood(kingdom1, (Resources.getFood(kingdom1) - unitAmount));
				Unit.setUnit(kingdom1, (Unit.getUnit(kingdom1) + unitAmount));
				//Resources.getGold(kingdom1), Resources.getFood(kingdom1), Unit.getUnit(kingdom1)
				Display.displayUnitCreated(kingdom1);
			} else {// still needs orcs, humans .. etc
				//return 0;
			}
	}
	
	public static int getUnit(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitAmount;
	}
	
	public static void setUnit(kingdom kingdom1, int unit){
		kingdom1.kingdomUnits.unitAmount = unit;
	}

	static void updateUnit(){
		
	}
	
	static void deleteUnit(){
		
	}

	public static void main(String[] args){
		Level level = new Level(1,1,5);
		
		UnitStat unitStat = new UnitStat(3, 5, 8, 10, 5, 4, 5);
		Unit unit1 = new Unit("elves", level.level , 50, unitStat);
		System.out.println("Unit attack stat: " + unit1.unitStat.unitAttack);
		//use kingdom or unit?
	}

}
