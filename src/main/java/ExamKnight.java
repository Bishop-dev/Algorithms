import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by Sashko on 4/15/17.
 */
public class ExamKnight {
// 4,5=3 - 1,0=3, 3,1=2, 3,2=3
    private final int destX = 3;
    private final int destY = 2;
    private final List<Point> graph = new ArrayList<>();

    public static void main(String[] args) {
        final ExamKnight obj = new ExamKnight();
        obj.run();
    }

    private void run() {
        final Queue<Point> queue = new LinkedList<>();
        final List<Point> path = new ArrayList<>();
        final Map<Point, Point> childToParent = new HashMap<>();

        final Point startPoint = fillGraph();
        final Point dest = extractPoint(destX,destY);
        queue.add(startPoint);
        startBFS(queue, new Action(childToParent, dest));

        int steps = 0;
        Point parent = childToParent.get(dest);
        while (parent!=null) {
            steps++;
            path.add(parent);

            parent = childToParent.get(parent);
        }
        System.out.println(steps);
        path.forEach(System.out::println);
    }

    static class Action {
        private Map<Point, Point> childToParent;

        private Point currentParent;
        private Point destPoint;

        public Action(Map<Point, Point> childToParent, Point destPoint){
            this.childToParent = childToParent;
            this.destPoint = destPoint;
        }

        public void onParent(Point point) {
            currentParent = point;
        }

        public boolean onChild(Point point) {
            childToParent.put(point,currentParent);
            return destPoint.equals(point);
        }
    }

    private void startBFS(final Queue<Point> queue, Action action) {
        while (!queue.isEmpty()) {
            final Point point = queue.poll();
            action.onParent(point);
            point.setVisited(true);

            for (final Point p: point.getNextPoints()) {
                if (!p.isVisited()) {
                    queue.add(p);
                    if (action.onChild(p)) {
                        queue.clear();
                        break;
                    }
                }
            }
        }
    }

    private Point fillGraph() {
        for (int x = 0; x < destX + 3; x++) {
            for (int y = 0; y < destY + 3; y++) {
                graph.add(new Point(x, y));
            }
        }
        graph.forEach(this::fillNextPoints);
        return graph.get(0);
    }

    private Point extractPoint(final int x, final int y) {
        final int index = graph.indexOf(new Point(x, y));
        return graph.get(index);
    }

    private void fillNextPoints(final Point point) {
        if (isValidCoordinates(point.getX() + 1, point.getY() + 2)) {
            point.getNextPoints().add(extractPoint(point.getX() + 1, point.getY() + 2));
        }
        if (isValidCoordinates(point.getX() + 2, point.getY() + 1)) {
            point.getNextPoints().add(extractPoint(point.getX() + 2, point.getY() + 1));
        }
        if (isValidCoordinates(point.getX() + 1, point.getY() - 2)) {
            point.getNextPoints().add(extractPoint(point.getX() + 1, point.getY() - 2));
        }
        if (isValidCoordinates(point.getX() + 2, point.getY() - 1)) {
            point.getNextPoints().add(extractPoint(point.getX() + 2, point.getY() - 1));
        }
        if (isValidCoordinates(point.getX() - 1, point.getY() - 2)) {
            point.getNextPoints().add(extractPoint(point.getX() - 1, point.getY() - 2));
        }
        if (isValidCoordinates(point.getX() - 2, point.getY() - 1)) {
            point.getNextPoints().add(extractPoint(point.getX() - 2, point.getY() - 1));
        }
        if (isValidCoordinates(point.getX() - 1, point.getY() + 2)) {
            point.getNextPoints().add(extractPoint(point.getX() - 1, point.getY() + 2));
        }
        if (isValidCoordinates(point.getX() - 2, point.getY() + 1)) {
            point.getNextPoints().add(extractPoint(point.getX() - 2, point.getY() + 1));
        }
    }

    private boolean isValidCoordinates(final int x, final int y) {
        return x >= 0 && y >= 0 && x <= destX + 3 && y <= destY +3 && graph.indexOf(new Point(x, y)) != -1;
    }

    static class Point {
        private int x;
        private int y;
        private boolean visited;
        private List<Point> nextPoints = new ArrayList<>();

        public Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        public Point(final int x, final int y, final boolean visited) {
            this.x = x;
            this.y = y;
            this.visited = visited;
        }

        public int getX() {
            return x;
        }

        public void setX(final int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(final int y) {
            this.y = y;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(final boolean visited) {
            this.visited = visited;
        }

        public List<Point> getNextPoints() {
            return nextPoints;
        }

        public void setNextPoints(final List<Point> nextPoints) {
            this.nextPoints = nextPoints;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final Point point = (Point) o;

            if (x != point.x) return false;
            return y == point.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", visited=" + visited +
                    '}';
        }
    }

}
