package katas;

/**
 * 6 kyu
 * <p>
 * Playing with digits
 * <p>
 * Some numbers have funny properties. For example:
 * 89 --> 8¹ + 9² = 89 * 1
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 * <p>
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p we want to find
 * a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal
 * to k * n. In other words:
 * <p>
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 * <p>
 * If it is the case we will return k, if not return -1.
 * <p>
 * Note: n, p will always be given as strictly positive integers.
 */
public class DigPow {
    public static long digPow(int n, int p) {
        int pi = p;
        long sum = 0;
        for (char z : Integer.toString(n).toCharArray()) {
            sum += Math.pow(Character.getNumericValue(z), pi);
            pi++;
        }
        return (sum % n == 0) ? sum / n : -1;
    }
}
