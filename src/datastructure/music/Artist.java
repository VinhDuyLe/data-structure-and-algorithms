package datastructure.music;

import java.util.ArrayList;

public class Artist extends Entity {
    public ArrayList<Song> songs;
    public ArrayList<Album> albums;

    public Artist() {
        name = "";
        songs = new ArrayList<Song>();
        albums = new ArrayList<Album>();
    }

    public boolean equals(Artist otherArtist) {
        return  (name.equals(otherArtist.getName()));
    }

    public boolean hasAlbum(Album a) {

        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).equals(a)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
