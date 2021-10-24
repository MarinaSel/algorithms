package first_lesson;

public class ClosestToAverageInArray {

    //O(2n)
    public int getClosestToAverageInArray(final int[] array) {
        double average;
        double sum = 0.0;
        for (int j : array) {
            sum += j;
        }
        average = sum / array.length;

        double minDifference = 0.0;
        int value = 0;
        for (int i : array) {
            double currentDifference = average - i;
            currentDifference = currentDifference < 0 ? -1 * currentDifference : currentDifference;
            if (minDifference == 0.0 || minDifference > currentDifference) {
                minDifference = currentDifference;
                value = i;
            }
        }
        return value;
    }
}
