import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void binarySearch_findsIndex() {
        int[] a = {1, 3, 5, 7, 9};
        assertEquals(3, Main.binarySearch(a, 7));
    }

    @Test
    void binarySearch_returnsMinusOneWhenNotFound() {
        int[] a = {1, 3, 5, 7, 9};
        assertEquals(-1, Main.binarySearch(a, 4));
    }

    @Test
    void findIndexEqualValue_returnsIndex() {
        int[] a = {-1, -1, 1, 3, 8, 9};
        assertEquals(3, Main.findIndexEqualValue(a));
    }

    @Test
    void findIndexEqualValue_returnsMinusOneWhenNone() {
        int[] a = {-2, -1, 1, 2, 4, 6};
        assertEquals(-1, Main.findIndexEqualValue(a));
    }

    @Test
    void reverseString_returnsReversed() {
        assertEquals("BRUF", Main.reverseString("FURB"));
    }

    @Test
    void majorityElement_returnsMajority() {
        int[] a = {1, 2, 1, 1, 3};
        assertEquals(1, Main.majorityElement(a));
    }

    @Test
    void majorityElement_returnsNullWhenNoMajority() {
        int[] a = {1, 2, 1, 2, 3};
        assertNull(Main.majorityElement(a));
    }
}
