package controller;

import java.util.ArrayList;

public class Battle extends KingdomAction{

	private static ArrayList<Integer> hp = new ArrayList<Integer>(2);
	
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
		System.out.println("opponent unit amount: " + Unit.getUnit(opponentKingdom));
		System.out.println("kingdom unit amount: " + Unit.getUnit(kingdom1));
		
		if(Unit.getUnit(kingdom1) == 0){ // an army lost all units	
			System.out.println("Kingdom has lost all units");
			battleDone(kingdom1);
			return true; // battle done
		} else if(Unit.getUnit(opponentKingdom) == 0){ // an army lost all units
			System.out.println("Opponent has lost all units");
			battleDone(opponentKingdom);
			return true; //battle done
		} else {
			microBattle(kingdom1, opponentKingdom);
		}
		return true;
	}
	
	public static void battleDone(kingdom kingdom1){
		System.out.println("kingdom "+ kingdom1.getKingdomName()+" is victorious");
	}
	

	public static void microBattle(kingdom kingdom1, kingdom opponentKingdom){			
			//declaring ArrayList with initial size n
	        System.out.println("Both players hitpoints: " + hp);       
			System.out.println("hp1: " + UnitStat.getHealthPointStats(kingdom1));
			System.out.println("hp2: " + UnitStat.getHealthPointStats(opponentKingdom));
			
			int oppDMG = UnitAction.attack(opponentKingdom, kingdom1);
			int kinDMG = UnitAction.attack(kingdom1, opponentKingdom);
			if(kinDMG <= 0){
				System.out.println(opponentKingdom.getKingdomName() + " does zero damage " + oppDMG);
				unitBattle(kingdom1, opponentKingdom);
			} else if(oppDMG <= 0){
				System.out.println(kingdom1.getKingdomName() + " does zero damage " + kinDMG);
				unitBattle(kingdom1, opponentKingdom);
			} else {
				UnitStat.setHealthPointStats(kingdom1, (UnitStat.getHealthPointStats(kingdom1) - kinDMG)); // attacking kingdom
				UnitStat.setHealthPointStats(opponentKingdom, (UnitStat.getHealthPointStats(opponentKingdom) - oppDMG)); // attacking opponent
				
				System.out.println("new hp1 for 1 unit: " + UnitStat.getHealthPointStats(kingdom1));
				System.out.println("new hp2 for 1 unit: " + UnitStat.getHealthPointStats(opponentKingdom));
				
				if(UnitStat.getHealthPointStats(kingdom1) <= 0){
					Unit.setUnit(kingdom1, ((Unit.getUnit(kingdom1)) - 1)); // subtract 1 unit
					UnitStat.setHealthPointStats(kingdom1, hp.get(0)); // reset healthpoints because new unit comes out
					unitBattle(kingdom1, opponentKingdom); // go into 
				}else if(UnitStat.getHealthPointStats(opponentKingdom) <= 0){ // subtract 1 unit
					Unit.setUnit(opponentKingdom, ((Unit.getUnit(opponentKingdom)) - 1));
					UnitStat.setHealthPointStats(opponentKingdom, hp.get(1));
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
		
		hp.add(UnitStat.getHealthPointStats(globalKingdoms.globalKingdom2));
        hp.add(UnitStat.getHealthPointStats(globalKingdoms.globalKingdom2));
      
        System.out.println("gk1 saved hp: " + hp.get(0));       
        System.out.println("gk2 saved hp: " + hp.get(1));       
        
		microBattle(globalKingdoms.globalKingdom1, globalKingdoms.globalKingdom2);
	}
	
}
