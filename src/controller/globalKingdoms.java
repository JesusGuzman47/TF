package controller;

public class globalKingdoms {
	public static kingdom globalKingdom1 = new kingdom("elves", "GlobalKingdom1", 
			new Resources(50,50), 
			// GetMaxAttack - getMinAttack dex can only be within this range
			new Unit("elves", 3, 9, new UnitStat(30, 30, 10, 5, 3, 1, 1, 30, 30)), 
			new Level(3,3,3), 6, 
			new Experience(6,5));
	
	public static kingdom globalKingdom2 = new kingdom("elves", "GlobalKingdom2", 
			new Resources(50,50), 
			new Unit("elves", 3, 9, new UnitStat(30, 30, 10, 5, 3, 1, 1, 30, 30)), 
			new Level(3,3,3), 6, 
			new Experience(2,3));
	
	public static kingdom globalKingdom3 = new kingdom("elves", "GlobalKingdom3", 
			new Resources(50,50), 
			new Unit("elves", 3, 9, new UnitStat(3,5,10,5, 3, 6, 5, 10, 10)), 
			new Level(3,3,3), 6, 
			new Experience(2,3));
}
