package solution.question_1;

import solution.question_1.FootballPlayer;
import solution.question_1.FootballPlayer.Position;

public class FootballTeam {
	private String name;
	private FootballPlayer[] draftedFootballplayers;
	private FootballPlayer.Position[] missingPositions;
	private int numberOfDraftedPlayers;
	private int playerScoreThreshold;
	
	public FootballTeam(String name, int maxCapacityForDraftedFootballPlayers, FootballPlayer.Position[] missingPositions, int playerScoreThreshold) {
		this.name = name;
		draftedFootballplayers = new FootballPlayer[maxCapacityForDraftedFootballPlayers];
		this.missingPositions = missingPositions;
		this.playerScoreThreshold = playerScoreThreshold;
		numberOfDraftedPlayers = 0;
	}
	
	public boolean isFit(FootballPlayer footballPlayer) {
		float footballPlayerScore = footballPlayer.calculateScore();
		FootballPlayer.Position position = footballPlayer.getPosition();
		
		if(numberOfDraftedPlayers >= draftedFootballplayers.length) {
			return false;
		}
		
		if(footballPlayerScore < playerScoreThreshold) {
			return false;
		}
		
		for(FootballPlayer.Position missingPosition : missingPositions) {
			if(missingPosition == position) {
				return true;
			}
		}
		
		return false;
	}
	
	public void draft(FootballPlayer footballPlayer) {
		draftedFootballplayers[numberOfDraftedPlayers] = footballPlayer;
		numberOfDraftedPlayers++;
		
		removeMissingPostion(footballPlayer.getPosition());
	}

	public void sortDraftedFootballplayers() {
		int length = numberOfDraftedPlayers;
		
		for (int index = 0; index < length - 1; index++){
			for (int indexB = 0; indexB < length - index - 1; indexB++){
				if (draftedFootballplayers[indexB].calculateScore() > draftedFootballplayers[indexB + 1].calculateScore()){
					swap(indexB, indexB + 1); 
				}
			}
		}
	}
	
	public void printDetailsOfDradtedPlayers() {
		System.out.println(name);
		System.out.println(numberOfDraftedPlayers);
		System.out.println(playerScoreThreshold);
		
		for (int index = 0; index < numberOfDraftedPlayers; index++) {
			draftedFootballplayers[index].printDetails();
		}
	}
	
	public FootballPlayer find(int footballPlayerScore) {
		FootballPlayer footballPlayer = internalFind(footballPlayerScore, 0, draftedFootballplayers.length);
		
		return footballPlayer;
	}
	
	private FootballPlayer internalFind(int footballPlayerScore, int lowBoundry, int highBoundry) {
		if(lowBoundry > highBoundry) {
			return null;
		}
		
		int middle = lowBoundry + (highBoundry - lowBoundry) / 2;
		
		if(draftedFootballplayers[middle].calculateScore() == footballPlayerScore) {
			return draftedFootballplayers[middle];
		}
		
		if(draftedFootballplayers[middle].calculateScore() == footballPlayerScore) {
			return internalFind(footballPlayerScore, middle + 1, highBoundry);
		}
		
		return internalFind(footballPlayerScore, lowBoundry, middle - 1);
	}

	private void swap(int indexA, int indexB) {
		FootballPlayer temp = draftedFootballplayers[indexA];
		
		draftedFootballplayers[indexA] = draftedFootballplayers[indexB]; 
		draftedFootballplayers[indexB] = temp;
	}
	
	private void removeMissingPostion(Position positionToRemove) {
		FootballPlayer.Position[] newMissingPositions = new FootballPlayer.Position[missingPositions.length - 1];
		boolean isSkipped = false;
		
		for(int index = 0, newMissingPositionsIndex = 0; index < missingPositions.length; index++) {
			if(missingPositions[index] != positionToRemove && !isSkipped) {
				newMissingPositions[newMissingPositionsIndex] = missingPositions[index];
				newMissingPositionsIndex++;
				isSkipped = true;
			}
		}
		
		missingPositions = newMissingPositions;
	}
}