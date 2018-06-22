package controller;

public class Resources {
	public int resourcesGold;
	public int resourcesFood;
	public static void main(String[] args){
		System.out.println("Class that helps store gold and food objects");
		Resources testResources = new Resources(100, 10);
		System.out.println("Store gold and food objects\n"
				+ "Food: " + testResources.resourcesFood
				+ "\nGold: " + testResources.resourcesGold);
	}
	Resources(int gold, int food){
		this.resourcesGold = gold;
		this.resourcesFood = food;
	}
	
	public static int getGold(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesGold;
	}
	
	public static void setGold(kingdom kingdom1, int gold){
		kingdom1.kingdomResources.resourcesGold = gold;
	}
	
	
	public static int getFood(kingdom kingdom1){
		return kingdom1.kingdomResources.resourcesFood;
	}
	
	public static void setFood(kingdom kingdom1, int food){
		kingdom1.kingdomResources.resourcesFood = food;
	}
	
}
