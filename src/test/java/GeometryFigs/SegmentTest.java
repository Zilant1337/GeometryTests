package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegmentTest {
    @Test
    public void testConstructorAndGetters() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 4.0})};
        Segment segment= new Segment(points[0],points[1]);
        assertArrayEquals(points[0].getX(),segment.getStart().getX(),1e-10);
        assertArrayEquals(points[1].getX(),segment.getFinish().getX(),1e-10);

        assertArrayEquals(new double[]{0.0,0.0},segment.getStart().getX(),1e-10);
        assertArrayEquals(new double[]{3.0,4.0},segment.getStart().getX(),1e-10);
    }

    @Test
    public void testSetters() {
        Point2D[] points = {new Point2D(new double[]{0.0, 0.0}), new Point2D(new double[]{3.0, 4.0})};
        Segment segment= new Segment(points[0],points[1]);
    }

    @Test
    void getStart() {
    }

    @Test
    void setStart() {
    }

    @Test
    void getFinish() {
    }

    @Test
    void setFinish() {
    }

    @Test
    void length() {
    }

    @Test
    void shift() {
    }

    @Test
    void rot() {
    }

    @Test
    void symAxis() {
    }

    @Test
    void cross() {
    }

    @Test
    void counterclockwise() {
    }

    @Test
    void testToString() {
    }
}