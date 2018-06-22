package controller;

public class Display {
	public static void main(){
		//1
		displayMeter(50, 25, 12, 25 + 2,20);
	}
	
	public static void kingdomStats(kingdom kingdom1){
		System.out.println("Race name being called from another class: " + kingdom.getKingdomRace(kingdom1)
				+ "\nkingdome name: " + kingdom1.kingdomName 
				+ "\nResources: " 
				+ "\n->Gold: " + Resources.getGold(kingdom1)
				+ "\n->Food: " + Resources.getFood(kingdom1)
				+ "\nArmy: " + Unit.getUnit(kingdom1)
				+ "\nKingdom level: " + Level.getKingdomLevel(kingdom1)
				+ "\nkingdom exploration level: " + Level.getExplorationLevel(kingdom1)
				+ "\nExperience: " + Experience.getCurrentKingdomExperience(kingdom1) + "/" + Experience.getMaxKingdomExperience(kingdom1)
				+ "\nworkers: " + kingdom1.workers + "\n");
		
	}
	
	public static void unitDisplayPrompt(kingdom kingdom1){
		if(kingdom.getKingdomRace(kingdom1) == "elves"){
			System.out.println("\n=====================================================================");
			System.out.println("ELVES = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			System.out.println("=====================================================================");
			System.out.println("Lets create bowmen!");
			System.out.println("Each bowman costs 2 gold 1 food");
			System.out.println("Enter number of bowmen youd like to create!\n");
		} else {
			System.out.println("No race was selected!\n");
		}
	}


	public static void displayUnitCreated(kingdom kingdom1) {
		System.out.println("-->Inside Display.displayUnitCreated()");
		System.out.println("new gold: " + Resources.getGold(kingdom1));
		System.out.println("new food: " + Resources.getFood(kingdom1));
		System.out.println("new unit amount: " + Unit.getUnit(kingdom1));
		System.out.println("Done creating units! ");
		System.out.println();
	}

	public static void battleOrCreateChoice(){
		System.out.println("\n=====================================================================");
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println("=====================================================================");
		System.out.println("\n\tBattle or create");
		System.out.println("\t1) Battle");
		System.out.println("\t2) Create\n");
	}
	
	public static void displayMeter(int total, int max, int min, int minDex, int target){
		for(int i = 0; i <= total; i++){
			System.out.print("-");
			if(i == target){
				System.out.print("*");
			} else if((i == min) || (i == max)){
				System.out.print("|");
			} else if(i == minDex){
				System.out.print("/");
			} else {
				continue;
			}
		}
		System.out.println();		
	}
	
	public static void displayEnterRace(){
		System.out.println("choose race");
		System.out.println("1) elves");
		System.out.println("2) dwarves");
		System.out.println("3) humans");
		System.out.println("4) orcs \n");
	}
}
