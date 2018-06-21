package controller;

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
	
	
	
	public static int getWorkers(kingdom kingdom1){
		return kingdom1.workers;
	}
	
	public static void main(String[] args){
		kingdom kingdom2 = KingdomAction.CreateKingdom("elves", "TestKINGDOM");
		System.out.println("Kingdom gold: " + Resources.getGold(kingdom2));
		Resources.setGold(kingdom2, (Resources.getGold(kingdom2) + 5));
		System.out.println("Kingdom gold: " + Resources.getGold(kingdom2));
	}
	

}
