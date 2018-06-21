package controller;

public class Gain {
	public static void main(){
		//After a victory there are gains
	}
	
	public static boolean gains(){
		return true;
	}
	
	
	public static boolean gainExperience(kingdom kingdom1, kingdom opponentKingdom){
		Experience.increaseCurrentExperience(kingdom1, opponentKingdom);
		return true;
	}
	
	public static boolean gainGold(kingdom kingdom1){	
		//gain from village and enemy
		return true;
	}
	
	public static boolean gainFood(kingdom kingdom1){
		//gain from village and enemy
		return true;
	}
	
	public static boolean gainLevel(kingdom kingdom1){
		//only if experience is there
		if(Experience.getCurrentKingdomExperience(kingdom1) >= Experience.getMaxKingdomExperience(kingdom1)){
			Level.setKingdomLevel(kingdom1, (Level.getKingdomLevel(kingdom1) + 1));
			Experience.increaseMaxExperienceCalculator(kingdom1);
			System.out.println("Max exp: " + Experience.getMaxKingdomExperience(kingdom1) + "\nCurrent exp: " + Experience.getCurrentKingdomExperience(kingdom1));
			return true;
		} else {
			return false;
		}
		
	}
}
