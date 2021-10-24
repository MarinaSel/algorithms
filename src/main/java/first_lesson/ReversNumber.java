package first_lesson;

public class ReversNumber {

    //O(n), where n is count of digits in value
    public int reverseNumber(int value) {
        if (value < 10) {
            return value;
        }
        int reverseValue = 0;
        while (value >= 1) {
            reverseValue = reverseValue * 10 + value % 10;
            value = value / 10;
        }
        return reverseValue;
    }
}
