
public class kingdom {
	
	public String kingdomRaceType;
	String kingdomName;
	Resources kingdomResources;
	Unit kingdomUnits;
	Level kingdomLevel;
	Experience kingdomExperience;
	int workers;
	
	public kingdom(String raceType, String kingdomName, Resources resources, Unit unit, Level level, int workers, Experience experience){
		this.kingdomRaceType = raceType;
		this.kingdomName = kingdomName;
		this.kingdomUnits = unit;
		this.kingdomLevel = level;
		this.kingdomResources = resources;
		this.kingdomExperience = experience;
		this.workers = workers;
	}
	
	public static String getKingdomRace(kingdom kingdom1){
		return kingdom1.kingdomRaceType;
	}
	
	public String getKingdomName(){
		return kingdomName;
	}
	
	public static int getKingdomUnitAmount(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitAmount;
	}
	
	public void setKingdomUnitAmount(int unit){
		kingdomUnits.unitAmount = unit;
	}
	
	public static int getKingdomLevel(kingdom kingdom1) {
		// TODO Auto-generated method stub
		return kingdom1.kingdomLevel.newLevel;
	}
	
	public void setKingdomLevel(int level){
		kingdomLevel.newLevel = level;
	}
	
	
	public static int getKingdomGold(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesGold;
	}
	
	public static int getKingdomFood(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesFood;
	}
	
	public static int getCurrentKingdomExperience(kingdom kingdom1){
		return kingdom1.kingdomExperience.currentExperience;
	}
	
	public void setCurrentKingdomExperience(int experience){
		kingdomExperience.currentExperience = experience;
	}
	
	public static int getMaxKingdomExperience(kingdom kingdom1){
		return kingdom1.kingdomExperience.maxExperience;
	}
	
	public static int getWorkers(kingdom kingdom1){
		return kingdom1.workers;
	}
	
	public static void main(String[] args){
		
	}
}
