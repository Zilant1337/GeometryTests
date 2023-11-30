package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testConstructor() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        Rectangle rectangle= new Rectangle(points);

        assertEquals(4, rectangle.getN());
        for (int i=0;i<rectangle.getN();i++){
            assertArrayEquals(points[i].getX(),rectangle.getP()[i].getX());
        }
    }
    @Test
    void testSquare() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        Rectangle rectangle= new Rectangle(points);

        assertEquals(4,rectangle.square(),1e-10);
    }

    @Test
    void testToString() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        Rectangle rectangle= new Rectangle(points);
        assertEquals("Rectangle: {(0.0,0.0);(2.0,0.0);(2.0,2.0);(0.0,2.0)}",rectangle.toString());
    }
}