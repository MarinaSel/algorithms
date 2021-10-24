package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestToAverageInArrayTest {

    private final ClosestToAverageInArray closestToAverageInArray = new ClosestToAverageInArray();

    @Test
    void getClosestToAverageInArray() {
        final int[] array = {1, 3, 5, 8, 13};
        assertEquals(5, closestToAverageInArray.getClosestToAverageInArray(array));

        final int[] array1 = {100, 44, 55, 99, 105, 200};
        assertEquals(100, closestToAverageInArray.getClosestToAverageInArray(array1));

        final int[] array0 = {0, 0, 0, 0, 0, 0};
        assertEquals(0, closestToAverageInArray.getClosestToAverageInArray(array0));
    }
}