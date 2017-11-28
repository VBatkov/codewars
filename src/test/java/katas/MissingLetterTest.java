package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingLetterTest {
    @Test
    public void findMissingLetter1() throws Exception {
        assertEquals('e', MissingLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
    }

    @Test
    public void findMissingLetter2() throws Exception {
        assertEquals('P', MissingLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}