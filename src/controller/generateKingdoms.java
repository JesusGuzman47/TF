package controller;

public class generateKingdoms {
	
		public static kingdom generateKingdom(kingdom kingdom1){
		kingdom generatedKingdom = 
				new kingdom("Elves","generatedKingdom", new Resources(Resources.getGold(kingdom1), Resources.getFood(kingdom1)),
				new Unit("Elves", (Level.getUnitLevel(kingdom1) - 1), (Unit.getUnit(kingdom1)/2), 
						new UnitStat(
								UnitStat.getAttackStats(kingdom1) - 5,
								UnitStat.getDefenseStats(kingdom1) - 5,
								UnitStat.getChanceStats(kingdom1),
								UnitStat.getRangeStats(kingdom1),
								UnitStat.getSpeedStats(kingdom1),
								UnitStat.getFocusStats(kingdom1),
								UnitStat.getDexterityStats(kingdom1),
								UnitStat.getHealthPointStats(kingdom1) - 5,
								UnitStat.getTotalHealthPointStats(kingdom1) - 5)),
				new Level(2,2,2), 
				6,
				new Experience(Experience.getCurrentKingdomExperience(kingdom1), Experience.getMaxKingdomExperience(kingdom1)));
		return generatedKingdom;
		}
}
