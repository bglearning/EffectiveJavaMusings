package ejm.chapter03.item12;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Objects;

public class ClubSeason implements Comparable<ClubSeason> {
    protected Club club;
    protected int points;
    protected int goalDifference;

    public ClubSeason(String clubName, int points, int goalDifference) {
        if (points < 0) 
            throw new IllegalArgumentException(String.format("Point cannot be negative: %d", points));

        this.club = new Club(clubName);
        this.points = points;
        this.goalDifference = goalDifference;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof ClubSeason))
            return false;

        ClubSeason clubSeason = (ClubSeason) o;
        return clubSeason.club.equals(club) && clubSeason.points == points 
            && clubSeason.goalDifference == goalDifference;

    }

    @Override
    public int hashCode() {
        return Objects.hash(club, points, goalDifference);
    }

    @Override
    public String toString() {
        return String.format("%s: %d (%d)", club.getName(), points, goalDifference);
    }

    public Club asClub() {
        return club;
    }

    public int compareTo(ClubSeason clubSeason) {
        int pointDiff = points - clubSeason.points;
        if (pointDiff != 0) 
            return pointDiff;
        int goalDifferenceDiff = goalDifference - clubSeason.goalDifference;
        if (goalDifferenceDiff != 0)
            return goalDifferenceDiff;

        return club.getName().compareTo(clubSeason.asClub().getName());
    }

    public static void main(String[] args) {
        NavigableSet<ClubSeason> cs = new TreeSet<>();

        cs.add(new ClubSeason("Arsenal", 47, 26)); 
        cs.add(new ClubSeason("Chelsea", 56, 32)); 
        cs.add(new ClubSeason("Tottenham", 47, 29)); 
        cs.add(new ClubSeason("Liverpool", 46, 24)); 
        cs.add(new ClubSeason("Manchester United", 42, 12)); 
        cs.add(new ClubSeason("Manchester City", 46, 19)); 
        cs.add(new ClubSeason("Manchester United", 42, 12)); 

        System.out.println(cs);
    }

}
