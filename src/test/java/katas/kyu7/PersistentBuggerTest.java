package katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersistentBuggerTest {
    @Test
    public void persistence1() throws Exception {
        assertEquals(PersistentBugger.persistence(39), 3);
    }

    @Test
    public void persistence2() throws Exception {
        assertEquals(PersistentBugger.persistence(999), 4);
    }

    @Test
    public void persistence3() throws Exception {
        assertEquals(PersistentBugger.persistence(4), 0);
    }
}