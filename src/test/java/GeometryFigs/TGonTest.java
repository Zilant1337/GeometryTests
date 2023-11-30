package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TGonTest {
    @Test
    void testConstructor() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{1.5,3.0})};
        TGon tGon= new TGon(points);

        assertEquals(3, tGon.getN());
        for (int i=0;i<tGon.getN();i++){
            assertArrayEquals(points[i].getX(),tGon.getP()[i].getX());
        }
    }

    @Test
    void square() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{1.5,3.0})};
        TGon tGon= new TGon(points);

        assertEquals(4.5,tGon.square(),1e-10);
    }

    @Test
    void testToString() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{3.0,0.0}),new Point2D(new double[]{1.5,3.0})};
        TGon tGon= new TGon(points);

        assertEquals("Triangle: {(0.0,0.0);(3.0,0.0);(1.5,3.0)}",tGon.toString());
    }
}