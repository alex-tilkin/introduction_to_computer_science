package unit_3_and_4;

public class WhileDrillWordsCounter {

	public static void main(String[] args) {
		final String context = "This is a phrase which contains seven words";
		int length = context.length();
		int numOfWords = 0;
		int index = 0;
		
		while(index < length){
			if(context.charAt(index) == ' '){
				numOfWords++;
			}
			
			index++;
		}
		
		System.out.printf("The phrase \"%s\" contains %d words", context, numOfWords);
	}
}