package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMiddleCharacterTest {
    @Test
    public void getMiddle1() throws Exception {
        assertEquals(GetMiddleCharacter.getMiddle("test"), "es");
    }

    @Test
    public void getMiddle2() throws Exception {
        assertEquals(GetMiddleCharacter.getMiddle("testing"), "t");
    }

    @Test
    public void getMiddle3() throws Exception {
        assertEquals(GetMiddleCharacter.getMiddle("middle"), "dd");
    }

    @Test
    public void getMiddle4() throws Exception {
        assertEquals(GetMiddleCharacter.getMiddle("A"), "A");
    }
}