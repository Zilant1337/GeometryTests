package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void testConstructorAndGetters() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        assertArrayEquals(center.getX(), circle.getP().getX(), 1e-10);
        assertEquals(radius, circle.getR());
    }

    @Test
    public void testSetters() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        Point2D newCenter = new Point2D(new double[]{3.0, 4.0});
        double newRadius = 7.0;
        circle.setP(newCenter);
        circle.setR(newRadius);

        assertArrayEquals(newCenter.getX(), circle.getP().getX(), 1e-10);
        assertEquals(newRadius, circle.getR());
    }

    @Test
    public void testSquare() {
        Point2D center = new Point2D(new double[]{0.0, 0.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        assertEquals(Math.PI * radius * radius, circle.square(), 1e-10);
    }

    @Test
    public void testLength() {
        Point2D center = new Point2D(new double[]{0.0, 0.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        assertEquals(2 * Math.PI * radius, circle.length(), 1e-10);
    }

    @Test
    public void testShift() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        Point2D shiftVector = new Point2D(new double[]{5.0, 6.0});
        Circle shiftedCircle = (Circle) circle.shift(shiftVector);

        Point2D expectedCenter = new Point2D(new double[]{6.0, 8.0});
        assertArrayEquals(expectedCenter.getX(), shiftedCircle.getP().getX(), 1e-10);
    }

    @Test
    public void testRot() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        Circle rotatedCircle = (Circle) circle.rot(Math.PI / 2);

        Point2D expectedCenter = new Point2D(new double[]{-2.0, 1.0});
        assertArrayEquals(expectedCenter.getX(), rotatedCircle.getP().getX(), 1e-10);
    }

    @Test
    public void testSymAxis() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        Circle symAxisCircle = (Circle) circle.symAxis(1);

        Point2D expectedCenter = new Point2D(new double[]{-1.0, 2.0});
        assertArrayEquals(expectedCenter.getX(), symAxisCircle.getP().getX(), 1e-10);
    }

    @Test
    public void testCross() {
        Point2D center1 = new Point2D(new double[]{0.0, 0.0});
        double radius1 = 5.0;
        Circle circle1 = new Circle(center1, radius1);

        Point2D center2 = new Point2D(new double[]{8.0, 0.0});
        double radius2 = 3.0;
        Circle circle2 = new Circle(center2, radius2);

        Point2D center3 = new Point2D(new double[]{3.0, 0.0});
        double radius3 = 2.0;
        Circle circle3 = new Circle(center3, radius3);

        assertTrue(circle1.cross(circle2));

        assertFalse(circle1.cross(circle3));
    }

    @Test
    public void testToString() {
        Point2D center = new Point2D(new double[]{1.0, 2.0});
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        assertEquals("Circle: (Center:" + center.toString() + ";Radius:" + radius + ")", circle.toString());
    }
}