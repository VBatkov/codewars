package katas;

import org.junit.Assert;
import org.junit.Test;

public class FindOutlierTest {
    @Test
    public void findTest1() {
        Assert.assertEquals(11, FindOutlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
    }

    @Test
    public void findTest2() {
        Assert.assertEquals(160, FindOutlier.find(new int[]{160, 3, 1719, 19, 11, 13, -21}));
    }

    @Test
    public void findTest3() {
        Assert.assertEquals(123, FindOutlier.find(new int[]{0, 0, 0, 0, 0, 0, 0, 123}));
    }

    @Test
    public void findTest4() {
        Assert.assertEquals(-123, FindOutlier.find(new int[]{0, 0, 0, 0, 0, 0, 0, -123}));
    }
}
