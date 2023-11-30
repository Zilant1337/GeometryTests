package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolylineTest {

    @Test
    public void testConstructorAndGetters() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        Polyline polyline = new Polyline(points);
        assertEquals(3, polyline.getN());
        assertArrayEquals(points, polyline.getP());
        double expectedX=3.0;
        double expectedY=4.0;
        assertEquals(expectedX, polyline.getP(1).getX()[0],1e-10);
        assertEquals(expectedY, polyline.getP(1).getX()[1],1e-10);
    }

    @Test
    public void testSetters() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        Polyline polyline = new Polyline(points);

        Point2D[] newPoints = {new Point2D(new double[]{7.0, 8.0}), new Point2D(new double[]{9.0, 10.0})};
        polyline.setP(newPoints);
        assertEquals(2, polyline.getN());
        assertArrayEquals(newPoints, polyline.getP());

        Point2D newPoint = new Point2D(new double[]{11.0, 12.0});
        polyline.setP(newPoint, 1);
        assertEquals(newPoint, polyline.getP(1));
    }

    @Test
    public void testLength() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{6.0, 0.0})};
        Polyline polyline = new Polyline(points);
        assertEquals(10.0, polyline.length(), 1e-10);
    }

    @Test
    public void testShift() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0})};
        Polyline polyline = new Polyline(points);

        Point2D shiftVector = new Point2D(new double[]{5.0, 6.0});
        Polyline shiftedPolyline = polyline.shift(shiftVector);

        Point2D[] expectedPoints = {new Point2D(new double[]{6.0, 8.0}), new Point2D(new double[]{8.0, 10.0})};
        assertArrayEquals(expectedPoints[0].getX(), shiftedPolyline.getP()[0].getX(),1e-10);
        assertArrayEquals(expectedPoints[1].getX(), shiftedPolyline.getP()[1].getX(),1e-10);
    }

    @Test
    public void testRot() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0})};
        Polyline polyline = new Polyline(points);

        Polyline rotatedPolyline = polyline.rot(Math.PI / 2);

        Point2D[] expectedPoints = {new Point2D(new double[]{-2.0, 1.0}), new Point2D(new double[]{-4.0, 3.0})};
        assertArrayEquals(expectedPoints[0].getX(), rotatedPolyline.getP()[0].getX(),1e-10);
        assertArrayEquals(expectedPoints[1].getX(), rotatedPolyline.getP()[1].getX(),1e-10);
    }

    @Test
    public void testSymAxis() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0})};
        Polyline polyline = new Polyline(points);

        Polyline symAxisPolyline = polyline.symAxis(1);

        Point2D[] expectedPoints = {new Point2D(new double[]{-1.0, 2.0}), new Point2D(new double[]{-3.0, 4.0})};
        assertArrayEquals(expectedPoints[0].getX(), symAxisPolyline.getP()[0].getX(),1e-10);
        assertArrayEquals(expectedPoints[1].getX(), symAxisPolyline.getP()[1].getX(),1e-10);
    }

    @Test
    public void testCross() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{6.0, 0.0})};
        Polyline polyline = new Polyline(points);

        Segment segment = new Segment(new Point2D(new double[]{2.0, 2.0}), new Point2D(new double[]{4.0, 4.0}));

        assertTrue(polyline.cross(segment));
    }

    @Test
    public void testToString() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        Polyline polyline = new Polyline(points);
        assertEquals("Polyline: [(1.0,2.0);(3.0,4.0);(5.0,6.0)]", polyline.toString());
    }
}