package ejm.chapter03.item12;

public class Club {

    protected String name;

    public Club(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Club))
            return false;

        Club club = (Club) o;
        return club.name.equals(name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
