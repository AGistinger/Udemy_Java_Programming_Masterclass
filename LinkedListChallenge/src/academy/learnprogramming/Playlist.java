package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private  final ArrayList<Album> albums;
    private  final LinkedList<Song> playlist;
    private boolean goingForward;
    private ListIterator<Song> currentSong;

    public Playlist() {
        this.goingForward = true;
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
        this.currentSong = playlist.listIterator();
    }

    /**
     * Checks if an album exists in the albums array
     * @param title - song title
     * @return boolean
     */
    private boolean albumExists(String title) {
        for(Album album : this.albums) {
            if(album.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if song exists on any album in albums
     * @param title - song title
     * @return boolean
     */
    private boolean songExists(String title) {
        for(Album album : this.albums) {
            for(Song song : album.getSongs()) {
                if(song.getTitle().equals(title)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns the song object if it exists on any album
     * @param title - song title
     * @return Song
     */
    private Song findSong(String title) {
        Song song = null;
        for(Album album : this.albums) {
            song = findAlbum(album.getTitle()).findSong(title);
        }
        return song;
    }

    /**
     * Will change the iterator to the next song and display a message to the user
     */
    private void nextSong() {
        System.out.println("Now playing " + this.currentSong.next().getTitle());
    }

    /**
     * Will change the iterator to the previous song and display a message to the user
     */
    private void previousSong() {
        System.out.println("Now playing " + this.currentSong.previous().getTitle());
    }

    /**
     * This adjusts the iterator to the back of the playlist if the user changes directions
     * while on the first element.
     */
    private void resetForFirstSong() {
        if(!this.currentSong.hasPrevious()) {
            this.currentSong = playlist.listIterator(playlist.size()); // Set back to end if at start
        }
    }

    /**
     * Returns if the playlist has data
     * @return boolean
     */
    private boolean playlistHasData() {
        return !this.playlist.isEmpty();
    }

    /**
     * Returns the found album using the album title
     * @param title - album title
     * @return Album
     */
    public Album findAlbum(String title) {
        for(Album album : this.albums) {
            if(album.getTitle().equals(title)) {
                return album;
            }
        }
        System.out.println(title + " does not exist in albums");
        return null;
    }

    /**
     * Resets the iterator to the start of the playlist when new songs are added
     */
    private void startPlaylist() {
        this.currentSong = playlist.listIterator();
        nextSong();
    }

    /**
     * Adds a new album object to the list of albums
     * @param album - album of songs
     */
    public void addAlbum(Album album) {
        if(albumExists(album.getTitle())) {
            System.out.println("Unable to add album " + album.getTitle() + "Album already exists");
        } else {
            this.albums.add(album);
            System.out.println("New album " + album.getTitle() + " added");
        }
    }

    /**
     * Adds a new song to the playlist if the song exists in albums
     * @param song - song title
     */
    public void addSongToPlaylist(String song) {
        if(songExists(song)) {
            this.playlist.add(findSong(song));
            System.out.println(song + " added to playlist");
            startPlaylist(); // Sets iterator to first element in playlist when new songs are added
        } else {
            System.out.println("Unable to add " + song + " to playlist, song does not exist in albums");
        }
    }

    /**
     * Will play the next song if the playlist has data
     * Will change iterator to the start of the playlist if the last element has been reached
     */
    public void playNextSong() {
        if(playlistHasData()) {
            if(goingForward) {
                if (!this.currentSong.hasNext()) {
                    this.currentSong = this.playlist.listIterator(); // Set back to the start if at end
                }
                nextSong();
            } else { // if currently going backwards change to forward
                if(this.currentSong.hasNext()) {
                    this.currentSong.next(); // Prevents the same element being displayed twice
                } else {
                    this.currentSong = this.playlist.listIterator(); // Set back to start if at end
                }
                nextSong();
                goingForward = true;
            }
        } else {
            System.out.println("Unable to play next song playlist is empty");
        }
    }

    /**
     * Will play the previous song if the playlist has data
     * Will change iterator to the end of the playlist if the last element has been reached
     */
    public void playPreviousSong() {
        if(playlistHasData()) {
            // if currently going forward change to go backward
            if(goingForward) {
                if(this.currentSong.hasPrevious()) {
                    this.currentSong.previous(); // prevents same element being displayed twice
                    resetForFirstSong(); // checks already at first element
                } else {
                    this.currentSong = playlist.listIterator(playlist.size()); // Set back to end if at start
                }
                previousSong();
                goingForward = false;
            } else {
                if (!this.currentSong.hasPrevious()) {
                    this.currentSong = playlist.listIterator(playlist.size()); // Set back to end if at start
                }
                previousSong();
            }
        } else {
            System.out.println("Unable to play previous song playlist is empty");
        }
    }

    /**
     * Will replay the current song element
     */
    public void replaySong() {
        if(playlistHasData()) {
            if(goingForward) {
                if(this.currentSong.hasPrevious()) {
                    previousSong();
                    goingForward = false;
                }
            } else {
                if(this.currentSong.hasNext()) {
                    nextSong();
                    goingForward = true;
                }
            }
        } else {
            System.out.println("Unable to replay current song, playlist is empty");
        }
    }

    /**
     * Will remove the current song being played
     */
    public void removeCurrentSong() {
        if(playlistHasData()) {
            System.out.println("Removing current song");
            currentSong.remove();
            if(currentSong.hasNext()) {
                playNextSong();
                goingForward = true;
            } else if(currentSong.hasPrevious()) {
                playPreviousSong();
                goingForward = false;
            }
        } else {
            System.out.println("Unable to remove current song, no song playing");
        }
    }

    /**
     * Will display a list of all the songs in the playlist with their duration
     */
    public void listSongs() {
        if(playlistHasData()) {
            int num = 1;
            for(Song song : this.playlist) {
                System.out.println(num + ". " + song.getTitle() + ", " + song.getDuration() + " min");
                num++;
            }
        } else {
            System.out.println("Playlist is empty, add some songs");
        }
    }

    /**
     * Displays list of all owned music
     */
    public void listAlbums() {
        if(!this.albums.isEmpty()) {
            for(Album album : this.albums) {
                System.out.println("Album: " + album.getTitle());
                for(Song song : album.getSongs()) {
                    System.out.println(song.getTitle() + ", " + song.getDuration() + " min");
                }
            }
        } else {
            System.out.println("No owned music, add some music");
        }
    }
}
