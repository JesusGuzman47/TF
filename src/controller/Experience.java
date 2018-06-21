package controller;

public class Experience {
	
	int currentExperience, maxExperience;
	
	public Experience(int startExperience, int maxExperience){
		this.currentExperience = startExperience;
		this.maxExperience = maxExperience;
	}
	
	public static void increaseCurrentExperience(kingdom kingdom1, kingdom opponentKingdom){		
		setCurrentKingdomExperience(kingdom1, (getCurrentKingdomExperience(kingdom1) + (getMaxKingdomExperience(opponentKingdom) * Level.getKingdomLevel(opponentKingdom)))); // (x + (x(o) * z(o)))
		System.out.println("Gained " + (getMaxKingdomExperience(opponentKingdom) * Level.getKingdomLevel(opponentKingdom)) + " experience");
	}

	public static void increaseMaxExperienceCalculator(kingdom kingdom1){
		setMaxKingdomExperience(kingdom1, (getCurrentKingdomExperience(kingdom1) + Experience.getMaxKingdomExperience(kingdom1) + (Level.getKingdomLevel(kingdom1) ^ 2))); // maxExp + level ^ 2
	}
	
	public static int getCurrentKingdomExperience(kingdom kingdom1){
		return kingdom1.kingdomExperience.currentExperience;
	}
	
	public static void setCurrentKingdomExperience(kingdom kingdom1, int experience){
		kingdom1.kingdomExperience.currentExperience = experience;
	}
	
	public static int getMaxKingdomExperience(kingdom kingdom1){
		return kingdom1.kingdomExperience.maxExperience;
	}
	
	public static void setMaxKingdomExperience(kingdom kingdom1, int experience){
		kingdom1.kingdomExperience.maxExperience = experience;
	}
	

	
	public static void main(String[] args){
		Experience yourExperienceTest = new Experience(1, 23);
		Experience opponentExperienceTest = new Experience(2, 33);
		System.out.println("your current experience test: " + yourExperienceTest.currentExperience);
		System.out.println("your max experience test: " + yourExperienceTest.maxExperience);
		

		System.out.println("your current experience test: " + opponentExperienceTest.currentExperience);
		System.out.println("your max experience test: " + opponentExperienceTest.maxExperience);
	}
}
