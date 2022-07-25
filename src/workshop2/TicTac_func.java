package workshop2;

public class TicTac_func {
	char[][] board = new char[3][3];
	public void initialize_board() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]=' ';
			}
		}
	}
}
