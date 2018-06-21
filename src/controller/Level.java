package controller;

public class Level {
	int level;
	int explorationLevel;
	int unitLevel;
	
	Level(int level, int explorationLevel, int unitLevel){		
		this.level = level;
		this.explorationLevel = explorationLevel;
		this.unitLevel = unitLevel;
	}
	
	public static int getKingdomLevel(kingdom kingdom1){
		return kingdom1.kingdomLevel.level;
	}
	
	public static void setKingdomLevel(kingdom kingdom1, int level){
		kingdom1.kingdomLevel.level = level;
	}
	
	public static int getUnitLevel(kingdom kingdom1){
		return kingdom1.kingdomLevel.unitLevel;
	}

	public static int getExplorationLevel(kingdom kingdom1){
		return kingdom1.kingdomLevel.explorationLevel;
	}
	
	public static void updateLevel(){
		
	}
	
	public static void main(String[] args){
		Level level1 = new Level(1,1,1);
		System.out.println("General Level: " + level1.level 
				+ "\nExploration level: " + level1.explorationLevel
				+ "\nUnit Level: " + level1.unitLevel);
	}
}
