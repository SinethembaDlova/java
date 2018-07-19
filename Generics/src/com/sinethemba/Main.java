package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        FootballPlayer live = new FootballPlayer("Live");
        BaseBallPlayer meiis = new BaseBallPlayer("Meiis");
        SoccerPlayer vusi = new SoccerPlayer("Vusi");

        Team<FootballPlayer> ktcAllStars = new Team<>("KTC All Stars");
        ktcAllStars.addPlayer(live);

        System.out.println("***************************");
        Team<BaseBallPlayer> nyangaBaseball = new Team<>("Nyanga Baseball Club");
        nyangaBaseball.addPlayer(meiis);

        System.out.println("**************************");
        Team<SoccerPlayer> ajax = new Team<>("Ajax Cape Town");
        ajax.addPlayer(vusi);

        System.out.println("**************************");
        Team<FootballPlayer> chiefs = new Team<>("Kaizer Chiefs");

        System.out.println("**************************");
        Team<BaseBallPlayer> betha = new Team<>("Betha Baseball Club");

        System.out.println("**************************");
        Team<SoccerPlayer> pirates = new Team<>("Orlando Pirates");

        System.out.println("*************************");
        ktcAllStars.numPlayers();
        nyangaBaseball.numPlayers();
        ajax.numPlayers();

        System.out.println("**************************");
        ktcAllStars.matchResults(chiefs, 1, 4);

        System.out.println("************************");
        System.out.println("Rankings:");
        System.out.println(ktcAllStars.getName() + ": " + ktcAllStars.ranking());
        System.out.println(nyangaBaseball.getName() + ": " + nyangaBaseball.ranking());
        System.out.println(chiefs.getName() + ": " + chiefs.ranking());
        System.out.println(pirates.getName() + ": " + pirates.ranking());
        System.out.println(betha.getName() + ": " + betha.ranking());
        System.out.println(ajax.getName() + ": " + ajax.ranking());

    }



}

