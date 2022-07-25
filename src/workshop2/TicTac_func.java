package workshop2;

import java.util.Scanner;

public class TicTac_func {
	/**
	 * Creating NXN array to simulate the board
	 */
	char[][] board = new char[3][3];
	public char ch, p1, p2;
	public static Scanner sc = new Scanner(System.in);
	/**
	 * Function to initialize the board
	 */
	public void initialize_board() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]=' ';
			}
		}
	}
	/**
	 * Function to display the board
	 */
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(board[i][j]+ " ");
			}
			System.out.println("");
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
