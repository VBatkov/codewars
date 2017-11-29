package katas;

import org.junit.Test;
import sun.reflect.annotation.ExceptionProxy;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GapInPrimesTest {
    @Test
    public void gap1() throws Exception {
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2, 100, 110)));
    }

    @Test
    public void gap2() throws Exception {
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4, 100, 110)));
    }

    @Test
    public void gap3() throws Exception {
        assertEquals(null, GapInPrimes.gap(6, 100, 110));
    }

    @Test
    public void gap4() throws Exception {
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8, 300, 400)));
    }

    @Test
    public void gap5() throws Exception {
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10, 300, 400)));
    }
}