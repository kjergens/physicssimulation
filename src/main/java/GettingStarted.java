//package main.java;

import org.opensourcephysics.display.Trail;
import org.opensourcephysics.frames.PlotFrame;

import java.awt.Color;

/**
 * Introduction to Open Source Physics and JUnit test.
 */
public class GettingStarted {
    public static void main(String[] args) {
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
        plotFrame.append(0, 1, 1);
        plotFrame.append(0, 0, 0);
        plotFrame.append(1, 2, 2); // a different datasetIndex creates a new line
        plotFrame.append(1, 3, 3); // a different datasetIndex creates a new line

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
