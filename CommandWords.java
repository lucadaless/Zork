package com.bayviewglen.isp;
/*

 * Author:  Michael Kolling.
 * Version: 1.0
 * Date:    July 1999
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in, all avaliable commands are listed
 *

 * This class is part of the "Zork" game.

 */

class CommandWords {

	// a constant array that holds all valid command words

	private static final String validCommands[] = { "go", "quit", "help", "pickup", "take", "drop", "inventory", "i", "open", "close", "examine", "drink", "throw", "show", "insert", "read", "look", "climb", "enter", "type", "give", "unlock", "say","r", "toss", };
	/**
	 * Constructor - initialise the 23 command words.
	 */
	public CommandWords() {
	}
	/**
	 * Check whether a given String is a valid command word. Return true if it
	 * is, false if it isn't.
	 **/

	public boolean isCommand(String aString) {
		for (int i = 0; i < validCommands.length; i++) {
			if (validCommands[i].equals(aString))
				return true;
		}
		// if we get here, the string was not found in the commands
		return false;
	}
	/*
	//  Print all valid commands to System.out.
	 */
	public void showAll() {
		for (int i = 0; i < validCommands.length; i++) {
			System.out.print(validCommands[i] + "  ");
		}
		System.out.println();
	}
}
