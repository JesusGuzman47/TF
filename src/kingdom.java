
public class kingdom {
	
	String raceName;
	String kingdomName;
	int newGold;
	int food;
	Unit kingdomUnits;
	Level kingdomLevel;
	int newExplorationLevel;
	int workers;
	
	public kingdom(String raceType, String kingdomName, int gold, int food, 
			Unit unit, Level level, int workers){
		this.raceName = raceType;
		this.kingdomName = kingdomName;
		this.newGold = gold;
		this.food = food;
		this.kingdomUnits = unit;
		this.kingdomLevel = level;
		this.workers = workers;
	}
	
	public int buyUnit(int gold){
		newGold = gold - 1;
		System.out.println("gold: " + gold);
		return newGold;
	}
	
	/*public int addToArmy(int army){
		//newArmy = army + 1;
		//return newArmy;
	}*/
	
	public int addWorker(int worker){
		workers = worker + 1;
		return workers;
	}
	
	
	public String getKingdomName(){
		return kingdomName;
	}
	
	public String getRace(){
		return raceName;
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return kingdomLevel.newLevel;
	}
	
	public static void main(String[] args){
		
	}
}
