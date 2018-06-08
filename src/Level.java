
public class Level {
	int newLevel;
	int newExplorationLevel;
	int newUnitLevel;
	
	Level(int level, int explorationLevel, int unitLevel){		
		this.newLevel = level;
		this.newExplorationLevel = explorationLevel;
		this.newUnitLevel = unitLevel;
	}
	
	public int readLevel(){
		return newLevel;
	}
	
	public static void updateLevel(){
		
	}
	
	public static void main(String[] args){
		Level level1 = new Level(1,1,1);
		System.out.println("General Level: " + level1.newLevel 
				+ "\nExploration level: " + level1.newExplorationLevel
				+ "\nUnit Level: " + level1.newUnitLevel);
	}
}
