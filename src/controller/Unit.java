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
		
		System.out.println("--->Inside Unit.createUnit()!");
		System.out.println("You chose to create: " + unitAmount + " units.");
			if(kingdom.getKingdomRace(kingdom1) == "elves"){
				int newGold = Resources.getGold(kingdom1) - (2 * unitAmount);
				int newFood = (Resources.getFood(kingdom1) - unitAmount);
				Resources.setGold(kingdom1, newGold);
				Resources.setFood(kingdom1, newFood);
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
		
		UnitStat unitStat = new UnitStat(3, 5, 8, 10, 5, 4, 6, 5, 5);
		Unit unit1 = new Unit("elves", level.level , 50, unitStat);
		System.out.println("Unit attack stat: " + unit1.unitStat.unitAttack);
		//use kingdom or unit?
		
		Unit.createUnit(globalKingdoms.globalKingdom1);
	}

}
