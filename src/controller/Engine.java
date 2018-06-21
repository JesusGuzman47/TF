package controller;
import java.util.Random;
import java.lang.Math;

public class Engine {
	public static void main(String[] args){
		// explore (explorationLevel)
		// increase chances of finding opponent by building workers
	
		//level + 1
		//test calculateChance
		calculateChanceTest();
	}
	
	public static void calculateChanceTest(){
		int functionCalledCount = 0;
		for(int i = 0; i<=545; i++){
			functionCalledCount++;
			if((calculateChance(i + 1, i + 1) < 33.0) || (calculateChance(i + 1, i + 1) > 25.0)){
				System.out.println("amount of times function is called" + functionCalledCount);
			} else {
				calculateChance(i + 10, i + 5); 
			}
		}
	}
	
	// highest chance you can get is 33%
	public static int getChance(kingdom kingdom1){
		System.out.println("kingdom level: " + Level.getKingdomLevel(kingdom1));
		int currentChances = 0;
		calculateChance(Level.getKingdomLevel(kingdom1), Level.getExplorationLevel(kingdom1));
		
		return currentChances;
	}
	
	public static int calculateChance(int level, int explorationLevel){
		int max = 33;
		double exactLevel = (int)level;
		double exactExplorationLevel = (int)explorationLevel;
		double chance = exactLevel + exactExplorationLevel; // 1 + 1
		chance = Math.sqrt(chance);	// sqrt version	
		if(chance <= max){
			System.out.println("Chances are: " + chance);
			return (int)chance;
		} else {
			System.out.println("You have reached that limit of chance");
			return (int)chance;
		}
	}

	public static void chances(kingdom kingdom1){
		// higher the level the better the chances
		Random objGenerator = new Random();
		int number = 0;
		System.out.println("kingdom level: " + Level.getKingdomLevel(kingdom1));
		for(int i = 0; i < number; i++){
			int randomNumber = objGenerator.nextInt(100);
			if(randomNumber < 33){ // 33 will be a variable
				
			}
		}
	}

	public static String randomChoice() { //fifty fifty chance is all..
		String choice1 = "1";
		String choice2 = "2";
		Random objGenerator = new Random();
		int randomNumber = objGenerator.nextInt(100);
		System.out.println("The random number must be less than 89(0 - 90) for choice to be 1: " + randomNumber + "\n");
		if(randomNumber < 90) {
			System.out.println("Choice came out to be ----> " + choice1 + "\n");
			return choice1;
		} else {
			System.out.println("Choice came out to be ----> " + choice2 + "\n");
			return choice2;
		}
	}
	
	// 33% luck 66% skill
	public static int randomlyCreateUnitAmount(kingdom kingdom1){ // not rando yet
		int unit = 0;
		System.out.println("--->Inside Engine.randomlyCreateUnitAmount()!");
		if((2 < Resources.getGold(kingdom1)) && (1 < Resources.getFood(kingdom1))){
			 unit = (Resources.getGold(kingdom1)/2);// 100/2 = 50				 
		} else {
			System.out.println("\nKingdom does not have enough + Resources + to create units.\n");
		}
		return unit;
	}
	

}
