package ejm.chapter04.item14;

public class PointAndTime {
    public static void main(String[] args) {
        Point point = new Point(10.6d, 11.0d);

        System.out.println(String.format("x: %.4f, y: %.4f", point.getX(), point.getY()));
        point.setX(-0.2d);
        point.setY(0.2d);
        System.out.println(String.format("x: %.4f, y: %.4f", point.getX(), point.getY()));

        Time time = new Time(12, 55);
        System.out.println("Time: " + time.hour + ":" + time.minute);
    }
}
