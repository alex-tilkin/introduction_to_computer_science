package year_2020.semester_b.period_a.solution.question_2;

public class Question2b {

	public static void main(String[] args) {
		char[][] chessBoard = {	{'Q', '-', '-', '-', '-', '-', '-', '-'},
								{'-', '-', '-', '-', 'Q', '-', '-', '-'},
								{'-', '-', '-', '-', '-', '-', '-', 'Q'},
								{'-', '-', 'Q', '-', '-', '-', '-', '-'},
								{'-', '-', '-', '-', '-', 'Q', '-', '-'},
								{'-', '-', '-', '-', '-', '-', 'Q', '-'},
								{'-', 'Q', '-', '-', '-', '-', '-', '-'},
								{'-', '-', '-', 'Q', '-', '-', '-', '-'}};

		System.out.println(isNQueen(chessBoard, 0, 0));

	}
	
	public static boolean isNQueen(char[][] chessBoard, int vertexRow, int vertexColumn) {
		if(vertexColumn == chessBoard.length || vertexRow == chessBoard.length) {
			return true;
		}
		
		int rowCounter = 0;
		int columnCounter = 0;
		int diagonalCounter = 0;
		
		for (int index = 0; vertexRow + index < chessBoard.length && vertexColumn + index < chessBoard.length; index++) {
			if(chessBoard[vertexRow][vertexColumn + index] == 'Q') {
				columnCounter++;
			}
			
			if(chessBoard[vertexRow + index][vertexColumn] == 'Q') {
				rowCounter++;
			}

			if(columnCounter == 2 || rowCounter == 2 || diagonalCounter == 2) {
				return false;
			}
		}
		
		return 	isNQueen(chessBoard, vertexRow + 1, vertexColumn) && 
				isNQueen(chessBoard, vertexRow, vertexColumn + 1);
	}

}
