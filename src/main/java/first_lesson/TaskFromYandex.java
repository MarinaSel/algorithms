package first_lesson;

public class TaskFromYandex {

    //O(n), where n is array.length
    public int getDistance(final int[] array) {
        int maxZeroCount = 0;
        int currentZeroCount = 0;
        boolean betweenOne = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                currentZeroCount += 1;
                if (array.length - 1 == i) {
                    maxZeroCount = Math.max(currentZeroCount, maxZeroCount);
                }
            } else if (array[i] == 1) {
                if ((array[0] == 1 && array[array.length - 1] == 1)) {
                    betweenOne = true;
                }
                maxZeroCount = currentZeroCount;
                currentZeroCount = 0;
            }
        }
        return maxZeroCount == 1 ? 2 : !betweenOne ? maxZeroCount : maxZeroCount / 2 + 1;
    }
}
