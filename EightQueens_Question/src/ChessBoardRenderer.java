public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int size=8;
		if((square/size + square%size)%2==0)  return false;
		else return true;
	}
}
