
/**
 * Generics Challenge:
 *  ArrayList<Team> teams;
 *  Collections.sort(teams);
 *
 *  Create a generic class to implement a league table for a sport.
 *  The class should allow teams to be added to the list,
 *  and store a list of teams that belong to that league.
 *
 *  Your class should have a method to print out the teams in order,
 *  with the team at the top of the league printed first.
 *
 *  Only teams of the same type should be added to any particular
 *  instance of the league class - the program should fail to compile
 *  if an attempt is made to add a incompatatible team.
 */

public class Main {
    public static void main(String[] args) {
        SoccerPlayer alex = new SoccerPlayer("Alex");
        SoccerPlayer mark = new SoccerPlayer("Mark");
        SoccerPlayer joe = new SoccerPlayer("Joe");
        FootballPlayer troy = new FootballPlayer("Troy");

        Team<SoccerPlayer> lighting = new Team<>("Lightning");
        Team<SoccerPlayer> dragons = new Team<>("Dragons");
        Team<SoccerPlayer> hurricane = new Team<>("Hurricane");
        Team<FootballPlayer> broncos = new Team<>("Broncos");

        lighting.addPlayer(alex);
        dragons.addPlayer(mark);
        hurricane.addPlayer(joe);
        broncos.addPlayer(troy);

        lighting.matchResult(dragons, 10, 5);
        lighting.matchResult(hurricane, 2, 1);
        dragons.matchResult(lighting, 3, 2);
        hurricane.matchResult(dragons, 2, 5);
        dragons.matchResult(lighting, 5, 2);

        League<Team<SoccerPlayer>> champion = new League<>("Champions");
        champion.addTeam(lighting);
        champion.addTeam(dragons);
        champion.addTeam(hurricane);
//        champion.addTeam(broncos);
        champion.printTeams();

    }
}