
public class Experience {
	
	int currentExperience, maxExperience;
	
	public Experience(int startExperience, int maxExperience){
		this.currentExperience = startExperience;
		this.maxExperience = maxExperience;
	}
	
	public static void increaseExperience(kingdom kingdom1){
		int newExperience = kingdom.getCurrentKingdomExperience(kingdom1) + experienceCalculator();
	
	}

	public static void kingdomExperience(){
		// gain experience by winning battles
		// gain a level
		// after each level kingdom gains bonus
		
	}
	
	public static int experienceCalculator(){
		int experience = 0;
		return experience;
	}
	
	public static void main(){
		
	}
}
