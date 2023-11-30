package GeometryFigs;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    public void testGetDim() {
        Point point = new Point(3);
        assertEquals(3, point.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testGetX() {
        double[] values = {1.0, 2.0, 3.0};
        Point point = new Point(3, values);
        assertArrayEquals(values, point.getX());
    }

    @org.junit.jupiter.api.Test
    public void testSetX() {
        double[] values = {1.0, 2.0, 3.0};
        Point point = new Point(3);
        point.setX(values);
        assertArrayEquals(values, point.getX());
    }

    @org.junit.jupiter.api.Test
    public void testSetXAtIndex() {
        Point point = new Point(3);
        point.setX(2.0, 1);
        assertEquals(2.0, point.getX()[1]);
    }

    @org.junit.jupiter.api.Test
    public void testAbs() {
        double[] values = {3.0, 4.0};
        Point point = new Point(2, values);
        assertEquals(5.0, point.abs());
    }

    @org.junit.jupiter.api.Test
    public void testAddStatic() {
        Point a = new Point(2, new double[]{1.0, 2.0});
        Point b = new Point(2, new double[]{3.0, 4.0});
        Point result = Point.add(a, b);
        assertArrayEquals(new double[]{4.0, 6.0}, result.getX());
        assertEquals(2, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testAddInstance() {
        Point a = new Point(2, new double[]{1.0, 2.0});
        Point b = new Point(2, new double[]{3.0, 4.0});
        Point result = a.add(b);
        assertArrayEquals(new double[]{4.0, 6.0}, result.getX());
        assertEquals(2, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testSubStatic() {
        Point a = new Point(2, new double[]{5.0, 8.0});
        Point b = new Point(2, new double[]{2.0, 3.0});
        Point result = Point.sub(a, b);
        assertArrayEquals(new double[]{3.0, 5.0}, result.getX());
        assertEquals(2, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testSubInstance() {
        Point a = new Point(2, new double[]{5.0, 8.0});
        Point b = new Point(2, new double[]{2.0, 3.0});
        Point result = a.sub(b);
        assertArrayEquals(new double[]{3.0, 5.0}, result.getX());
        assertEquals(2, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testMultStatic() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        double r = 2.0;
        Point result = Point.mult(a, r);
        assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result.getX());
        assertEquals(3, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testMultInstance() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        double r = 2.0;
        Point result = a.mult(r);
        assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result.getX());
        assertEquals(3, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testMultDotProductStatic() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        Point b = new Point(3, new double[]{4.0, 5.0, 6.0});
        double result = Point.mult(a, b);
        assertEquals(32.0, result);
    }

    @org.junit.jupiter.api.Test
    public void testMultDotProductInstance() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        Point b = new Point(3, new double[]{4.0, 5.0, 6.0});
        double result = a.mult(b);
        assertEquals(32.0, result);
    }

    @org.junit.jupiter.api.Test
    public void testSymAxisStatic() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        Point result = Point.symAxis(a, 1);
        assertArrayEquals(new double[]{-1.0, 2.0, -3.0}, result.getX());
        assertEquals(3, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testSymAxisInstance() {
        Point a = new Point(3, new double[]{1.0, 2.0, 3.0});
        Point result = a.symAxis(1);
        assertArrayEquals(new double[]{-1.0, 2.0, -3.0}, result.getX());
        assertEquals(3, result.getDim());
    }

    @org.junit.jupiter.api.Test
    public void testToString() {
        Point point = new Point(3, new double[]{1.0, 2.0, 3.0});
        assertEquals("(1.0,2.0,3.0)", point.toString());
    }
}