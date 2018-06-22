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
	// K attacks OK
	public static int chanceItHits(kingdom kingdom1, kingdom opponentKingdom){
		//Random objGenerator = new Random();
		int randomNumber = 100;
		
		//System.out.println("The random number must be less than 89(0 - 90) for choice to be 1: " + randomNumber + "\n");
		//double hitAccuracy = (((double)UnitStat.getSpeedStats(opponentKingdom)) - 1) * (double)UnitStat.getDexterityStats(kingdom1) * 5 ;
		//System.out.println(hitAccuracy + " = " +  UnitStat.getSpeedStats(kingdom1) + " * " + UnitStat.getDexterityStats(opponentKingdom));
		if(randomNumber == 100){
			System.out.println("\nHIT");
			//OK defends from K
			return microFight(kingdom1, opponentKingdom, defenseAmount(opponentKingdom), damageAmount(kingdom1));
		}else {
			System.out.println("\nMISS");
			return 0;
		}
		
	}
	
	public static int defenseAmount(kingdom kingdom1){
		Random objGenerator = new Random();
		int defenseMax = (UnitStat.getDefenseStats(kingdom1) / 2) + UnitStat.getFocusStats(kingdom1);
		int defenseMin = defenseMax/2 ; 
		int newDefenseMin = defenseMin + UnitStat.getDexterityStats(kingdom1) + UnitStat.getFocusStats(kingdom1);
		
		if(newDefenseMin == defenseMax){
			defenseMin = defenseMin - 1;
			int target = objGenerator.nextInt((defenseMax - newDefenseMin) + 1) + newDefenseMin;
			//showAmount("D", defenseMax, defenseMin, target, kingdom1);
			System.out.print(kingdom1.getKingdomName() + " Defense Meter: ");
			Display.displayMeter(UnitStat.getDefenseStats(kingdom1), defenseMax, defenseMin, newDefenseMin, target);
			return target; 
		} else if(newDefenseMin >= defenseMax){
			defenseMax = newDefenseMin - 1;
			System.out.println(kingdom1.getKingdomName() + " Reached true defense. Meter: ");
			Display.displayMeter(UnitStat.getDefenseStats(kingdom1), defenseMax, defenseMin, newDefenseMin, defenseMax);
			System.out.println("Increase defense stat");
			return defenseMax;
		} else {
			int target = objGenerator.nextInt((defenseMax - newDefenseMin) + 1) + newDefenseMin;
			//showAmount("D", defenseMax, defenseMin, target, kingdom1);
			System.out.print(kingdom1.getKingdomName() + " Defense Meter: \n");
			Display.displayMeter(UnitStat.getDefenseStats(kingdom1), defenseMax, defenseMin, newDefenseMin, target);
			return target;  // falls inside 0 to max 63 or 10
		}
	}
	
	public static int damageAmount(kingdom kingdom1){
		Random objGenerator = new Random();
		
		int newAttackMax = (UnitStat.getAttackStats(kingdom1) / 2); 
		newAttackMax = newAttackMax + UnitStat.getFocusStats(kingdom1);
		
		int attackMin = newAttackMax / 2;
		int newAttackMin = attackMin + UnitStat.getDexterityStats(kingdom1) + UnitStat.getFocusStats(kingdom1); // + dextirity 
		
		if(newAttackMin == newAttackMax){
			newAttackMin = newAttackMin - 1;
			int target = objGenerator.nextInt((newAttackMax - newAttackMin) + 1) + newAttackMin;
			//showAmount("A",newAttackMax, newAttackMin, target, kingdom1);
			System.out.print(kingdom1.getKingdomName() + " Attack Meter: \n");
			Display.displayMeter(UnitStat.getAttackStats(kingdom1), newAttackMax, attackMin, newAttackMin, target);
			return target;
		} else if(newAttackMin >= newAttackMax){
			newAttackMax = newAttackMin - 1;
			System.out.println(kingdom1.getKingdomName() + " Reached true Attack. Meter: ");
			Display.displayMeter(UnitStat.getAttackStats(kingdom1), newAttackMax, attackMin, newAttackMin, newAttackMax);
			System.out.println("Increase attack stat");
			return newAttackMax;  
		} else {
			int target = objGenerator.nextInt((newAttackMax - newAttackMin) + 1) + newAttackMin;
			//showAmount("A",newAttackMax, newAttackMin, target, kingdom1);
			System.out.print(kingdom1.getKingdomName() + " Attack Meter: \n");
			Display.displayMeter(UnitStat.getAttackStats(kingdom1), newAttackMax, attackMin, newAttackMin, target);
			return target;
		}
	}
	
	public static int microFight(kingdom kingdom1, kingdom opponentKingdom, int dmg, int def){
		if(dmg < def){
			System.out.println(kingdom1.getKingdomName() + " dealt " + Math.abs(def - dmg) + " damage.");
			return def - dmg;
		} else {
			System.out.println(opponentKingdom.getKingdomName() + " blocked " + Math.abs(def - dmg) + " damage.");
			return def - dmg;
		} 
	}
	

	public static void showAmount(String ad, int max, int min, int target, kingdom kingdom1){
		System.out.println("kingdom name: " + kingdom1.getKingdomName());
		if(ad == "D"){
			System.out.println("Def: " + UnitStat.getDefenseStats(kingdom1) 
			+ " \nmax D: " + max 
			+ " \nmin D: " + min
			+ " \ntarget: " + target);
		} else if(ad == "A"){
			System.out.println("Atk: " + UnitStat.getAttackStats(kingdom1) 
			+ " \nmax Atk: " + max
			+ " \nmin Atk: " + min
			+ " \ntarget: " + target);
		} else {
			System.out.println("Nothing to show");
		}
		
	}
	
	public static void Main(String[] args){
		chanceItHits(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2);
	}
}
