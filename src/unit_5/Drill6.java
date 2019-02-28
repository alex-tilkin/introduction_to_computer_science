package unit_5;



public class Drill6 {

	public static void main(String[] args) {
		final int NUMBER_OF_COLUMNS = 6;
		final int NUMBER_OF_ROWS 	= 5;

		boolean entryFound 	= false;
		boolean exitFound 	= false;
		boolean work 		= true;
		int 	entryIndex 	= -1;
		int 	exitIndex 	= -1;
		int 	row 		= -1;
		int 	column 		= -1;

		char[][] pathMatrix = { { 'a', 'a', 'a', 'a', 'a', '|' },
								{ 'a', 'a', 'a', 'a', 'a', '|' },
								{ 'a', 'a', 'a', '|', '-', '-' },
								{ 'a', 'a', '|', '-', 'a', 'a' },
								{ 'a', 'a', '|', 'a', 'a', 'a' } };

		for(column = 0; column < NUMBER_OF_COLUMNS; column++){
			if(pathMatrix[0][column] == '|'){
				entryFound = true;
				entryIndex = column;
			}
			if(pathMatrix[NUMBER_OF_ROWS - 1][column] == '|'){
				exitFound = true;
				exitIndex = column;
			}
		}

		for(row = 0; row < NUMBER_OF_ROWS; row++){
			for(column = 0; column < NUMBER_OF_COLUMNS; column++){
				System.out.print(pathMatrix[row][column] + " ");
			}
			System.out.print('\n');
		}

		if(entryFound == false || exitFound == false){
			System.out.println("No path has been found in the matrix above");

			return;
		}

		row = 0;
		column = entryIndex;
		do
		{
			if(pathMatrix[row][column] == '|'){
				row++;
			}
			else if(pathMatrix[row][column] == '-'){
				column--;
			}
			else{
				work = false;
			}
		}
		while(work == true && (0 < row && row < NUMBER_OF_ROWS) && (0 < column && column < NUMBER_OF_COLUMNS));

		if(row == NUMBER_OF_ROWS && column == exitIndex){
			System.out.println("The path has been found in the matrix above");
		}
		else{
			System.out.println("No path has been found in the matrix above");
		}
	}
}