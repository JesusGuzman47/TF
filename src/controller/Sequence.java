package controller;

public class Sequence {
	public static void main(String[] args){
		System.out.println("All methods will be called sequentially from here.");
		System.out.println("Can only choose elves.\n");
		String raceType = "elves";//Choice.chooseRace();
		String kingdomName = "litKingdom";//kingdomEntry.enterName();
		kingdom kingdom1 = KingdomAction.CreateKingdom(raceType, kingdomName);
		//Display.displayKingdomStats(kingdom1);
		kingdom opponentKingdom = KingdomAction.createOpponent();
		repeatSequence(kingdom1, opponentKingdom);
	}
	
	
	/* 
	 * battle or create, check if you have units,
	 * find opponent, battle opponent
	*/
	public static void repeatSequence(kingdom kingdom1, kingdom opponentKingdom){
		//recursive until it breaks by user input
		// opponent kingdom should not be in here
		if(Choice.battleOrCreate(kingdom1)){ // 1
			if(KingdomAction.checkUnitAndFind(kingdom1)){ // 2
				Unit.createUnit(kingdom1);
				repeatSequence(kingdom1, opponentKingdom);
			} else {
				System.out.println("===>Did not check unit and find.");
				if(Find.findOpponent(kingdom1)){ //3
					if(Battle.battleOpponent(kingdom1)){// 4
						if(Battle.unitBattle(kingdom1, opponentKingdom)){ // 5
							// if kingdom1 wins
							if(Gain.gains()){ // 6
								if(Gain.gainExperience(kingdom1, opponentKingdom) && Gain.gainGold(kingdom1) && Gain.gainFood(kingdom1)){ // 7
										if(Gain.gainLevel(kingdom1)){ //checks if gained level after experience calculator
											System.out.println("==>Gained a level.");
											repeatSequence(kingdom1, opponentKingdom);
										} else {
											System.out.println("==>Did not gain level.");
											repeatSequence(kingdom1, opponentKingdom);
										}
								} else {
									System.out.println("==>Did not gain?");
								}
							} else {
								System.out.println("==>Did not gain.");
							}
						} else {
							System.out.println("===>Did not win battle.");
							System.out.println("===>Did not gain.");
							repeatSequence(kingdom1, opponentKingdom);//repeats process
						}
					} else {
						System.out.println("===>Did not battle.");
					}
				} else {	
					System.out.println("===>Did not find battle.");
				}
			}
		} else {
			System.out.println("===>Did not choose battle or create.");
			if(KingdomAction.create(kingdom1)){ // n
				Unit.createUnit(kingdom1);
				//Worker.createWorker();
			} else {
				System.out.println("===>did not create unit.");
			}
		}
	}
}
