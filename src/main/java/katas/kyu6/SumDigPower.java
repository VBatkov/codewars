package katas.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 6 kyu
 * <p>
 * Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!
 * <p>
 * The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the
 * title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
 * In effect: 89 = 8^1 + 9^2
 * The next number in having this property is 135.
 * See this property again: 135 = 1^1 + 3^2 + 5^3
 * We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b]
 * (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
 * <p>
 * Let's see some cases:
 * sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 * <p>
 * If there are no numbers of this kind in the range [a, b] the function should output an empty list.
 * sum_dig_pow(90, 100) == []
 */
class SumDigPower {
    static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            List<Integer> num = String.valueOf(i).chars().mapToObj(n -> (char) n).map(Character::getNumericValue).collect(Collectors.toList());
            long digPow = 0;
            for (int j = 0; j < num.size(); j++)
                digPow += Math.pow(num.get(j), j + 1);
            if (i == digPow) result.add(i);
        }
        return result;
    }
}
