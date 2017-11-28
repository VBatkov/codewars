package katas;

/**
 * 6 kyu
 * <p>
 * Find the missing letter
 * <p>
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 * <p>
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * <p>
 * Example:
 * <p>
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * <p>
 * (Use the English alphabet with 26 letters!)
 */
public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        for (int i = 1; i < array.length; i++) {
            if ((int) array[i] != (int) array[i - 1] + 1)
                return (char) ((int) array[i - 1] + 1);
        }
        return ' ';
    }
}
