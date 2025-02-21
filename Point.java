
//import java.math.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Point {
    private double abs;
    private double ord;

    Scanner scanner = new Scanner(System.in);

    // 2. Getters & Setters
    public double getAbs() {
        return this.abs;
    }

    public double getOrd() {
        return this.ord;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    // 3. toString()
    public String toString() {
        String str = new String();
        str = "Point: (" + this.abs + ", " + this.ord + ")";
        return str;
    }

    public String toString(int position) { // 1 = pointA, 2 = pointB, 3 = pointC
        String str = new String();
        char ch;
        switch (position) {
            case 1:
                ch = 'A';
                break;
            case 2:
                ch = 'B';
                break;
            case 3:
                ch = 'C';
                break;
            default:
                ch = '?';
                break;
        }
        str = "Point" + ch + ": (" + this.abs + ", " + this.ord + ")";
        return str;
    }

    // 4. Constructeur Point(double abs, double ord)
    public Point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    // 5. calculerDistance(Point p)
    public double calculerDistance(Point p) {
        double distance = Math.sqrt(Math.pow((this.abs - p.abs), 2) + Math.pow((this.ord - p.ord), 2));
        return distance;
    }
    /*
     * public double calculerDistance(Point p, int nbreChiffreApresVirgule) {
     * double distance = Math.sqrt(Math.pow((this.abs - p.abs), 2) +
     * Math.pow((this.ord - p.ord), 2));
     * DecimalFormat df = new DecimalFormat("#.00");
     * return distance;
     * }
     */

    // 6. calculerMilieu(Point p)
    public Point calculerMilieu(Point p) {
        Point Milieu = new Point(0, 0);
        Milieu.setAbs((this.abs + p.abs) / (double) 2);
        Milieu.setOrd((this.ord + p.ord) / (double) 2);
        return Milieu;
    }

    // saisirPoint()
    public void saisirPoint() {
        System.out.println("Entrer l'abscisse du point: ");
        this.abs = scanner.nextDouble();
        System.out.println("Entrer l'ordonnee du point: ");
        this.ord = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(this);
    }
}