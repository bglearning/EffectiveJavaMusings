package ejm.chapter07.item39;

/**
 * Immutable line between two points.
 */
public class Line {

	private Point start;

	private Point end;

	public Line(Point start, Point end) {
		this.start = new Point(start.getX(), start.getY());
		this.end = new Point(end.getX(), end.getY());

		if (start.equals(end)) {
			throw new IllegalArgumentException(String.format("Start: %s and end: %s are same points", start, end));
		}

	}

	public Point start() {
		return new Point(start.getX(), start.getY());
	}

	public Point end() {
		return new Point(end.getX(), end.getY());
	}

	@Override
	public String toString() {
		return String.format("Line from %s to %s", start, end);
	}
}
