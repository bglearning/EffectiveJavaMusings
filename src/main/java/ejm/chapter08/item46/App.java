package ejm.chapter08.item46;

public class App {

	public static void main(String[] args) {

		League league = new League("English Premier League");
		league.addTeam(new Team("Chelsea FC"));
		league.addTeam(new Team("Arsenal FC"));
		league.addTeam(new Team("Manchester United"));

		League league2 = new League("Spanish La Liga");
		league2.addTeam(new Team("FC Barcelona"));
		league2.addTeam(new Team("Real Madrid"));
		
		printLeague(league);
		printLeague(league2);

	}

	public static void printLeague(League league) {
		System.out.println("---------------------------");
		System.out.println("### " + league.getName() + " ###");
		for (Team team : league) {
			System.out.println(team.getName());
		}
		System.out.println("---------------------------");
	}
}
