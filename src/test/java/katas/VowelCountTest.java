package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCountTest {
    @Test
    public void getCount() throws Exception {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }

}