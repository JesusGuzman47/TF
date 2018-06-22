package controller;

public class UnitStat {
	int unitAttack;
	int unitDefense;
	int unitRange;
	int unitChance;
	int unitSpeed;
	int unitDexterity;
	int unitFocus;
	int unitHealthPoints;
	int unitTotalHealthPoints;
	
	
	UnitStat(int Strength, int Defense, int Chance, int Range, int Speed, int Dexterity, int Focus, int healthPoints, int totalHealthPoints){
		this.unitAttack = Strength;
		this.unitDefense = Defense;
		this.unitChance = Chance; 
		this.unitRange = Range; 
		this.unitSpeed = Speed;
		this.unitDexterity = Dexterity;
		this.unitFocus = Focus;
		this.unitHealthPoints = healthPoints;
		this.unitTotalHealthPoints = totalHealthPoints;
	}
	
	public static void displayStats(kingdom kingdom1){
		System.out.println("Attack Stat:" + getAttackStats(kingdom1));
		System.out.println("Defense Stat:" + getDefenseStats(kingdom1));
		System.out.println("Health Point Stat:" + getHealthPointStats(kingdom1));
	}
	
	public static int getAttackStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitAttack; 
	}
	
	public static int getDefenseStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitDefense; 
	}
	
	public static int getChanceStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitChance; 
	}
	
	public static void setChanceStats(kingdom kingdom1, int Chance){
		kingdom1.kingdomUnits.unitStat.unitChance = Chance; // to decrease hp: (gk1hp - (getHP - 1)
	}
	
	public static int getRangeStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitRange; 
	}
	public static int getSpeedStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitSpeed; 
	}
	
	public static int getDexterityStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitDexterity;
	}
	
	public static int getFocusStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitDexterity;
	}
	
	
	public static int getHealthPointStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitHealthPoints;
	}
	
	public static int getTotalHealthPointStats(kingdom kingdom1){
		return kingdom1.kingdomUnits.unitStat.unitTotalHealthPoints;
	}
	
	public static void setHealthPointStats(kingdom kingdom1, int healthPoints){
		kingdom1.kingdomUnits.unitStat.unitHealthPoints = healthPoints; // to decrease hp: (gk1hp - (getHP - 1)
	}
	
	public static int increaseAttackStat(kingdom kingdom1){
		// needs work
		int attackStat = 3 + 2;
		return attackStat; // unit attack stat
	}
	
	public static int increaseDefenseStat(kingdom kingdom1){
		// needs work
		int defenseStat = 3 + 2;
		return defenseStat; // unit attack stat
	}
	
	public static void showAllStats(kingdom kingdom1){
		System.out.println("Stats of " + kingdom1.getKingdomName());
		System.out.println("gk1"
			+ " -- Attack stats: " + getAttackStats(kingdom1));
		System.out.println("gk1 -- defense stats: " + getDefenseStats(kingdom1));
		System.out.println("gk1 -- Chance stats: " + getChanceStats(kingdom1));
		System.out.println("gk1 -- Range stats: " + getRangeStats(kingdom1));
		System.out.println("gk1 -- Health point stats: " + getHealthPointStats(kingdom1));
		System.out.println();
	}
	
	public static void main(String[] args){
		setHealthPointStats(globalKingdoms.globalKingdom1, (getHealthPointStats(globalKingdoms.globalKingdom1) - 1));
		System.out.println("gk1 -- New health point stats: " + getHealthPointStats(globalKingdoms.globalKingdom1));
		
		showAllStats(globalKingdoms.globalKingdom1);
		showAllStats(globalKingdoms.globalKingdom2);
		
		UnitAttackCalculation.chanceItHits(globalKingdoms.globalKingdom1,globalKingdoms.globalKingdom1);
	}
	
}
