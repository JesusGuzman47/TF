
public class kingdom {
	
	String raceName;
	String kingdomName;
	Resources kingdomResources;
	Unit kingdomUnits;
	Level kingdomLevel;
	int workers;
	
	public kingdom(String raceType, String kingdomName, Resources resources, Unit unit, Level level, int workers){
		this.raceName = raceType;
		this.kingdomName = kingdomName;
		this.kingdomUnits = unit;
		this.kingdomLevel = level;
		this.kingdomResources = resources;
		this.workers = workers;
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
