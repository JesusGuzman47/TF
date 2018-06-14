
public class Gain {
	public static void main(){
		//After a victory there are gains
	}
	
	public static boolean gains(){
		return true;
	}
	
	
	public static boolean gainExperience(kingdom kingdom1){
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
		if(kingdom.getCurrentKingdomExperience(kingdom1) >= kingdom.getMaxKingdomExperience(kingdom1)){
			int newLevel = kingdom.getKingdomLevel(kingdom1) + 1;
			kingdom1.setKingdomLevel(newLevel);
			return true;
		} else {
			return false;
		}
		
	}
}
