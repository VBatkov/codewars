package katas.kyu7;

/**
 * 6 kyu
 * <p>
 * Sum of Digits / Digital Root
 * <p>
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has two digits, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * <p>
 * Here's how it works (Ruby example given):
 * <p>
 * digital_root(16)
 * => 1 + 6
 * => 7
 * <p>
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * <p>
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * <p>
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */
class DRoot {
    static int digital_root(int n) {
        if (n < 10) return 0;
        int sum = String.valueOf(n).chars().mapToObj(i -> (char)i).mapToInt(Character::getNumericValue).sum();
        if (sum >= 10)
            return digital_root(sum);
        else
            return sum;

        // Альтернативное решение в одну строку (не моё, но чертовски красивое)
        // return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
