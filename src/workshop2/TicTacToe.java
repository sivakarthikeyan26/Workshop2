package workshop2;

public class TicTacToe {
	/**
	 * 
	 * @param args
	 * Main function to call the method.
	 */
	public static void main(String[] args) {
		TicTac_func tf = new TicTac_func();
		tf.initialize_board();
		tf.display();
		tf.choose();
	}
}
