package ejm.chapter08.item46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class League implements Iterable<Team> {

	private String name;

	private List<Team> teams = new ArrayList<>();

	public League(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	@Override
	public Iterator<Team> iterator() {
		return teams.iterator();
	}

}
