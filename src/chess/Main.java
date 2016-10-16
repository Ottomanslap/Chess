package chess;

import java.io.*;
import java.util.Scanner;

class Main {

	public static Mode mode = null;
	// Trying out ENUM & track if normal game or puzzle.

	public static boolean winCondition;
	//So that we know when to stop playing

	private static Scanner input = new Scanner( System.in );
	//To receive inputs from user

	public static Square[][] table = new Square[8][8];
	//Creates a 2D array of squares, the size of 8*8 for the chess board

	public static Piece[][] tableConf = new Piece[8][8];
	//To set up a predetermined piece configuration

	public static void main(String[] args) throws IOException {

		//Checking to see whether Symbols or Letters should be used for printing.
		System.out.print("Can your setup handle symbols? (y/n/idk):");

		String answer = readInput().toLowerCase();
		
		//Print empty line.
		System.out.println();

		while (!answer.equals("y")  && !answer.equals("n")){

			System.out.print("Can you see two different characters here? ♙♟ (y/n):");
			answer = readInput().toLowerCase();

		}
		
		//Print empty line.
		System.out.println();

		String SLDefault = null;

		if (answer.equals("y")){
			SLDefault = "S";
		}
		else if (answer.equals("n")){
			SLDefault = "L";
		}
		//Done Checking and configuring to match.

		//Menu start
		System.out.println("New Game  - N" + "	NOT IMPLEMENTED YET!");
		System.out.println("Load Game - L" + "	NOT IMPLEMENTED YET!");
		System.out.println("Puzzles   - P" + "	NOT IMPLEMENTED YET!");
		System.out.println("Quit      - Q");
		System.out.print("Enter choice: ");

		String choice = readInput().toUpperCase();
		
		//Print empty line.
		System.out.println();

		while (mode == null){
			switch (choice){
			case "N":
				init("0");
				mode = Mode.CHESS;
				break;
			case "L":
				//TODO: Loading
				System.out.println("Loading is not done yet! Come back later.\n");
				System.out.print("Enter choice: ");
				choice = readInput().toUpperCase();
				System.out.println();
				break;
			case "P":
				//TODO: Make some puzzles to be able to load them.
				System.out.println("Puzzles are not done yet! Come back later.");
				System.out.print("Enter choice: ");
				choice = readInput().toUpperCase();
				System.out.println();
				break;
			case "Q":
				return;
				
			default:
				System.out.print("Could not understand, try again: ");
				choice = readInput().toUpperCase();
				System.out.println();
				break;
			}

		}

		//Menu end

		printTable(SLDefault);
		//winCondition = false;

		//while (!winCondition){//This is where the game will take place
		//	System.out.println("Which piece will move?");
		//}

	}
	final static void init(String board) throws IOException{
		/*
		 * Sets up the predetermined piece positions
		 * Sets up the chess board
		 * puts the pieces on the squares
		 * 
		 * 
		 */

		FileReader layout = loadMap(board);

		for (int r = 0 ; r < table.length ; r++){
			for (int c = 0 ; c < table[r].length ; c++){

				//create the squares in the table
				table[r][c] = new Square();

				//put pieces on the square
				int symb = layout.read();

				while (symb == -1 || !Piece.isValid((char) symb))
					symb = layout.read();

				if ((char)symb != 'x'){
					table[r][c].piece = new Piece((char) symb);
					//System.out.println((char)symb);
				}
				else{
					table[r][c].piece = null;
					//System.out.println((char)symb);
				}
				//give the squares their colors
				if (((r%2==0)&&(c%2!=0))||((c%2==0)&&(r%2!=0))){
					table[r][c].isBlack = false;
				}else{
					table[r][c].isBlack = true;
				}
				//colors assigned

			}
		}
		System.out.println("Initial positions loaded.\n");
		layout.close();
	}
	final static void printTable(String SL){
		if (SL != "S" && SL != "L")
			throw new Error("ERROR: printTable recieved incorrect input for Symbol/Letter:" + SL );
		for (int r = table.length - 1 ; r >= 0 ; r--){
			for (int c = 0 ; c < table.length ; c++){
				System.out.print(table[r][c].toString(SL));
			}
			System.out.println();
		}
	}
	final static FileReader loadMap(String file) throws IOException{

		file = System.getProperty("java.class.path") + "//..//layouts//" + file;
		File toBeLoaded = new File(file);
		FileReader reader = new FileReader(toBeLoaded);
		return reader;

	}


	final static String readInput(){
		return input.nextLine();
	}
}