package katas.kyu7;

/**
 * 7 kyu
 * <p>
 * Get the Middle Character
 * <p>
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is
 * odd, return the middle character. If the word's length is even, return the middle 2 characters.
 * <p>
 * #Examples:
 * <p>
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 * <p>
 * #Input
 * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases
 * due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do
 * not need to worry about your solution timing out.
 * <p>
 * #Output
 * The middle character(s) of the word represented as a string.
 */
class GetMiddleCharacter {
    static String getMiddle(String word) {
        int n = word.length() / 2;
        StringBuilder sb = new StringBuilder(word);
        return sb.substring(word.length() % 2 == 0 ? n - 1 : n, n + 1);
    }
}
