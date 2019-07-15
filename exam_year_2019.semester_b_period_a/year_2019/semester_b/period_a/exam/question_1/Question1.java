package year_2019.semester_b.period_a.exam.question_1;

import java.io.FileNotFoundException;

public class Question1 {

	public static void main(String[] args) throws FileNotFoundException {
		final String playerFilePath = "src/question_1/players.txt";
		DraftContest draftContest = new DraftContest();
		
		draftContest.load(playerFilePath);
		FootballTeam[] footballTeams = loadFootballTeams();
		int numberOfPlayers = draftContest.NUMBER_OF_PLAYERS;
		int teamIndex = 0;
		
		for(int index  = 0; index < numberOfPlayers; index++) {
			FootballPlayer footballPlayer = draftContest.nextPlayer();
			FootballTeam footballTeam = footballTeams[teamIndex];
			teamIndex = teamIndex == footballTeams.length ? 0 : teamIndex + 1;
			boolean isFit = footballTeam.isFit(footballPlayer);
			if(!isFit) {
				continue;
			}
			
			footballTeam.draft(footballPlayer);
		}
		
		for (FootballTeam footballTeam : footballTeams) {
			footballTeam.sortDraftedFootballplayers();
		}
		
		for (FootballTeam footballTeam : footballTeams) {
			footballTeam.printDetailsOfDradtedPlayers();
		}
	}

	private static FootballTeam[] loadFootballTeams() {
		FootballPlayer.Position[] RamsMissingPositions = new FootballPlayer.Position[] {FootballPlayer.Position.Quarterback, FootballPlayer.Position.OffensiveLine, FootballPlayer.Position.DefensiveTackle, FootballPlayer.Position.Linebacker, FootballPlayer.Position.OffensiveTackle, FootballPlayer.Position.Center};
		FootballTeam rams = new FootballTeam("Los Angeles Rams", 6, RamsMissingPositions, 10);
		
		FootballPlayer.Position[] eaglesMissingPositions = new FootballPlayer.Position[] {FootballPlayer.Position.DefensiveTackle, FootballPlayer.Position.DefensiveTackle, FootballPlayer.Position.DefensiveEnd, FootballPlayer.Position.Guard, FootballPlayer.Position.WideReceiver, FootballPlayer.Position.WideReceiver, FootballPlayer.Position.Cornerback};
		FootballTeam eagles = new FootballTeam("Los Angeles Rams", 7, eaglesMissingPositions, 10);
		
		FootballPlayer.Position[] raidersMissingPositions = new FootballPlayer.Position[] {FootballPlayer.Position.Quarterback, FootballPlayer.Position.Quarterback, FootballPlayer.Position.Center, FootballPlayer.Position.OffensiveLine};
		FootballTeam raiders = new FootballTeam("Oaklan Raiders", 4, raidersMissingPositions, 10);
		
		FootballTeam[] footballTeams = new FootballTeam[] {raiders, eagles, rams};
		
		return footballTeams;
	}
}
