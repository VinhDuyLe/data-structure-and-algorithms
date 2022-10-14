package datastructure.music;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library l;
    Song s;
    @BeforeEach
    void setUp() {
        l = new Library();
        s = new Song();
        s.setName("aldf");
    }

    @Test
    void findSong() {
        String s = "Happy Birthday";
        boolean v = l.findSong(s);
        assertEquals(v, true);
        System.out.println(v);
    }

    @Test
    void addSong() {
        l.addSong(s);
        assertTrue(l.findSong(s.getName()));
    }

    @Test
    void deleteSong() {
        l.deleteSong(s);
        assertFalse(l.findSong(s.getName()));
    }
}