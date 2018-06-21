package controller;

import java.util.Random;

public class UnitAttackCalculation {

	//0 - 100
	// higher the chance the lower the strength vice versa.
	// higher the level the better the chance
	// focus and dexterity boosts chance
	// strong bowmen
	// each unit as independent levels
	//actualAttack/fullAttack = calculatedChance/100
	// x/30 = CC/100
	// x == ((dexterity + focus) / 100) * 30
	// cc = dexterity + focus
	// cc = 30 / 100
	// hit or miss
	// x + weapon bonus
	// critical hit
	// good hit
	// neutral hit
	// bad hit
	// miss
	/*public static void attackRating(kingdom kingdom1){		
		Random objGenerator = new Random();
		int number = 100;
		System.out.println("kingdom level: " + Level.getUnitLevel(kingdom1));
		for(int i = 0; i < number; i++){
			int randomNumber = objGenerator.nextInt(100);// lands from 0 - 100
			int changingVar = UnitStat.getChanceStats(kingdom1);
		
			if(randomNumber < changingVar){ // 33 will be a variable
				//int x = 
			} else if(randomNumber > 33){ 
			
			} else {
			
			}
		}
	}*/	

	// as speed goes up chances of hitting or worse
	// hit vs speed
	//races have different kinds of start speed
	// orcs slowest
	// dwarves slower
	// humans fast
	// elves fastest
	//double levelChance = constant + Math.pow(0.5, opponentSpeed);// a + b^c // result goes downward
	// a chance is the starting and goes upwards exponentially
	// b dexterity keeps the growth
	// c focus
	// d bonuses
	// 90% to hit
	// decreases if speed is greater than dextiry
	// DEX 3 * FOC 3
	// 9 * 10
		// 10 multiplied can be changed to 10+-33
	// SPD 3 * FOC 3
	// 9 * 10
	// 90 - (SPD * AWR)

	public static int chanceItHits(kingdom kingdom1, kingdom opponentKingdom){
		Random objGenerator = new Random();
		int randomNumber = objGenerator.nextInt(100);
		//System.out.println("The random number must be less than 89(0 - 90) for choice to be 1: " + randomNumber + "\n");
		//double hitAccuracy = (((double)UnitStat.getSpeedStats(opponentKingdom)) - 1) * (double)UnitStat.getDexterityStats(kingdom1) * 5 ;
		//System.out.println(hitAccuracy + " = " +  UnitStat.getSpeedStats(kingdom1) + " * " + UnitStat.getDexterityStats(opponentKingdom));
		if(randomNumber <= 100){
			System.out.println("HIT");
			return microFight(defenseAmount(kingdom1), damageAmount(opponentKingdom));
		}else {
			System.out.println("MISS\n");
			return 0;
		}
		
	}
	
	public static int defenseAmount(kingdom kingdom1){
		Random objGenerator = new Random();
		// strength * dexterity 
		int defDiv2Max = UnitStat.getDefenseStats(kingdom1) / 2;
		int defDiv2Min = defDiv2Max/2; 

		int dexDiv2Max = UnitStat.getDexterityStats(kingdom1) / 2;
		int dexDiv2Min = dexDiv2Max /2; 
		
		int randomDefenseStat = objGenerator.nextInt((defDiv2Max/defDiv2Min) + 1) + defDiv2Min;
		int randomDexterityStat = objGenerator.nextInt((dexDiv2Max/dexDiv2Min) + 1) + dexDiv2Min;
		int total = randomDefenseStat * randomDexterityStat;
		return objGenerator.nextInt((total/defDiv2Min) + 1) + total; // falls inside 0 to max 63 or 10
	}
	
	public static int damageAmount(kingdom kingdom1){
		Random objGenerator = new Random();
		// strength * dexterity 
		int atkDiv2Max = UnitStat.getAttackStats(kingdom1) / 2;
		//System.out.println("\nGet attack stat: " + UnitStat.getAttackStats(kingdom1) / 2);
		int atkDiv2Min = atkDiv2Max/2; 

		int dexDiv2Max = UnitStat.getDexterityStats(kingdom1) / 2;
		//System.out.println("Get dexterity stat: " + UnitStat.getDexterityStats(kingdom1) / 2);
		int dexDiv2Min = dexDiv2Max /2; 
		
		int randomAttackStat = objGenerator.nextInt((atkDiv2Max/atkDiv2Min) + 1) + atkDiv2Min;
		int randomDexterityStat = objGenerator.nextInt((dexDiv2Max/dexDiv2Min) + 1) + dexDiv2Min;
		int total = randomAttackStat * randomDexterityStat;
		return objGenerator.nextInt((total/atkDiv2Min) + 1) + total; // falls inside 0 to max 63 or 10
	}
	
	public static int microFight(int dmg, int def){
		if(dmg > def){
			System.out.println("damage dealt: " + Math.abs(def - dmg));
			return def - dmg;
		} else {
			System.out.println("damage blocked: " + Math.abs(def - dmg));
			return def - dmg;
		} 
	}
	
	public static void Main(String[] args){
		chanceItHits(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2);
	}
}
