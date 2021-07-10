public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		return cellId%8;	// required logic
	}
	
	private int getRow(int cellId) {
		return cellId/8;	// required logic
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		//Required logic below
		//First checking for that particular row and column
		for(int i=0;i<8;i++) {
			if(placedQueens[row][i]==true || placedQueens[i][col]==true) {
				isValid=false;
				return isValid;
			}
		}
		
		//Now checking for diagonals
		for(int i=row,j=col;i<8 && j<8; i++,j++) {
			if(placedQueens[i][j]==true) {
				isValid=false;
				return isValid;
			}
		}
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(placedQueens[i][j]==true) {
				isValid=false;
				return isValid;
			}
		}
		for(int i=row,j=col;i>=0 && j<8;i--,j++) {
			if(placedQueens[i][j]==true) {
				isValid=false;
				return isValid;
			}
		}
		for(int i=row,j=col;i<8 && j>=0;i++,j--) {
			if(placedQueens[i][j]==true) {
				isValid=false;
				return isValid;
			}
		}
		
		//update placedQueens and numQueens if all loops passed.
		placedQueens[row][col]=true;
		numQueens++;
		return isValid;
	}
}














