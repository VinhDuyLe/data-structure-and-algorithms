package datastructure.music;

import java.util.ArrayList;
import java.util.Objects;

public class Album extends Entity{
    public ArrayList<Song> songs;
    public Artist artist;

    public Album() {
        name = new String();
        songs = new ArrayList<Song>();
        artist = new Artist();
    }

    public Album(String name, ArrayList<Song> songs, Artist artist) {
        this.name = name;
        this.songs = songs;
        this.artist = artist;
    }

    public boolean equals(Album a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Album album = (Album) a;
        return Objects.equals(name, album.name) &&
                Objects.equals(songs, album.songs) &&
                Objects.equals(artist, album.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, songs, artist);
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
