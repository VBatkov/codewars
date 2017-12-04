package katas;

/**
 * 7 kyu
 * <p>
 * Vowel Count
 * <p>
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, and u as vowels for this Kata.
 * The input string will only consist of lower case letters and/or spaces.
 */
class VowelCount {
    static int getCount(String str) {
        return (int) str.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> "aeiou".contains(c.toString()))
                .count();
    }
}
