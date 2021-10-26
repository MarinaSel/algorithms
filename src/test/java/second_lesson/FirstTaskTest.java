package second_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstTaskTest {

    private final FirstTask firstTask = new FirstTask();

    @Test
    void createSortedArrayFromTwo() {
        final int[] first1 = {1, 2, 3, 4, 5};
        final int[] second1 = {5, 6, 7, 8};
        final int[] result1 = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        assertArrayEquals(result1, firstTask.createSortedArrayFromTwo(first1, second1));

        final int[] first2 = {5, 4, 3, 2};
        final int[] second2 = {8, 7, 5, 4, 3, 2, 1, -1};
        final int[] result2 = {8, 7, 5, 5, 4, 4, 3, 3, 2, 2, 1, -1};
        assertArrayEquals(result2, firstTask.createSortedArrayFromTwo(first2, second2));
    }
}