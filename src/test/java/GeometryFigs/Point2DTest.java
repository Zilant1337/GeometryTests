package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    public void testDefaultConstructor() {
        Point2D point2D = new Point2D();
        assertEquals(2, point2D.getDim());
        assertArrayEquals(new double[]{0.0, 0.0}, point2D.getX());
    }

    @Test
    public void testParameterizedConstructor() {
        double[] values = {1.0, 2.0};
        Point2D point2D = new Point2D(values);
        assertEquals(2, point2D.getDim());
        assertArrayEquals(values, point2D.getX());
    }

    @Test
    public void testRotStatic() {
        Point2D p = new Point2D(new double[]{1.0, 0.0});
        Point2D result = Point2D.rot(p, Math.PI / 2);
        assertArrayEquals(new double[]{0.0, 1.0}, result.getX(), 1e-10);
    }

    @Test
    public void testRotInstance() {
        Point2D p = new Point2D(new double[]{1.0, 0.0});
        Point2D result = p.rot(Math.PI / 2);
        assertArrayEquals(new double[]{0.0, 1.0}, result.getX(), 1e-10);
    }
}