package first_lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversNumberTest {

    private final ReversNumber reversNumber = new ReversNumber();

    @Test
    void reverseNumber() {
        assertEquals(301, reversNumber.reverseNumber(103));

        assertEquals(25789, reversNumber.reverseNumber(98752));

        assertEquals(0, reversNumber.reverseNumber(0));

        //zeroes in the beginning are truncated
        assertEquals(1, reversNumber.reverseNumber(10));

        assertEquals(5, reversNumber.reverseNumber(500));

        assertEquals(15, reversNumber.reverseNumber(510));
    }
}