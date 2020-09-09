import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballTeam implements Actions {

	Scanner scanner = new Scanner(System.in);

	private String teamName;
	private List<Player> playersList = new ArrayList<>();

	public FootballTeam() {
		System.out.print("Enter team name: ");
		setTeamName(teamName);
		setPlayersList(playersList);
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = scanner.nextLine();
	}

	public List<Player> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(List<Player> playersList) {

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter " + (i + 1) + ". player of 3: ");
			playersList.add(new Player(scanner.nextLine()));
		}

	}

	@Override
	public void getList() {

		System.out.println("\nTeam - " + teamName + ": " + playersList);

	}

}
