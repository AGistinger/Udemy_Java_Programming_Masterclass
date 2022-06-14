package academy.learnprogramming;

/**
 * InnerClassChallenge
 * Modify the playlist challenge so that the Album class uses an inner class.
 * Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
 * It will also provide findSong() methods which will be used by the containing Album class
 * to add songs to the playlist.
 * Neither the Song class nor the Main class should be changed.
 */

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Playlist playlist = new Playlist();

    public static void main(String[] args) {
        /*
         * Create a program that implements a playlist for songs
         * Create a Song class having a Title and Duration for a song
         * The program will have an Album class containing a list of songs
         * The albums will be stored in an ArrayList
         * Playlist will be a linked list
         * Songs from different albums can be added to the playlist and will appear in the list
         *  in the order they are added.
         * Once the songs have been added to the playlist, create a menu of options to : -
         *  Quit out of the menu, Skip forward to the next song, skip backwards to a previous song.
         *  Replay the current song, List the songs in the playlist.
         * A song must exist on an album before it can be added to the playlist (so you can only play songs
         *  that you own).
         * Hint: To replay, a song consider what happened when we went back and forth from a city
         * before we started tracking the direction we were going.
         * As an optional extra, provide an option to remove the current song from the playlist
         *  (hint: listIterator.remove()
         */
        printMenu();
        runMusic();
    }

    /**
     * Prints menu options for user
     */
    public static void printMenu() {
        System.out.println("Menu Options:");
        System.out.println("1 - List all songs in playlist");
        System.out.println("2 - Play next song");
        System.out.println("3 - Play previous song");
        System.out.println("4 - Replay current song");
        System.out.println("5 - Remove current song from playlist");
        System.out.println("6 - Add album to collection");
        System.out.println("7 - Add song to album");
        System.out.println("8 - Add song to playlist");
        System.out.println("9 - Display menu options");
        System.out.println("10 - Display all owned songs");
        System.out.println("11 - Quit");
    }

    /**
     * Starts the playlist (sets correct iterator index to start)
     * Handles user's selections
     */
    public static void runMusic() {
        boolean running = true;

        while(running) {
            System.out.println("Make a selection: ");
            int selection = 0;
            if(validateInt()) {
                selection = scanner.nextInt();
                scanner.nextLine();
            }

            switch(selection) {
                case 1 :
                    playlist.listSongs();
                    break;
                case 2:
                    playlist.playNextSong();
                    break;
                case 3:
                    playlist.playPreviousSong();
                    break;
                case 4:
                    playlist.replaySong();
                    break;
                case 5:
                    playlist.removeCurrentSong();
                    break;
                case 6:
                    addAlbum();
                    break;
                case 7:
                    addSongToAlbum();
                    break;
                case 8:
                    addSongToPlaylist();
                    break;
                case 9:
                    printMenu();
                    break;
                case 10:
                    playlist.listAlbums();
                    break;
                case 11:
                    System.out.println("Quitting music");
                    running = false;
                    break;
            }
        }
    }

    /**
     * Handles user's selection to add new album
     */
    private static void addAlbum() {
        System.out.println("Enter the name of your album you want to add:");
        String albumName = scanner.nextLine();

        playlist.addAlbum(new Album(albumName));
    }

    /**
     * Handles user's selection to add new song to existing album
     */
    private static void addSongToAlbum() {
        System.out.println("Enter the name of the album you want to add a song for:");
        String albumName = scanner.nextLine();

        if(playlist.findAlbum(albumName) != null) {
            System.out.println("Enter the name of the song you want to add:");
            String songName = scanner.nextLine();
            System.out.println("Enter the time duration of the song you want to add:");

            if(validateDouble()) {
                double duration = scanner.nextDouble();
                scanner.nextLine();
                playlist.findAlbum(albumName).addSong(songName, duration);
            }
        }
    }

    private static void addSongToPlaylist() {
        System.out.println("Enter the song name you want to add to the playlist:");
        String songName = scanner.nextLine();
        playlist.addSongToPlaylist(songName);
    }

    /**
     * Handles user entering NaN for input when double expected
     * @return boolean
     */
    private static boolean validateDouble() {
        while(!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Duration entered is not a number, please try again:");
        }
        return scanner.hasNextDouble();
    }

    /**
     * Handles user entering NaN for input when int expected
     * @return boolean
     */
    private static boolean validateInt() {
        while(!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Option entered is not a number, please try again:");
        }
        return scanner.hasNextInt();
    }
}