package first_lesson;

public class MedianSequence {

    //I don't know how to solve it differently without a lot of 'if' and conditions:(
    public double getMedian(final double first, final double second, final double third) {
        if (first < second && first > third || first > second && first < third) {
            return first;
        }
        if (second < first && first > third || second > first && second < third) {
            return second;
        }
        if (third < second && third > first || third > second && third < first) {
            return third;
        }
        if (first == second && first == third) {
            return first;
        }
        throw new RuntimeException("Median doesn't present in this sequence");
    }
}