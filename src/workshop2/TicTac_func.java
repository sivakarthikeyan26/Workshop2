
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
	public char  p1, p2;
	public int ch;
	public int pos;
	public int count=0;
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
		System.out.println("Choose your symbol for the Game :\n1.X\n2.O");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			p1=(char)'X';
			p2=(char)'O';
			System.out.println("player 1 = "+p1);
			System.out.println("player 2 = "+p2);
			break;
		case 2:
			p1=(char)'O';
			p2=(char)'X';
			System.out.println("player 1 = "+p1);
			System.out.println("player 2 = "+p2);
			break;
		}
	}
	/**
	 * Methood to check the all possible ways for win
	 * @param board
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	public boolean check(char[][] board,int x,int y,char p) {
		if(up(board,x,y,p) || down(board,x,y,p) || left(board,x,y,p) || right(board,x,y,p) || ne(board,x,y,p) || nw(board,x,y,p) || se(board,x,y,p) || sw(board,x,y,p) ) {
			return true;
		}
		return false;
	}
	/**
	 * Method to check the south west direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean sw(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x++;
					y--;
				}
				else {
					x++;
					y--;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
	}
	/**
	 * Method to check the south east direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean se(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x++;
					y++;
				}
				else {
					x++;
					y++;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the north west direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean nw(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x--;
					y--;
				}
				else {
					x--;
					y--;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the north east direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean ne(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x--;
					y++;
				}
				else {
					x--;
					y++;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the right side direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean right(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					y++;
				}
				else {
					y++;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the left direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean left(char[][] board2, int x, int y,char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					y--;
				}
				else {
					y--;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the down direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean down(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x++;
				}
				else {
					x++;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Method to check the upside direction
	 * @param board2
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	private boolean up(char[][] board2, int x, int y, char p) {
		try {
			while(true) {
				if(board[x][y]==p) {
					count+=1;
					x--;
				}
				else {
					x--;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			if(count==3) {
				System.out.println("in count");
				count=0;
				return true;
			}
		}
		count=0;
		return false;
		
	}
	/**
	 * Function to let the two players play the game.
	 */
	public void play() {
		for(int i=1; i<=9;i++) {
			if(i%2!=0) {
				System.out.println("Player1 enter the position:");
				pos=sc.nextInt();
				switch(pos) {
				case 1:
					board[0][0]=p1;
					display();
					if(check(board,0,0,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					
					break;
				case 2:
					board[0][2]=p1;
					display();
					if(check(board,0,2,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					break;
				case 3:
					board[0][4]=p1;
					display();
					boolean t= check(board,0,4,p1);
					if(t) {
						System.out.println("player 1 wins");
						return;
					}
					break;
				case 4:
					board[2][0]=p1;
					display();
					if(check(board,2,0,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					check(board,2,0,p1);
					break;
				case 5:
					board[2][2]=p1;
					display();
					if(check(board,2,2,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					break;
				case 6:
					board[2][4]=p1;
					display();
					if(check(board,2,4,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					
					break;
				case 7:
					board[4][0]=p1;
					display();
					if(check(board,4,0,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					
					break;
				case 8:
					board[4][2]=p1;
					display();
					if(check(board,4,2,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					
					break;
				case 9:
					board[4][4]=p1;
					display();
					if(check(board,4,4,p1)) {
						System.out.println("player 1 wins");
						return;
					}
					
					break;
				}
			}
			else {
				System.out.println("Player2 enter the position:");
				pos=sc.nextInt();
				switch(pos) {
				case 1:
					board[0][0]=p2;
					display();
					if(check(board,0,0,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					check(board,0,0,p2);
					break;
				case 2:
					board[0][2]=p2;
					display();
					if(check(board,0,2,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					
					break;
				case 3:
					board[0][4]=p2;
					display();
					if(check(board,0,4,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					
					break;
				case 4:
					board[2][0]=p2;
					display();
					if(check(board,2,0,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					
					break;
				case 5:
					board[2][2]=p2;
					display();
					if(check(board,2,2,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					break;
				case 6:
					board[2][4]=p2;
					display();
					if(check(board,2,4,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					break;
				case 7:
					board[4][0]=p2;
					display();
					if(check(board,4,0,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					break;
				case 8:
					board[4][2]=p2;
					display();
					if(check(board,4,2,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					break;
				case 9:
					board[4][4]=p2;
					display();
					if(check(board,4,4,p2)) {
						System.out.println("player 2 wins");
						return;
					}
					
					break;
				}
			}
		}
		System.out.println("Draw match");
	}
}
