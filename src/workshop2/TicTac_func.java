package workshop2;

import java.util.Scanner;

public class TicTac_func {
	/**
	 * Creating NXN array to simulate the board
	 */
	char[][] board = {{' ', '|', ' ', '|', ' '},
						{'-', '|', '-', '|', '-'},
						{' ', '|', ' ', '|', ' '},
						{'-', '|', '-', '|', '-'},
						{' ', '|', ' ', '|', ' '}};
	public char ch, p1, p2;
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Function to display the board
	 */
	public void display() {
		for(char[] row : board) {
			for(char t : row) {
				System.out.print(t);
			}
			System.out.println();
		}
	}
	/**
	 * Fuction to let players to choose the symbol
	 */
	public void choose() {
		System.out.println("Choose your symbol for the Game :\n 1.X\n2.O");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 1:
			p1='X';
			p2='O';
			break;
		case 2:
			p1='O';
			p2='X';
			break;
		}
	}
}
