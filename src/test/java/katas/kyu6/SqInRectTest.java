package katas.kyu6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SqInRectTest {
    @Test
    public void sqInRect1() {
        assertEquals(Arrays.asList(3, 2, 1, 1), SqInRect.sqInRect(5, 3));
    }

    @Test
    public void sqInRect2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }

}