package datastructure.music;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    Artist a1, a2, a3;
    Album album1;
    @org.junit.jupiter.api.BeforeEach
    void setup() {
        a1 = new Artist();
        a2 = new Artist();
        a3 = new Artist();
        album1 = new Album();
        a1.setName("Prince");
        a2.setName("Led Zeppelin");
        album1.setName("1999");
    }

    @org.junit.jupiter.api.Test
    boolean testHasAlum() {
        a1.getAlbums().add(album1);
        return a1.hasAlbum(album1);
    }
    @org.junit.jupiter.api.Test
    void testEquals() {
        if (a1.equals(a2)) {
            System.out.println("something went wrong");
        } else {
            System.out.println("working");
        }

        a3.setName("Prince");
        if (a3.equals(a1)) {
            System.out.println("working");
        } else {
            System.out.println("not working");
        }
    }
}