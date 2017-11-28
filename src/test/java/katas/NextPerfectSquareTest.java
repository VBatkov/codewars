package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextPerfectSquareTest {
    @Test
    public void findNextSquare1() throws Exception {
        assertEquals(NextPerfectSquare.findNextSquare(121), 144);
    }

    @Test
    public void findNextSquare2() throws Exception {
        assertEquals(NextPerfectSquare.findNextSquare(625), 676);
    }

    @Test
    public void findNextSquare3() throws Exception {
        assertEquals(NextPerfectSquare.findNextSquare(114), -1);

    }
}