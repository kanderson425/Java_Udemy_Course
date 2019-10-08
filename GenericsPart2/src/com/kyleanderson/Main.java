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

	//The type T within our Team class will allow for us to pass in types other than BaseballPlayer, Footballplayer and SoccePlayer
	Team<String> brokenTeam = new Team<>("this won't work");
	brokenTeam.addPlayer("no-one");
	// Within our Team class we have added "<T extends player>" which will limit "bound" the type of class/restrict the type of class that we can use for team
    }
}
