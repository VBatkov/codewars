package katas.kyu7;

/**
 * 6 kyu
 * <p>
 * Find The Parity Outlier
 * <p>
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. The
 * array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
 * integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * <p>
 * Examples
 * <p>
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * <p>
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */
class FindOutlier {
    static int find(int[] integers) {
        int firstOddPos = -1;
        int firstEvenPos = -1;
        for (int i = 0; i < integers.length; i++)
            if (integers[i] % 2 == 0) {
                firstEvenPos = i;
                break;
            }
        for (int i = 0; i < integers.length; i++)
            if (Math.abs(integers[i] % 2) == 1) {
                firstOddPos = i;
                break;
            }
        for (int i = 0; i < integers.length; i++)
            if (i != firstEvenPos && i != firstOddPos)
                if (integers[i] % 2 == 0)
                    return integers[firstOddPos];
                else
                    return integers[firstEvenPos];
        return 0;
    }
}