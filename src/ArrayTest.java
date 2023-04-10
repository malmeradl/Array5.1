import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ArrayTest {

    @Test
    void getSumCos() {
        List<Double> arr = new ArrayList<>();
        arr.add(1.);
        arr.add(10.);
        arr.add(5.);
        assertEquals(Array.getSumCos(arr), 6.);
    }

    @Test
    public void testRemoveArithmeticProgression() {
        List<Double> actual = new ArrayList<>();
        actual.add(135.0);
        actual.add(456.0);
        actual.add(7.0);
        actual.add(89.0);
        actual.add(147.0);
        actual.add(679.0);
        actual.add(-4.0);
        actual.add(0.0);

        List<Double> expected = new ArrayList<>();
        expected.add(7.0);
        expected.add(89.0);
        expected.add(679.0);
        expected.add(-4.0);
        expected.add(0.0);

        actual = Array.removeArithmeticProgression(actual);
        assertEquals(expected, actual);
    }

    @Test
    void hasIncreasingArithmeticProgression() {
        assertTrue(Array.isArithmeticProgression(123.56));
        assertTrue(Array.isArithmeticProgression(357.7));
        assertTrue(Array.isArithmeticProgression(147.0));
        assertFalse(Array.isArithmeticProgression(11.0));
        assertFalse(Array.isArithmeticProgression(125.0));
    }
}