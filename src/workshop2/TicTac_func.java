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
	public int pos;
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
	 * Fuction to let players to choose the symbol and let them play.
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
	public void play() {
		for(int i=1; i<=9;i++) {
			if(i%2!=0) {
				System.out.println("Player1 enter the position:");
				pos=sc.nextInt();
				switch(pos) {
				case 1:
					board[0][0]='X';
					display();
					break;
				case 2:
					board[0][2]='X';
					display();
					break;
				case 3:
					board[0][4]='X';
					display();
					break;
				case 4:
					board[2][0]='X';
					display();
					break;
				case 5:
					board[2][2]='X';
					display();
					break;
				case 6:
					board[2][4]='X';
					display();
					break;
				case 7:
					board[4][0]='X';
					display();
					break;
				case 8:
					board[4][2]='X';
					display();
					break;
				case 9:
					board[4][4]='X';
					display();
					break;
				}
			}
			else {
				System.out.println("Player2 enter the position:");
				pos=sc.nextInt();
				switch(pos) {
				case 1:
					board[0][0]='O';
					display();
					break;
				case 2:
					board[0][2]='O';
					display();
					break;
				case 3:
					board[0][4]='O';
					display();
					break;
				case 4:
					board[2][0]='O';
					display();
					break;
				case 5:
					board[2][2]='O';
					display();
					break;
				case 6:
					board[2][4]='O';
					display();
					break;
				case 7:
					board[4][0]='O';
					display();
					break;
				case 8:
					board[4][2]='O';
					display();
					break;
				case 9:
					board[4][4]='O';
					display();
					break;
				}
			}
		}
		display();
	}
}
