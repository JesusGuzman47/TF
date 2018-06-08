
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
	
	public String getKingdomName(){
		return kingdomName;
	}
	
	public static int getKingdomGold(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesGold;
	}
	
	public static int getKingdomFood(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesFood;
	}
	
	public static int getKingdomUnits(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitAmount;
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
