package ejm.chapter03.item08;

public class ColorPoint {

    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null) 
            throw new NullPointerException();

        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof ColorPoint)) 
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override
    public int hashCode() {
        return point.hashCode() * 33 + color.hashCode();
    }

    public static void main(String[] args) {
        ColorPoint redPointAtOrigin = new ColorPoint(0, 0, Color.RED);
        ColorPoint bluePointAtOrigin = new ColorPoint(0, 0, Color.BLUE);
        ColorPoint redPointAtRandomPoint = new ColorPoint(1, 6, Color.RED);
        ColorPoint anotherRedPointAtOrigin = new ColorPoint(0, 0, Color.RED);

        System.out.println(String.format("redPointAtOrigin == bluePointAtOrigin : %s", 
                                         redPointAtOrigin.equals(bluePointAtOrigin)));
        System.out.println(String.format("redPointAtOrigin == bluePointAtRandomPoint : %s", 
                                         redPointAtOrigin.equals(redPointAtRandomPoint)));
        System.out.println(String.format("redPointAtOrigin == anotherRedPointAtOrigin : %s", 
                                         redPointAtOrigin.equals(anotherRedPointAtOrigin)));

    }

}
