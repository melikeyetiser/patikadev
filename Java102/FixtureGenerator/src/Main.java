import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();
        teams.add(new Team(1, "Bursaspor"));
        teams.add(new Team(2, "Galatasaray"));
        teams.add(new Team(3, "Fenerbahçe"));
        teams.add(new Team(4, "Beşiktaş"));
        teams.add(new Team(5, "Adanaspor"));

        Fixture fixture = new Fixture(teams);
        fixture.generate();

    }
}