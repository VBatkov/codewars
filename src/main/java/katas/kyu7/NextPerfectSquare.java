package katas.kyu7;

/**
 * 7 kyu
 * <p>
 * Find the next perfect square
 * <p>
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
 * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
 * <p>
 * Examples:
 * <p>
 * findNextSquare(121) --> returns 144
 * findNextSquare(625) --> returns 676
 * findNextSquare(114) --> returns -1 since 114 is not a perfect
 */
class NextPerfectSquare {
    static long findNextSquare(long sq) {
        double d = Math.sqrt(sq);
        long r = -1;
        if (d - (long) d <= 0.000001f) r = (long) Math.pow((long) d + 1, 2);
        return r;
    }
}
