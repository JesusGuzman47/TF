package controller;

public class Gain {
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			gainLevel(globalKingdoms.globalKingdom1);
		}
	}
	
	public static boolean gains(){
		return true;
	}
	
	
	public static boolean gainExperience(kingdom kingdom1, kingdom opponentKingdom){
		Experience.increaseCurrentExperience(kingdom1, opponentKingdom);
		return true;
	}
	
	public static boolean gainGold(kingdom kingdom1, kingdom opponentKingdom){	
		//gain from village and enemy
		return true;
	}
	
	public static boolean gainFood(kingdom kingdom1, kingdom opponentKingdom){
		//gain from village and enemy getFood from enemy
		//grab Food Resource from enemy if won
		Resources.getFood(kingdom1);
		return true;
	}
	
	public static boolean gainLevel(kingdom kingdom1){
		//only if experience is there
		if(Experience.getCurrentKingdomExperience(kingdom1) >= Experience.getMaxKingdomExperience(kingdom1)){
			int newLevel = Level.getKingdomLevel(kingdom1) + 1;
			Level.setKingdomLevel(kingdom1, newLevel);
			Experience.increaseMaxExperienceCalculator(kingdom1);
			System.out.println(kingdom1.getKingdomName() + " experience: " +Experience.getCurrentKingdomExperience(kingdom1) + "/" + Experience.getMaxKingdomExperience(kingdom1));
			return true;
		} else {
			return false;
		}
	}
}
