import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(team.getName() + " already exists, not added");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to " + this.getName());
            return true;
        }
    }

    public void printTeams() {
        int ranking = 1;
        Collections.sort(teams);
        for(T team : teams) {
            System.out.println(ranking++ + ". " + team.getName() + ": " + team.ranking());
        }
    }


}
