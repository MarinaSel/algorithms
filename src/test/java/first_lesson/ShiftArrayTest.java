package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShiftArrayTest {

    private final ShiftArray shiftArray = new ShiftArray();

    @Test
    void getShiftedArray2() {
        final int[] array = {1, 2, 3, 4, 5};
        final int[] expected = {3, 4, 5, 1, 2};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 2));
    }

    @Test
    void getShiftedArray6() {
        final int[] array = {1, 2, 3, 4, 5};
        final int[] expected = {2, 3, 4, 5, 1};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 6));
    }

    @Test
    void getShiftedArray0() {
        final int[] array = {1, 2, 3, 4, 5};
        final int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 0));
    }

    @Test
    void getShiftedArray3() {
        final int[] array = {1, 2};
        final int[] expected = {2, 1};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 3));
    }

    @Test
    void getShiftedArrayOnElements() {
        final int[] array = {1};
        final int[] expected = {1};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 3));
    }

    @Test
    void getShiftedArrayEmptyArray() {
        final int[] array = {};
        final int[] expected = {};
        assertArrayEquals(expected, shiftArray.getShiftedArray(array, 8));
    }
}