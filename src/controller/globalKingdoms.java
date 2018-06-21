package controller;

public class globalKingdoms {
	public static kingdom globalKingdom1 = new kingdom("elves", "GlobalKingdom1", 
			new Resources(50,50), 
			new Unit("elves", 3, 50, new UnitStat(100,123,10,5, 3, 6, 80)), 
			new Level(3,3,3), 6, 
			new Experience(2,3));
	
	public static kingdom globalKingdom2 = new kingdom("elves", "GlobalKingdom2", 
			new Resources(50,50), 
			new Unit("elves", 3, 50, new UnitStat(115,75,10,5, 3, 6, 78)), 
			new Level(3,3,3), 6, 
			new Experience(2,3));
	
	public static kingdom globalKingdom3 = new kingdom("elves", "GlobalKingdom3", 
			new Resources(50,50), 
			new Unit("elves", 3, 50, new UnitStat(3,5,10,5, 3, 6, 10)), 
			new Level(3,3,3), 6, 
			new Experience(2,3));
}
