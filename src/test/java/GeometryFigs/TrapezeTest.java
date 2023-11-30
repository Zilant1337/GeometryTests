package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezeTest {
    @Test
    void testConstructor() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{1.0,2.0})};
        Trapeze trapeze= new Trapeze(points);

        assertEquals(4, trapeze.getN());
        for (int i=0;i<trapeze.getN();i++){
            assertArrayEquals(points[i].getX(),trapeze.getP()[i].getX());
        }
    }

    @Test
    void square() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{1.0,2.0})};
        Trapeze trapeze= new Trapeze(points);

        assertEquals(4,trapeze.square(),1e-10);
    }

    @Test
    void testToString() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{1.0,2.0})};
        Trapeze trapeze= new Trapeze(points);
        assertEquals("Trapeze: {(0.0,0.0);(3.0,0.0);(2.0,2.0);(1.0,2.0)}",trapeze.toString());
    }
}