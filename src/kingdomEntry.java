
public class kingdomEntry {
	public static void main(String[] args){
		// opponent created based upon your stats. might win or lose.
	}
	
	public static String enterName(){
		System.out.println("Enter kingdom name");
		String inputName = Input.input();
		System.out.println("You entered: " + inputName + "\n");
		return inputName;
		/*
		 * 
		 * if(inputName != null){
			return inputName;
		} else {
			return "Some name"; // its dead but it wont be after i learn how to input things
		}
		*
		*/
	}
	
}
