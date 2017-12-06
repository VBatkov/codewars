package katas.kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * 6 kyu
 * <p>
 * Rectangle into Squares
 * <p>
 * The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that
 * the two dimensions are different).
 * <p>
 * [Here must be a picture]
 * <p>
 * Can you translate this drawing into an algorithm?
 * <p>
 * You will be given two dimensions
 * a positive integer length (parameter named lng)
 * a positive integer width (parameter named wdth)
 * <p>
 * You will return an array with the size of each of the squares.
 * sqInRect(5, 3) should return a List<Integer> {3, 2, 1, 1}
 * sqInRect(3, 5) should return a List<Integer> {3, 2, 1, 1}
 * <p>
 * #Note: lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be
 * interpreted with lng != wdth. See kata, Square into Squares. Protect trees!.
 * <p>
 * When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious but not in the
 * spirit of this kata so, in that case, return None/nil/null/Nothing.
 * sqInRect(5, 5) should return null
 */
class SqInRect {
    static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> result = new ArrayList<>();
        while (lng != 0 || wdth != 0) {
            if (lng < wdth) {
                result.add(lng);
                wdth -= lng;
            } else if (lng > wdth) {
                result.add(wdth);
                lng -= wdth;
            } else {
                result.add(lng);
                wdth -= lng;
                lng -= lng;
            }
        }
        return result;
    }
}
