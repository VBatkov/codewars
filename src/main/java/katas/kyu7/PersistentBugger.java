package katas.kyu7;

/**
 * 6 kyu
 * <p>
 * Persistent Bugger
 * <p>
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * <p>
 * For example:
 * <p>
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2
 * persistence(4) == 0 // because 4 is already a one-digit number
 */
class PersistentBugger {
    private static int t(String n, int level) {
        Long z = 1L;
        for (char c : n.toCharArray())
            z *= Character.getNumericValue(c);
        if (z.toString().length() > 1)
            return t(z.toString(), level + 1);
        else
            return level + 1;
    }

    static int persistence(long n) {
        if (String.valueOf(n).length() == 1) return 0;
        return t(String.valueOf(n), 0);
    }
}
