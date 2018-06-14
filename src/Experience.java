
public class Experience {
	
	int currentExperience, maxExperience;
	
	public Experience(int startExperience, int maxExperience){
		this.currentExperience = startExperience;
		this.maxExperience = maxExperience;
	}
	
	public static boolean increaseExperience(kingdom kingdom1, kingdom opponentKingdom){
		int newExperience = kingdom.getCurrentKingdomExperience(kingdom1) + experienceCalculator(opponentKingdom);
		kingdom1.setCurrentKingdomExperience(newExperience);
		return true;
	}

	public static void kingdomExperience(kingdom kingdom1){
		// gain experience by winning battles
		// gain a level
		// after each level kingdom gains bonus
		
	}
	
	public static int experienceCalculator(kingdom opponentKingdom){
		//boosters and luck.
		int experience = kingdom.getCurrentKingdomExperience(opponentKingdom) * kingdom.getKingdomLevel(opponentKingdom);
		return experience;
	}
	
	public static void main(String[] args){

	}
}
