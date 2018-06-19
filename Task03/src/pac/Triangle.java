package pac;


public class Triangle {
    Point p1, p2, p3;

    Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public static double side(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }

    public static boolean isTriangle(Point p1, Point p2, Point p3) {
        if (side(p1, p2) + side(p2, p3) > side(p1, p3) && side(p1, p2) + side(p1, p3) > side(p2, p3) && side(p1, p3) + side(p2, p3) > side(p1, p2)) {
            return true;
        } else return false;
    }

    public static boolean isRectangular(Point p1, Point p2, Point p3) {
        double side1 = side(p1, p2);
        double side2 = side(p1, p3);
        double side3 = side(p2, p3);
        double hypotenuse = side1, catheter1 = side2, catheter2 = side3;
        if (side2 > side1) {
            hypotenuse = side2;
            catheter1 = side1;
            catheter2 = side3;
        } else if (side3 > side1) {
            hypotenuse = side3;
            catheter1 = side1;
            catheter2 = side3;
        } else if (side2 > side1 && side3 > side1)
            if (side3 > side2) {
                hypotenuse = side3;
                catheter1 = side1;
                catheter2 = side2;
            } else {
                hypotenuse = side2;
                catheter1 = side1;
                catheter2 = side3;
            }
        if (isTriangle(p1, p2, p3) && (Math.round(Math.pow(hypotenuse, 2)) == Math.round(Math.pow(catheter1, 2) + Math.pow(catheter2, 2)))) {
            return true;
        } else return false;
    }

}

class Point {
    private int x, y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
