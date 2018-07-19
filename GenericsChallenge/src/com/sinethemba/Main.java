package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        League<Team<SoccerPlayer>> soccerLeague = new League<>("UEFA Champions League");

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea FC");
        Team<SoccerPlayer> manUnited = new Team<>("Manchester United");
        Team<SoccerPlayer> manCity = new Team<>("Manchester City");
        Team<SoccerPlayer> madrid = new Team<>("Real Madrid");

        soccerLeague.add(chelsea);
        soccerLeague.add(manUnited);
        soccerLeague.add(manCity);
        soccerLeague.add(madrid);

        System.out.println("*************************************************");
        System.out.println("League Table: ");
        System.out.println("-------------------------");
        soccerLeague.showLeagueTable();
        System.out.println("-------------------------");

        System.out.println("*************************************************");
        chelsea.matchResults(manUnited, 4, 2);
        madrid.matchResults(manCity, 1,1);

        System.out.println("*************************************************");
        System.out.println("League Table: ");
        System.out.println("-------------------------");
        soccerLeague.showLeagueTable();
        System.out.println("-------------------------");
    }
}
