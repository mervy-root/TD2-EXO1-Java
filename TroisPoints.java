public class TroisPoints {
    private Point point1;
    private Point point2;
    private Point point3;

    // Getters & Setters
    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public Point getPoint3() {
        return this.point3;
    }

    public void setPoint1(Point point) {
        this.point1 = point;
    }

    public void setPoint2(Point point) {
        this.point2 = point;
    }

    public void setPoint3(Point point) {
        this.point3 = point;
    }

    // Constructeur avec trois parametres
    public TroisPoints(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    // 8. sontAlignes()
    public boolean sontAlignes() {
        if (this.point1.calculerDistance(this.point2) == (this.point1.calculerDistance(this.point3)
                + this.point3.calculerDistance(this.point2))) {
            return true;
        } else if (this.point1.calculerDistance(this.point3) == (this.point1.calculerDistance(this.point2)
                + this.point2.calculerDistance(this.point3))) {
            return true;
        } else if (this.point2.calculerDistance(this.point3) == (this.point2.calculerDistance(this.point1)
                + this.point1.calculerDistance(this.point3))) {
            return true;
        }
        return false;
    }

    // 9. estIsocele()
    public boolean estIsocele() {
        if (sontAlignes()) { // un triangle ne peut pas se trouver sur la meme ligne
            return false;
        }
        if (this.point1.calculerDistance(this.point2) == this.point2.calculerDistance(this.point3)) {
            return true;
        } else if (this.point1.calculerDistance(this.point3) == this.point3.calculerDistance(this.point2)) {
            return true;
        } else if (this.point2.calculerDistance(this.point1) == this.point1.calculerDistance(this.point3)) {
            return true;
        }
        return false;
    }
}
