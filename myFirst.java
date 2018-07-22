/**
 * @(#)myFirst.java
 *
 * myFirst application
 *
 * @author 
 * @version 1.00 2018/7/22
 */
 import java.util.Scanner;
public class myFirst {
  
   public static void main(String[] args) {
   		int answer=0;
		moUserInput mValidator = new moUserInput();
		int ssn = mValidator.askInputInt("Please type number: ");
		System.out.println("Accepted Results:");
		String s = String.valueOf(ssn);
		for(int x=0;x< s.length(); x++ ){
			char  a = s.charAt(x);
			answer = answer+ Integer.parseInt(String.valueOf(a));
		}
		System.out.println(answer);
	}
	public static  class moUserInput {
	private static Scanner keyboard = new Scanner(System.in);
 
	public int askInputInt(String informationText) {
		Boolean error = false;
		String userInp = "";
		do {
			System.out.print(informationText);
			userInp = keyboard.nextLine();
			if (!this.isType(userInp, "int")) {
				error = true;
				System.err.println("Error: must be a whole number.");
			} else {
				error = false;
			}
		} while (error == true);
		return Integer.parseInt(userInp);
	}
 

	public Boolean isType(String testStr, String type) {
		try {
			 if (type.equalsIgnoreCase("int")) {
				Integer.parseInt(testStr);
			}
			return true;
		} catch(Exception e) {
			return false;
		}
 
	}
 }

}

    

