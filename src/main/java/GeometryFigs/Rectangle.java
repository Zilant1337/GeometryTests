package GeometryFigs;

public class Rectangle extends QGon {
    public Rectangle(Point2D[] p) { super(p); }
    @Override public double square() {
        return Point2D.sub(p[1], p[0]).abs() * Point2D.sub(p[2], p[1]).abs();
    }
    @Override public String toString()
    {
        StringBuilder sb = new StringBuilder(); sb.append("Rectangle: {");
        for (Point2D e : p)
        if (e != p[p.length - 1])
            sb.append(e.toString() + ";");
        else
            sb.append(e.toString());
        sb.append("}");
        return sb.toString();
    }
}
