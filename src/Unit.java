import java.util.Scanner;

public class Unit {
	int unitLevel;
	String unitRace;
	String unitType;
	int unitAmount;

	Unit(String race, int level, int amount){
		this.unitLevel = level;
		this.unitRace = raceChoice(race);
		this.unitType = raceUnitType(race);
		this.unitAmount = amount;
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
	
	
	static String raceChoice(String race){
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
	
	public static int createUnit(kingdom kingdom1){
		Display.unitDisplayPrompt(kingdom1);
		int unit = 5;
		System.out.println("You chose to create: " + unit + " units.");
			if(kingdom1.raceName == "elves"){
				kingdom1.newGold = (kingdom1.newGold - (2 * unit)); // 100 - ( 5 * 2)
				kingdom1.food = (kingdom1.food - unit); // 50 - 5 
				kingdom1.kingdomUnits.unitAmount = kingdom1.kingdomUnits.unitAmount + unit; 
				int createdUnit = kingdom1.kingdomUnits.unitAmount; 
				Display.displayUnitCreated(kingdom1.newGold, kingdom1.food, kingdom1.kingdomUnits.unitAmount);
				return createdUnit;
			} else {// still needs orcs, humans .. etc
				return 0;
			}
	}
	
	static void readUnit(){
		
	}

	static void updateUnit(){
		
	}
	
	static void deleteUnit(){
		
	}

	public static void main(String[] args){
		Level level = new Level(1,1,5);
		Unit unit1 = new Unit("elves", level.newUnitLevel , 50);
		System.out.println("unit type: " + unit1.unitRace
				+ "\nunit level: " + unit1.unitLevel 
				+ "\nunit amount: " + unit1.unitAmount);
	}

}
