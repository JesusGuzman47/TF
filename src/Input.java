import java.util.Scanner;

public class Input {
	public static void main(String[] args){
		System.out.println("Just for an input function");
	}
	
	public static String input(){
		String aString = "";
		Scanner in = new Scanner(System.in);
		aString = in.next();
		
		return aString;
	}
}
