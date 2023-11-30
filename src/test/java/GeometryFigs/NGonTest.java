package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NGonTest {
    @Test
    public void testConstructorAndGetters() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        NGon nGon = new NGon(points);
        assertEquals(3, nGon.getN());
        assertArrayEquals(points[0].getX(), nGon.getP()[0].getX(), 1e-10);
        assertArrayEquals(points[1].getX(), nGon.getP()[1].getX(), 1e-10);
        assertArrayEquals(points[2].getX(), nGon.getP()[2].getX(), 1e-10);

        assertArrayEquals(new Point2D(new double[]{3.0, 4.0}).getX(), nGon.getP()[1].getX(), 1e-10);
    }

    @Test
    public void testSetters() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        NGon nGon = new NGon(points);

        Point2D[] newPoints = {new Point2D(new double[]{7.0, 8.0}), new Point2D(new double[]{9.0, 10.0})};
        nGon.setP(newPoints);
        assertEquals(2, nGon.getN());
        assertArrayEquals(newPoints[0].getX(), nGon.getP()[0].getX(), 1e-10);
        assertArrayEquals(newPoints[1].getX(), nGon.getP()[1].getX(), 1e-10);

        Point2D newPoint = new Point2D(new double[]{11.0, 12.0});
        nGon.setP(newPoint, 1);
        assertArrayEquals(newPoint.getX(), nGon.getP()[1].getX(), 1e-10);
    }

    @Test
    public void testSquareWithTriangle() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 0.0}), new Point2D(new double[]{3.0, 4.0})};
        NGon nGon = new NGon(points);
        assertEquals(6.0, nGon.square(), 1e-10);
    }

    @Test
    public void testSquareWithQuad() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 0.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{0.0, 4.0})};
        NGon nGon = new NGon(points);
        assertEquals(12.0, nGon.square(), 1e-10);
    }

    @Test
    public void testSquareWithPentagon() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 0.0}), new Point2D(new double[]{3.0, 4.0}),
                new Point2D(new double[]{1.5, 7.0}), new Point2D(new double[]{0.0, 4.0})};
        NGon nGon = new NGon(points);
        assertEquals(16.5, nGon.square(), 1e-10);
    }

    @Test
    public void testLength() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 0.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{0.0, 4.0})};
        NGon nGon = new NGon(points);
        assertEquals(14.0, nGon.length(), 1e-10);
    }

    @Test
    public void testShift() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0})};
        NGon nGon = new NGon(points);

        Point2D shiftVector = new Point2D(new double[]{5.0, 6.0});
        NGon shiftedNGon = (NGon) nGon.shift(shiftVector);

        Point2D[] expectedPoints = {new Point2D(new double[]{6.0, 8.0}), new Point2D(new double[]{8.0, 10.0})};
        assertArrayEquals(expectedPoints[0].getX(), shiftedNGon.getP()[0].getX(), 1e-10);
        assertArrayEquals(expectedPoints[1].getX(), shiftedNGon.getP()[1].getX(), 1e-10);
    }

    @Test
    public void testRot() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0})};
        NGon nGon = new NGon(points);

        NGon rotatedNGon = (NGon) nGon.rot(Math.PI / 2);

        Point2D[] expectedPoints = {new Point2D(new double[]{-2.0, 1.0}), new Point2D(new double[]{-4.0, 3.0})};
        assertArrayEquals(expectedPoints[0].getX(), rotatedNGon.getP()[0].getX(), 1e-10);
        assertArrayEquals(expectedPoints[1].getX(), rotatedNGon.getP()[1].getX(), 1e-10);
    }

    @Test
    public void testSymAxis() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{4.0, 5.0})};
        NGon nGon = new NGon(points);

        NGon symAxisNGon = (NGon) nGon.symAxis(1);

        Point2D[] expectedPoints = {new Point2D(new double[]{-1.0, 2.0}), new Point2D(new double[]{-3.0, 4.0}), new Point2D(new double[]{-4.0, 5.0})};

        assertArrayEquals(expectedPoints[0].getX(), symAxisNGon.getP()[0].getX(), 1e-10);
        assertArrayEquals(expectedPoints[1].getX(), symAxisNGon.getP()[1].getX(), 1e-10);
        assertArrayEquals(expectedPoints[2].getX(), symAxisNGon.getP()[2].getX(), 1e-10);
    }

    @Test
    public void testCross() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 0.0}), new Point2D(new double[]{1.5, 2.0})};
        NGon nGon = new NGon(points);

        Segment intersectingSegment = new Segment(new Point2D(new double[]{1.0, 1.0}), new Point2D(new double[]{2.0, 3.0}));

        assertTrue(nGon.cross(intersectingSegment));

        Segment nonIntersectingSegment = new Segment(new Point2D(new double[]{4.0, 4.0}), new Point2D(new double[]{5.0, 5.0}));

        assertFalse(nGon.cross(nonIntersectingSegment));
    }

    @Test
    public void testToString() {
        Point2D[] points = {new Point2D(new double[]{1.0, 2.0}), new Point2D(new double[]{3.0, 4.0}), new Point2D(new double[]{5.0, 6.0})};
        NGon nGon = new NGon(points);
        assertEquals("Polygon: {(1.0,2.0);(3.0,4.0);(5.0,6.0)}", nGon.toString());

    }
}