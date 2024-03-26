/**
 * Assign7Test.java
 * Simple, incomplete testing file for Assignment 7, Winter 2024 version.
 *
 * by R. Heise
 * 25 March 2024
 */
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class Assign7Test {

    @Test
    void printTrianglesTestSize5() {
        //Set up the capture of the output, from standard out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        //Here is the actual test starting
        Assign7 tester = new Assign7();
        tester.printTriangles(5); //Output being captured in outContent
        String expResult =
                        "    *\r\n" +
                        "   * *\r\n" +
                        "  * * *\r\n" +
                        " * * * *\r\n" +
                        "* * * * *\r\n" +
                        "\r\n" +
                        "   *\r\n" +
                        "  * *\r\n" +
                        " * * *\r\n" +
                        "* * * *\r\n" +
                        "\r\n" +
                        "  *\r\n" +
                        " * *\r\n" +
                        "* * *\r\n" +
                        "\r\n" +
                        " *\r\n" +
                        "* *\r\n" +
                        "\r\n" +
                        "*\r\n";
        System.setOut(originalOut);  //Restore standard output
        assertEquals(expResult, outContent.toString());
    }

    @Test
    void printTrianglesTestSize1() {
        //Set up the capture of the output, from standard out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        //Here is the actual test starting
        Assign7 tester = new Assign7();
        tester.printTriangles(1); //Output being captured in outContent
        String expResult =
                        "*\r\n";
        System.setOut(originalOut);  //Restore standard output
        assertEquals(expResult, outContent.toString());
    }

    @Test
    void printTrianglesTestSizeNeg1() {
        //Set up the capture of the output, from standard out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        //Here is the actual test starting
        Assign7 tester = new Assign7();
        tester.printTriangles(-1); //Output being captured in outContent
        String expResult = "Size too small\r\n";
        System.setOut(originalOut);  //Restore standard output
        assertEquals(expResult.toLowerCase(), outContent.toString().toLowerCase());
    }

    @Test
    void posBeforeNegTest() {
        int[] arr = {-3, 0, -5, 8, 12, 13, -2, -4, 9, 14, 18, 0};
        System.out.println("Test posBeforeNeg");
        Assign7 tester = new Assign7();
        int[] expectedResult = {18, 0, 14, 8, 12, 13, 9, -4, -2, -5, -3, 0};
        tester.posBeforeNeg(arr);
        assertArrayEquals(expectedResult, arr);
    }
}