package controller;

public class UnitAction {

	public static void main(String[] args){
		System.out.println("Dictated by chance");
		System.out.println("GK1 attack: " + UnitStat.getAttackStats(globalKingdoms.globalKingdom1));
		System.out.println("GK2 attack: " + UnitStat.getAttackStats(globalKingdoms.globalKingdom2));
		System.out.println("gk1 dmg: " + attack(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2));
		System.out.println("gk2 dmg: " + attack(globalKingdoms.globalKingdom2, globalKingdoms.globalKingdom1));
		//System.out.println("gk2 defense: " + defend(globalKingdoms.globalKingdom1));
		
	}
	
	public static int attack(kingdom kingdom1, kingdom opponentKingdom){ // either opponent or kingdom
		int damage = UnitAttackCalculation.chanceItHits(kingdom1, opponentKingdom);
		if(damage > 0){
			return damage;
		} else {
			return damage;
		}	
	}

	
	/*public static int attack(kingdom kingdom1, kingdom opponentKingdom){ // either opponent or kingdom
		int power = 5; //varies 1 - 5
		System.out.println(kingdom1.getKingdomName() + " attackDMG "
		+ UnitStat.getAttackStats(kingdom1) * Level.getUnitLevel(kingdom1) +
		" againts \n" + opponentKingdom.getKingdomName() + " defensePTS " 
		+ (UnitStat.getDefenseStats(opponentKingdom) * Level.getUnitLevel(opponentKingdom)));
		System.out.println("No damage done");				
		//full 
		int enemyDefense = UnitStat.getDefenseStats(opponentKingdom) * Level.getUnitLevel(opponentKingdom);
		int damage = (UnitStat.getAttackStats(kingdom1) * Level.getUnitLevel(kingdom1));
		// 5% chance of doing maximum damage 
		/*getPercentChance(){
		*/
		//chance of 
		// dexterity
		// (3 * 1) - (5 * 1)
		// 3 - 5
		// no damage and he defended // unit will defend each time
		// superior defense
		
		/*if(damage <= 0){
			System.out.println("No damage done");
			return damage;
		} else {
			return damage;
		}
	}*/
	
	
	public static int defend(kingdom kingdom1){
		return 5;
	}
	public static void attackBoost(){
		
	}
	public static void defendBoost(){
		
	}
	
	
}
