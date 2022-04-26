package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private String name;
    private  ArrayList<Album> albums;
    private  LinkedList<Song> playlist;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
    }

    private boolean albumExists(String title) {
        for(Album album : this.albums) {
            if(album.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    private Album findAlbum(String title) {
        for(Album album : albums) {
            if(album.getTitle().equals(title)) {
                return album;
            }
        }
        return null;
    }

    public boolean addAlbum(Album album) {
        if(albumExists(album.getTitle())) {
            System.out.println("Unable to add album " + album.getTitle() + "Album already exists");
            return false;
        }
        this.albums.add(album);
        System.out.println("New album " + album.getTitle() + " added");
        return true;
    }
}
