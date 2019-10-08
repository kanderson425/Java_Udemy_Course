package com.kyleanderson;


public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

	adelaideCrows.addPlayer(joe);
//	adelaideCrows.addPlayer(pat);	// b/c our team is now a football team, Beckham is now going to be flagged for not meeting the criteria of being added
//	adelaideCrows.addPlayer(beckham); // b/c our team is now a football team, Beckham is now going to be flagged for not meeting the criteria of being added

	System.out.println(adelaideCrows.numPlayers());


	Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
	baseballTeam.addPlayer(pat);

	// The type T within our Team class will allow for us to pass in types other than BaseballPlayer, Footballplayer and SoccerPlayer
	Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
	brokenTeam.addPlayer(beckham); // this method requires an object of the player class
	// Within our Team class we have added "<T extends player>" which will limit "bound" the type of class/restrict the type of class that we can use for team

	Team<FootballPlayer> melbourne = new Team<>("Melbourne");
	FootballPlayer banks = new FootballPlayer("Gordon");
	melbourne.addPlayer(banks);

	Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
	Team<FootballPlayer> fremantle = new Team<>("Fremantle");

	hawthorn.matchResult(fremantle, 1, 0);
	hawthorn.matchResult(adelaideCrows, 3, 8);

	adelaideCrows.matchResult(fremantle, 2, 1);
//	adelaideCrows.matchResult(baseballTeam, 1,1); // This will produce an error b/c we've matched up a soccer team with a baseball team



	System.out.println("Rankings");
	System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
	System.out.println(melbourne.getName() + ": " + melbourne.ranking());
	System.out.println(fremantle.getName() + ": " + fremantle.ranking());
	System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

	System.out.println(adelaideCrows.compareTo(melbourne));
	System.out.println(adelaideCrows.compareTo(hawthorn));

	System.out.println(hawthorn.compareTo(adelaideCrows));
	System.out.println(melbourne.compareTo(fremantle));
    }
}
