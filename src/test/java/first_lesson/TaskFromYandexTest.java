package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskFromYandexTest {

    private final TaskFromYandex taskFromYandex = new TaskFromYandex();

    @Test
    void getDistance2() {
        final int[] array = {1, 0};
        assertEquals(2, taskFromYandex.getDistance(array));

        final int[] array1 = {0, 0, 0, 0, 1};
        assertEquals(4, taskFromYandex.getDistance(array1));

        final int[] array2 = {1, 0, 0, 1, 0, 0, 0, 1};
        assertEquals(2, taskFromYandex.getDistance(array2));

        final int[] array3 = {1, 0, 0, 0, 1};
        assertEquals(2, taskFromYandex.getDistance(array3));

        final int[] array4 = {1, 0, 0, 0, 0};
        assertEquals(4, taskFromYandex.getDistance(array4));

        final int[] array5 = {1, 0, 0, 0, 1, 0, 0, 0, 0};
        assertEquals(4, taskFromYandex.getDistance(array5));
    }
}