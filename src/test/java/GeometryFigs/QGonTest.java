package GeometryFigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QGonTest {
    @Test
    void testConstuctor(){
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        QGon qGon= new QGon(points);

        assertEquals(4, qGon.getN());
        for (int i=0;i<qGon.getN();i++){
            assertArrayEquals(points[i].getX(),qGon.getP()[i].getX());
        }
    }

    @Test
    void testSquare() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        QGon qGon= new QGon(points);

        assertEquals(4,qGon.square(),1e-10);
    }

    @Test
    void testToString() {
        Point2D[]points= new Point2D[]{new Point2D(new double[]{0.0,0.0}),new Point2D(new double[]{2.0,0.0}),new Point2D(new double[]{2.0,2.0}),new Point2D(new double[]{0.0,2.0})};
        QGon qGon= new QGon(points);

        assertEquals("Quadrilateral: {(0.0,0.0);(2.0,0.0);(2.0,2.0);(0.0,2.0)}",qGon.toString());
    }
}