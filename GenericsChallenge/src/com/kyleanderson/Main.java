package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
        // This is how we could sort an ArrayList
        //	ArrayList<Team> teams;
        //	Collections.sort(teams);

        FootballTeam greenBay = new FootballTeam("Green Bay Packers");
        FootballTeam houston = new FootballTeam("Houston Texans");
        FootballTeam newEngland = new FootballTeam("New England Patriots");

        BaseballTeam houstonAstros = new BaseballTeam("Houston Astros");
        BaseballTeam newYork = new BaseballTeam("New York Yankees");
        BaseballTeam boston = new BaseballTeam("Boston Red Sox");

        SoccerTeam paris = new SoccerTeam("Paris St. Germaine");
        SoccerTeam houstonDyn = new SoccerTeam("Houston Dynamo");
        SoccerTeam losAngeles = new SoccerTeam("LA Galaxy");

        League<FootballTeam> footballTeamLeague = new League<>("NFL");
        League<BaseballTeam> baseballTeamLeague = new League<>("MLB");
        League<SoccerTeam> soccerTeamLeague = new League<>("MLS");

        footballTeamLeague.addTeam(greenBay);
        footballTeamLeague.addTeam(houston);
        footballTeamLeague.addTeam(newEngland);

        System.out.println(footballTeamLeague.numTeams());


    }
}


