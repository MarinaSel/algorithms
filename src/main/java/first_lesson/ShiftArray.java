package first_lesson;

public class ShiftArray {

    //O(n), where n is counted in 10-12 lines
    public int[] getShiftedArray(final int[] array, int shiftedValue) {
        if (array.length <= 1) {
            return array;
        }
        if (shiftedValue > array.length) {
            shiftedValue = shiftedValue % array.length;
        }
        for (int i = 0; i < shiftedValue; i++) {
            int firstElement;
            firstElement = array[0];
            for (int k = 0; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            array[array.length - 1] = firstElement;
        }
        return array;
    }
}
