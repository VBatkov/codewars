package katas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * 6 kyu
 * <p>
 * Help the bookseller!
 * <p>
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5
 * or more capitals letters. The 1st letter of a code is the capital letter of the book category. In the bookseller's
 * stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity
 * of books of this code in stock.
 * <p>
 * In a given stocklist all codes have the same length and all numbers have their own same length
 * (can be different from the code length).
 * <p>
 * For example an extract of one of the stocklists could be:
 * <p>
 * L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 * <p>
 * In this stocklist all codes have a length of five and all numbers have a length of two.
 * <p>
 * You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
 * <p>
 * M = {"A", "B", "C", "W"}
 * <p>
 * and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity
 * according to each category.
 * <p>
 * For the lists L and M of example you have to return the string (in Haskell/Clojure a list of pairs):
 * <p>
 * (A : 20) - (B : 114) - (C : 50) - (W : 0)
 * <p>
 * where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum corresponding to
 * "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code beginning with W.
 * <p>
 * If L or M are empty return string is "".
 */
class StockList {
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : lstOfArt)
            hm.put(s.substring(0, 1), hm.getOrDefault(s.substring(0, 1), 0) + Integer.parseInt(s.split(" ")[1]));
        return Arrays.stream(lstOf1stLetter)
                .map(s -> "(" + s + " : " + hm.getOrDefault(s, 0).toString() + ")")
                .collect(Collectors.joining(" - "));
    }
}
