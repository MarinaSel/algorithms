package first_lesson;

public class ClosestToAverageInArray {

    //O(2n)
    public double getClosestToAverageInArray(final double[] array) {
        //find average
        double average;
        double max = array[0];
        double min = array[0];
        //fina max and min
        for (double j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        average = (max + min) / 2;

        double minDifference = max;
        double value = 0;
        //find closest to average
        for (double i : array) {
            double currentDifference = average - i;
            currentDifference = currentDifference < 0 ? -1 * currentDifference : currentDifference;
            if (minDifference > currentDifference) {
                minDifference = currentDifference;
                value = i;
            }
        }
        return value;
    }
}
