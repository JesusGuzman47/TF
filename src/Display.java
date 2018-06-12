
public class Display {
	public static void main(){
		//
		
	}
	
	public static void displayKingdomStats(kingdom kingdom1){
		System.out.println("Race name being called from another class: " + kingdom1.getRace()
				+ "\nkingdome name: " + kingdom1.kingdomName 
				+ "\nResources: " 
				+ "\n->Gold: " + kingdom1.kingdomResources.resourcesFood
				+ "\n->Food: " + kingdom1.kingdomResources.resourcesGold
				+ "\nArmy: " + kingdom1.kingdomUnits.unitAmount
				+ "\nKingdom level: " + kingdom1.kingdomLevel.newLevel
				+ "\nkingdom exploration level: " + kingdom1.kingdomLevel.newExplorationLevel
				+ "\nworkers: " + kingdom1.workers + "\n");
		
	}
	
	public static void unitDisplayPrompt(kingdom kingdom1){
		if(kingdom1.getRace() == "elves"){
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


	public static void displayUnitCreated(int newGold, int food, int unitAmount) {
		System.out.println("-->Inside Display.displayUnitCreated()");
		System.out.println("new gold: " + newGold );
		System.out.println("new food: " + food);
		System.out.println("new unit amount: " + unitAmount);
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
	
	public static void displayEnterRace(){
		System.out.println("choose race");
		System.out.println("1) elves");
		System.out.println("2) dwarves");
		System.out.println("3) humans");
		System.out.println("4) orcs \n");
	}
}
