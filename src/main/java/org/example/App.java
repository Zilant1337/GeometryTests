package org.example;

import GeometryFigs.Point2D;
import GeometryFigs.Polyline;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{6.0, 0.0})};
        Polyline polyline = new Polyline(points);
        System.out.println(polyline.length());

    }
}
