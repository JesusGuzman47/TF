package controller;

public class Experience {
	
	int currentExperience, maxExperience;
	
	public Experience(int startExperience, int maxExperience){
		this.currentExperience = startExperience;
		this.maxExperience = maxExperience;
	}
	
	public static void increaseCurrentExperience(kingdom kingdom1, kingdom opponentKingdom){		
		int exp = getMaxKingdomExperience(opponentKingdom) * Level.getKingdomLevel(opponentKingdom);
		int newExp = (getCurrentKingdomExperience(kingdom1) + exp);
		setCurrentKingdomExperience(kingdom1, newExp); // (x + (x(o) * z(o)))
		System.out.println("Gained " + exp + " experience");
	}

	public static void increaseMaxExperienceCalculator(kingdom kingdom1){
		int exp = (Level.getKingdomLevel(kingdom1) ^ 2);
		int maxExp = (getCurrentKingdomExperience(kingdom1) + exp);
		setMaxKingdomExperience(kingdom1, maxExp); // maxExp + level ^ 2
		System.out.println("Increased max experience by: " + exp);
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
		System.out.println("your current experience test: " + getCurrentKingdomExperience(globalKingdoms.globalKingdom1));
		System.out.println("your max experience test: " + getMaxKingdomExperience(globalKingdoms.globalKingdom1));
				
		for(int i = 0; i <= 5; i++){
			System.out.println();
			increaseCurrentExperience(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2);
			increaseMaxExperienceCalculator(globalKingdoms.globalKingdom1);
			System.out.println("new max exp: " + getMaxKingdomExperience(globalKingdoms.globalKingdom1));
			System.out.println("new current exp: " + getCurrentKingdomExperience(globalKingdoms.globalKingdom1));
			System.out.println();
		}
	}
}
