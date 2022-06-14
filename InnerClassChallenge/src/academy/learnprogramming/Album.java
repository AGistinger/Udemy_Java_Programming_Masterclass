package academy.learnprogramming;

import java.util.ArrayList;

public class Album {
    private final String title;
//    private final ArrayList<Song> songs;
    private final SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public String getTitle() {
        return this.title;
    }

    public SongList getSongs() {
        return this.songList;
    }

    /**
     * Checks if a song exists on an album
     * @param title - the song title being searched for
     * @return boolean
     */
    private boolean songExists(String title) {
        return songList.findSong(title) != null;
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
        this.songList.addSong(title, duration);
        System.out.println(("Added song: " + title + ", " + duration + " min"));
    }

    public static class SongList {
        private final ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public void addSong(String title, double duration) {
            this.songs.add(new Song(title, duration));
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

        public void printSongs() {
            for(Song song : songs) {
                System.out.println(song.getTitle() + ", " + song.getDuration() + " min");
            }
        }
    }
}