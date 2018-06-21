package controller;

public class Attributes {

	public static void main(String[] args){
		// Each race has numbers and what theyre better at
		// first we'll begin with units(elven bowmen)
		//
	}
	
	//Attributes(int gold, int food, )
	
	static void startingRaceAttributes(){
		
	}

	public static Resources startingRaceResources(String raceType) {
		if(raceType == "elves"){
			Resources elvesResources = new Resources(100, 50);
			return elvesResources;
		} 
		if(raceType == "dwarves"){
			Resources dwarvesResources = new Resources(100, 50);
			return dwarvesResources;
		} 
		if(raceType == "humans"){
			Resources humansResources = new Resources(100, 50);
			return humansResources;
		} 
		if(raceType == "orcs"){
			Resources orcsResources = new Resources(100, 50);
			return orcsResources;
		} else { 
			System.out.println("No race entered!");
		}
		return null;
		
	}
}
