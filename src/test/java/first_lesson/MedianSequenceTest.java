package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MedianSequenceTest {

    private final MedianSequence medianSequence = new MedianSequence();

    @Test
    void getMedian() {
        assertEquals(5.0, medianSequence.getMedian(1, 8, 5));
    }

    @Test
    void getMedianFloat() {
        assertEquals(8.6f, medianSequence.getMedian(5.5f, 8.7f, 8.6f));
    }

    @Test
    void getMedianLong() {
        assertEquals(3.3, medianSequence.getMedian(3.3, 0.0, 88));
    }

    @Test
    void getMedianWithZeros() {
        assertEquals(0, medianSequence.getMedian(0, 0, 0));
    }

    @Test
    void getMedianWithoutMedian() {
        assertThrows(RuntimeException.class, () -> medianSequence.getMedian(0, 0, 2));
    }
}