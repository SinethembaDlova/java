package com.sinethemba;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("For the love of house", "Euphonik");
        album.addSong("Fairplay", 8.3);
        album.addSong("Vuma", 7.5);
        album.addSong("Apologies", 7.5);
        album.addSong("Fine day", 6.3);
        album.addSong("Tholukuth", 5);
        album.addSong("Blaze ubumnandi", 7.2);
        album.addSong("Seng'khathele", 5.0);
        album.addSong("hallelua", 4);
        album.addSong("Doremifa", 4.4);
        album.addSong("Uzalo", 3);

        albums.add(album);

        album = new Album("I cant survive", "DJ Kent");
        album.addSong("Falling", 10.3);
        album.addSong("I cant survive", 6.5);
        album.addSong("Love is just a dream", 5.5);
        album.addSong("Your love", 7.3);
        album.addSong("Spin my world around", 4);
        album.addSong("Vertigo", 5.2);
        album.addSong("Love you still", 9.0);
        album.addSong("Dont let go", 5);
        album.addSong("Breathing", 6.1);
        album.addSong("Fly away", 6.3);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(1).addToPlaylist("Breathing", playlist);
        albums.get(0).addToPlaylist("Only you", playlist);
        albums.get(0).addToPlaylist("Apologies", playlist);
        albums.get(0).addToPlaylist("Omunye", playlist);
        albums.get(0).addToPlaylist(10, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(15 , playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0){
            System.out.println("No songs in the playlist");
            return;
        }
        else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3: if (forward){
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = false;
                    }
                    else {
                        System.out.println("We are at the start of the list.");
                    }
                }
                else{
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                        forward = true;
                    }
                    else{
                        System.out.println("We have reached the end of the list.");
                    }
                }
                    break;
                case 4: printPlaylist(playlist);
                    break;
                case 5: printMenu();
                    break;
                case 6: if (playlist.size() >0){
                    listIterator.remove();
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next());
                    }
                    else{
                        System.out.println("Now playing" + listIterator.previous());
                    }
                }
                break;
            }
        }
    }

    public static void printMenu(){

        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit.\n" +
        "1 - to play the next song.\n" +
        "2 - to play the previous song.\n" +
        "3 - to replay the current song.\n" +
        "4 - t0 list songs in the playlist.\n" +
        "5 - to print available action.\n" +
        "6 - to delete current song in the playlist.");
    }

    private static void printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();

        System.out.println("************************");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************************");
    }







}
