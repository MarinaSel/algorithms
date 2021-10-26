package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestToAverageInArrayTest {

    private final ClosestToAverageInArray closestToAverageInArray = new ClosestToAverageInArray();

    @Test
    void getClosestToAverageInArray() {
        final double[] array = {1, 3, 5, 8, 13};
        assertEquals(8, closestToAverageInArray.getClosestToAverageInArray(array));

        final double[] array1 = {100, 44, 55, 99, 105, 200};
        assertEquals(105, closestToAverageInArray.getClosestToAverageInArray(array1));

        final double[] array0 = {0, 0, 0, 0, 0, 0};
        assertEquals(0, closestToAverageInArray.getClosestToAverageInArray(array0));

        final double[] array4 = {0, 1, 2, 3, 5, 10, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(5, closestToAverageInArray.getClosestToAverageInArray(array4));
    }
}