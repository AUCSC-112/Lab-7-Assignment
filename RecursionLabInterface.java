/*
 * AUCSC 112 Lab Interface required.
 * This file is intended for teaching purposes only.
 * by Rosanna Heise
 * March 25, 2024
 *
 * Main goals:  use recursion and interfaces.  No "for" or "while" keywords are allowed.
 *
 * Your file must implement this interface.  Thus if you are testing
 * the methods in your main you will need to access them using dot
 * notation on instances of your class.
 * For example, if your file is called "Assign7.java" then you would
 *   1)  create an instance:  Assign7 recMethods = new Assign7();
 *   2)  invoke a method:  recMethods.printTriangles(5);
 *
 * Interfaces do not work with static code, hence why the methods are not
 * static.
 *
 * No libraries may be imported.
 */

public interface RecursionLabInterface {
    /**
     * This method prints multiple triangles, using stars, to standard output.  The first triangle
     * is of the given size from the parameter, and each successive triangle is of one size
     * smaller, ending with a triangle of size one (a single star).  If the size is 0 or negative,
     * this will print "Size too small" and move to the next line.
     * E.g. if size is 5, the method will print:
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *
     *       *
     *      * *
     *     * * *
     *
     *      *
     *     * *
     *
     *     *
     *
     * @param size -- the number of lines in the first triangle AND the number
     *                of triangles (should be a positive integer)
     *
     * NOTE 1:  Every printed line ends with "\r\n" and there is a single
     * space between each star with no spaces at the end of any line.
     * Java's println automatically inserts "\r\n" for line endings.  Be
     * careful if you make explicit line breaks - you must add both
     * characters.  A single blank line (with "\r\n") is between each
     * set of triangles and there is no leading or ending blank line (though the
     * cursor ends at the beginning of the next line).
     *
     * Note 2:  The base of all triangles is at the left-hand side (with no spaces).
     *
     * NOTE 3:  This method is implemented recursively, with no loops.
     */
    public void printTriangles(int size);

    /**
     * This method will actually change the contents of anArray, so that all
     * positive integers precede all negative integers in the array.  Zeros, being
     * neither positive nor negative, do not move.  Note that the
     * order of the integers may not be maintained.  All swapping of elements
     * is done "in place" so that minimal extra space is used (in Θ(1)) and
     * with only one pass through the array (in Θ(n)).
     *
     * @param anArray -- the array that will change so that all positives come
     *                   before all negatives.  Zeros stay in their original location.
     *
     * NOTE 1: Null arrays, empty arrays, and arrays of size 1 should always remain
     * unchanged.
     *
     * NOTE 2: this method is implemented recursively, with no loops.  The
     * algorithm follows the idea of quicksort's in-place partitioning.
     */
    public void posBeforeNeg(int[] anArray);
}
