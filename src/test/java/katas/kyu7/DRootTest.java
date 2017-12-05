package katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {
    @Test
    public void digital_root1() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(16), 7);
    }

    @Test
    public void digital_root2() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(942), 6);
    }

    @Test
    public void digital_root3() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(132189), 6);
    }

    @Test
    public void digital_root4() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(493193), 2);
    }

    @Test
    public void digital_root5() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(10), 1);
    }

    @Test
    public void digital_root6() throws Exception {
        assertEquals("Nope!", DRoot.digital_root(100009), 1);
    }
}