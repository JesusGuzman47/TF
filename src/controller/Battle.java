package controller;

public class Battle extends KingdomAction{
	
	public static boolean battleOpponent(kingdom kingdom1) {
		System.out.println("--->Inside KingdomAction.battleOpponent()!");
		//kingdom opponentKingdom = KingdomAction.createOpponent(); //create opponent inside battle opponent? or should be created sooner?
		return true;
	}
	
	
	
	/*
	 * Will be calculated so not all units are lost 
	 * but instead falls under a certain percentage
	 * For now an army will reach 0
	 */	
	public static boolean unitBattle(kingdom kingdom1, kingdom opponentKingdom){
		System.out.println(opponentKingdom.getKingdomName() + " unit amount: " + Unit.getUnit(opponentKingdom));
		System.out.println(kingdom1.getKingdomName() + " unit amount: " + Unit.getUnit(kingdom1));
		
		if(Unit.getUnit(kingdom1) == 0){ // an army lost all units	
			return true;//battleDone(kingdom1);// battle done
		} else if(Unit.getUnit(opponentKingdom) == 0){ // an army lost all units
			return true;//battleDone(opponentKingdom); //battle done
		} else {
			microBattle(kingdom1, opponentKingdom);
			return true;
		}
	}
	
	public static boolean battleDone(kingdom kingdom1){
		System.out.println(kingdom1.getKingdomName() + "Kingdom has lost all units");
		System.out.println("kingdom "+ kingdom1.getKingdomName()+" is defeated");
		return true;
	}
	

	public static void microBattle(kingdom kingdom1, kingdom opponentKingdom){			
			int kinDMG = UnitAction.attack(kingdom1, opponentKingdom);
			int oppDMG = UnitAction.attack(opponentKingdom, kingdom1);
			
			if(kinDMG <= 0){
				System.out.println(kingdom1.getKingdomName() + " does zero damage " + kinDMG);
				unitBattle(kingdom1, opponentKingdom);
			} else if(oppDMG <= 0){
				System.out.println(opponentKingdom.getKingdomName() + " does zero damage " + oppDMG);
				unitBattle(kingdom1, opponentKingdom);
			} else {
				int newHP = UnitStat.getHealthPointStats(kingdom1) - kinDMG;
				System.out.println(kingdom1.getKingdomName() + " current unit HP: (" + UnitStat.getHealthPointStats(kingdom1) + " - " + kinDMG + ") / " + UnitStat.getTotalHealthPointStats(kingdom1) );
				UnitStat.setHealthPointStats(kingdom1, (newHP)); 
				
				int newHP2 = UnitStat.getHealthPointStats(kingdom1) - kinDMG;
				System.out.println(opponentKingdom.getKingdomName() + " current unit HP: (" + UnitStat.getHealthPointStats(opponentKingdom) + " - " + oppDMG + ") / " + UnitStat.getTotalHealthPointStats(opponentKingdom));
				UnitStat.setHealthPointStats(opponentKingdom, newHP2); 
				
				if(UnitStat.getHealthPointStats(kingdom1) <= 0){
					Unit.setUnit(kingdom1, ((Unit.getUnit(kingdom1)) - 1)); // subtract 1 unit
					System.out.println(kingdom1.getKingdomName() + " -> Unit Replaced. ");
					UnitStat.setHealthPointStats(kingdom1, UnitStat.getTotalHealthPointStats(kingdom1)); // reset healthpoints because new unit comes out
					unitBattle(kingdom1, opponentKingdom); // go into 
				}else if(UnitStat.getHealthPointStats(opponentKingdom) <= 0){ 
					Unit.setUnit(opponentKingdom, ((Unit.getUnit(opponentKingdom)) - 1)); // subtract 1 unit
					System.out.println(opponentKingdom.getKingdomName() + " -> Unit Replaced.");
					UnitStat.setHealthPointStats(opponentKingdom, UnitStat.getTotalHealthPointStats(opponentKingdom));
					unitBattle(kingdom1, opponentKingdom); // go into
				} else {
					unitBattle(kingdom1, opponentKingdom); // go into
				}
			}
	}
	
	
	
	public static void main(String[] args){
		//This is where unit go to battleSystem.out.println("kingdom unit Damage: " + UnitAction.attack(opponentKingdom, kingdom1));
		//System.out.println("opponent unit Damage: " + UnitAction.attack(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2));
		//System.out.println("kingdom unit Damage: " + UnitAction.attack(globalKingdoms.globalKingdom2, globalKingdoms.globalKingdom1));
		
		//unitBattle(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2);
	}
	
}
