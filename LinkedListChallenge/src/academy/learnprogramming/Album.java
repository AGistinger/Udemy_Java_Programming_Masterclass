package academy.learnprogramming;

import java.util.ArrayList;

public class Album {
    private final String title;
    private final ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Checks if a song exists on an album
     * @param title - the song title being searched for
     * @return boolean
     */
    private boolean songExists(String title) {
        for(Song songs: this.songs) {
            if(title.equals(songs.getTitle())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the song object for the title provided
     * @param title - song title
     * @return Song
     */
    public Song findSong(String title) {
        for(Song song : this.songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    /**
     * Adds a new song to an album if not already existing
     * @param title - song title
     * @param duration - time length of song
     */
    public void addSong(String title, double duration) {
        if(songExists(title)) {
            System.out.println("Unable to add " + title + " song already exists in album");
        }
        this.songs.add(new Song(title, duration));
        System.out.println(("Added song: " + title + ", " + duration + " min"));
    }
}
