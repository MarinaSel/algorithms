package second_lesson;

public class FirstTask {

    public int[] createSortedArrayFromTwo(final int[] firstArray, final int[] secondArray) {
        if (firstArray.length == 0) {
            return firstArray;
        } else if (secondArray.length == 0) {
            return secondArray;
        }
        boolean ascending = firstArray[0] < firstArray[firstArray.length - 1] && secondArray[0] < secondArray[secondArray.length - 1];
        if (ascending) {
            return getAscendingArrayFromTwo(firstArray, secondArray);
        } else {
            return getDescendingArrayFromTwo(firstArray, secondArray);
        }
    }

    private int[] getAscendingArrayFromTwo(int[] firstArray, int[] secondArray) {
        final int[] result = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > firstArray.length - 1) {
                int a = secondArray[j];
                result[k] = a;
                j++;
            } else if (j > secondArray.length - 1 || firstArray[i] < secondArray[j]) {
                int a = firstArray[i];
                result[k] = a;
                i++;
            } else {
                int b = secondArray[j];
                result[k] = b;
                j++;
            }
        }
        return result;
    }

    private int[] getDescendingArrayFromTwo(int[] firstArray, int[] secondArray) {
        final int[] result = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > firstArray.length - 1) {
                int a = secondArray[j];
                result[k] = a;
                j++;
            } else if (j > secondArray.length - 1 || firstArray[i] > secondArray[j]) {
                int a = firstArray[i];
                result[k] = a;
                i++;
            } else {
                int b = secondArray[j];
                result[k] = b;
                j++;
            }
        }
        return result;
    }
}
