package academy.learnprogramming;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Song> getSongs() {
        return this.getSongs();
    }

    private boolean songExists(String title) {
        for(Song songs: this.songs) {
            if(title.equals(songs.getTitle())) {
                return true;
            }
        }
        return false;
    }

    public Song findSong(String title) {
        for(Song song : this.songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if(songExists(title)) {
            System.out.println("Unable to add " + title + " song already exists in album");
            return false;
        }
        this.songs.add(new Song(title, duration));
        return true;
    }
}
