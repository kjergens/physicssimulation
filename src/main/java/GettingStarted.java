import java.awt.Color;

import org.dalton.polyfun.Polynomial;
import org.opensourcephysics.display.Trail;
import org.opensourcephysics.frames.PlotFrame;

/**
 * Introduction to Open Source Physics and JUnit test.
 */
public class GettingStarted {
    public static void main(String[] args) {
        /*
            Polynomial examples
            There are several ways to initialize a Polynomial. See all the constructors
            in the JavaDoc.
         */
        Polynomial fx = new Polynomial(new double[]{5, 1, 3}); // pass in the coefficients
        System.out.println("f(x) = " + fx);

        // Get a coefficient
        System.out.println("The coefficient for x^2 is: " + fx.getCoefficientAtTerm(2));  // term is the exponent of x
        System.out.println("The coefficient for x^1 is: " + fx.getCoefficientAtTerm(1));  // term is the exponent of x
        System.out.println("The coefficient for x^0 is: " + fx.getCoefficientAtTerm(0));  // term is the exponent of x

        // Evaluate the polynomial
        System.out.println("f(5) = " + fx.eval(5));
        
        /*
            Open Source Physics (OSP) Example
         */
        PlotFrame plotFrame = new PlotFrame("x", "y", "Plotting Examples");

        // Configure the plot frame.
        plotFrame.setSize(400, 400); // window size
        plotFrame.setPreferredMinMax(0, 10, 0, 15); // x and y ranges
        plotFrame.setDefaultCloseOperation(3);  // if you want closing the graph to end the program
        plotFrame.setVisible(true); // need this to show the graph, it is false by default

        // Plotting lines

        // OPTION 1: Append connected points
        plotFrame.setLineColor(0, Color.RED);   // optional set line color
        plotFrame.setConnected(true); // connect the points
        plotFrame.append(0, 1, fx.eval(1));
        plotFrame.append(0, 0, fx.eval(0));
        plotFrame.append(1, 2, fx.eval(2)); // a different datasetIndex creates a new line
        plotFrame.append(1, 3, fx.eval(3)); // a different datasetIndex creates a new line

        // OPTION 2: Add a Trail
        Trail trail = new Trail();
        plotFrame.addDrawable(trail); // add the trail to the plot frame
        trail.color = Color.BLUE;   // optional specify color
        trail.addPoint(0, 0);
        trail.addPoint(4, 3);
        trail.addPoint(8, 9);
        trail.addPoint(16, 18);
    }

    /**
     * Go to /test/GettingStartedTest.java to see how to test this method with Junit.
     *
     * @param a first num to add
     * @param b second num to add
     * @return the sum
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
