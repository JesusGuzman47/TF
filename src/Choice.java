import java.util.Scanner;

public class Choice {
	public static void main(){
		System.out.println("Here is where choices are made!");
	}

	public static void battleOrCreateChoice(kingdom kingdom1){
		String input = engine.randomChoice(); //randomize choice
		System.out.println("Inside battleOrCreate choice our value is --> " + input);
		if(input == "1"){
			Action.battle(kingdom1);
		} else {
			Action.create(kingdom1);
			System.out.println("inside battleOrCreate choice!! not a valid entry!");
		}
	}
	
	public static String chooseRace(){
		Display.displayEnterRace();
		Scanner in = new Scanner(System.in);
		int inputNum = in.nextInt();
		in.close();
		System.out.println("input number: " + inputNum);
		
		if(inputNum == 1){
			System.out.println("you chose elves! \n");
			return "elves";
		}
		if(inputNum == 2){
			System.out.println("you chose dwarves!");
			return "dwarves";
		}
		if(inputNum == 3){
			System.out.println("you chose humans!");
			return "humans";
		}
		if(inputNum == 4){
			System.out.println("you chose orcs!");
			return "orcs";
		} else {
			System.out.println("Sorry we dont recognize that race");
		}
		return null;
	}
	
}
