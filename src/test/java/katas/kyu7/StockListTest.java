package katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockListTest {
    @Test
    public void stockSummary1() throws Exception {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"A", "B"};
        assertEquals("(A : 200) - (B : 1140)", StockList.stockSummary(art, cd));
    }

    @Test
    public void stockSummary2() throws Exception {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"Z", "H", "G"};
        assertEquals("(Z : 0) - (H : 0) - (G : 0)", StockList.stockSummary(art, cd));
    }
}