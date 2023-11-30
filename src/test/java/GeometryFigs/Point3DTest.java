package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    public void testDefaultConstructor() {
        Point3D point3D = new Point3D();
        assertEquals(3, point3D.getDim());
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, point3D.getX());
    }

    @Test
    public void testParameterizedConstructor() {
        double[] values = {1.0, 2.0, 3.0};
        Point3D point3D = new Point3D(values);
        assertEquals(3, point3D.getDim());
        assertArrayEquals(values, point3D.getX());
    }

    @Test
    public void testCrossProdStatic() {
        Point3D p1 = new Point3D(new double[]{1.0, 2.0, 3.0});
        Point3D p2 = new Point3D(new double[]{4.0, 5.0, 6.0});
        Point3D result = Point3D.cross_prod(p1, p2);
        assertArrayEquals(new double[]{-3.0, 6.0, -3.0}, result.getX());
    }

    @Test
    public void testCrossProdInstance() {
        Point3D p1 = new Point3D(new double[]{1.0, 2.0, 3.0});
        Point3D p2 = new Point3D(new double[]{4.0, 5.0, 6.0});
        Point3D result = p1.cross_prod(p2);
        assertArrayEquals(new double[]{-3.0, 6.0, -3.0}, result.getX());
    }

    @Test
    public void testMixProdStatic() {
        Point3D p1 = new Point3D(new double[]{1.0, 2.0, 3.0});
        Point3D p2 = new Point3D(new double[]{4.0, 5.0, 6.0});
        Point3D p3 = new Point3D(new double[]{7.0, 8.0, 9.0});
        double result = Point3D.mix_prod(p1, p2, p3);
        assertEquals(0.0, result);
    }

    @Test
    public void testMixProdInstance() {
        Point3D p1 = new Point3D(new double[]{1.0, 2.0, 3.0});
        Point3D p2 = new Point3D(new double[]{4.0, 5.0, 6.0});
        Point3D p3 = new Point3D(new double[]{7.0, 8.0, 9.0});
        double result = p1.mix_prod(p2, p3);
        assertEquals(0.0, result);
    }
}