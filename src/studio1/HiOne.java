package studio1;

import support.cse131.ArgsProcessor;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		String name = ap.nextString("What is your name?");

		System.out.println("Hi " + name + ". How are you?");

		//

	}

}
