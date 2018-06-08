import java.util.Scanner;

public class entry {
	public static void main(String[] args){
		System.out.println("Can only choose elves.\n");
		String raceType = Choice.chooseRace();
		String kingdomName = enterName();
		int gold = 100;
		int food = 50;
		int workers = 1;
		Level level = new Level(1, 1, 1);
		Unit unit = new Unit(raceType, level.newUnitLevel, 1);
		kingdom kingdom1 = new kingdom(raceType, kingdomName, gold, food, unit, level, workers);
		Display.displayKingdomStats(kingdom1);
		Choice.battleOrCreateChoice(kingdom1);
	}

	public static String enterName(){
		System.out.println("Enter kingdom name");
		String inputName = "Very lit kingdom ";
		System.out.println("You entered: " + inputName + "\n");
		return inputName;
		/*
		 * if(inputName != null){
			return inputName;
		} else {
			return "Some name"; // its dead but it wont be after i learn how to input things
		}
		*/
	}
	
}
