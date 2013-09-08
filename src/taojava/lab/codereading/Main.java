package taojava.lab.codereading;

/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class Main {

    /**
     * Print some not-very-interesting output.
     */
    public static void main(String[] args) {
	java.io.PrintWriter pen = new java.io.PrintWriter(System.out, true);
	for (double i = 1; i < 10; i++) {
		pen.println(i/10 + " squared is " + MathUtils.square(i/10));
	} // for
    } // main(String[])
} // main
