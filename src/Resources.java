
public class Resources {
	int resourcesGold;
	int resourcesFood;
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
	
}
