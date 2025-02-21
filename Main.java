import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TroisPoints troisPoints = new TroisPoints(null, null, null);
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        Point point3 = new Point(0, 0);

        System.out.println("Saisissez les coordonnees de trois points: ");
        point1.saisirPoint();
        troisPoints.setPoint1(point1);
        System.out.println("");

        point2.saisirPoint();
        troisPoints.setPoint2(point2);
        System.out.println("");

        point3.saisirPoint();
        troisPoints.setPoint3(point3);
        System.out.println("");

        /*
         * System.out.println("Point 1: ");
         * point1.setAbs(scanner.nextDouble());
         * point1.setOrd(scanner.nextDouble());
         * System.out.println(point1);
         * troisPoints.setPoint1(point1);
         * 
         * System.out.println("Point 2: ");
         * point2.setAbs(scanner.nextDouble());
         * point2.setOrd(scanner.nextDouble());
         * System.out.println(point2);
         * troisPoints.setPoint2(point2);
         * 
         * System.out.println("Point 3: ");
         * point3.setAbs(scanner.nextDouble());
         * point3.setOrd(scanner.nextDouble());
         * System.out.println(point3);
         * troisPoints.setPoint3(point3);
         */
        System.out.println("----------------------------MILIEU & DISTANCE------------------------");
        System.out
                .println(troisPoints.getPoint1().toString(1) + ", " + troisPoints.getPoint2().toString(2)
                        + " \nMilieu: " + troisPoints.getPoint1().calculerMilieu(troisPoints.getPoint2())
                        + " Distance: d=" + String.format("%.2f", point1.calculerDistance(point2)));
        separateur();
        System.out
                .println(troisPoints.getPoint1().toString(1) + ", " + troisPoints.getPoint3().toString(3)
                        + "\nMilieu: " + troisPoints.getPoint1().calculerMilieu(troisPoints.getPoint3())
                        + " Distance: d=" + String.format("%.2f", point1.calculerDistance(point3)));
        separateur();
        System.out
                .println(troisPoints.getPoint2().toString(2) + ", " + troisPoints.getPoint3().toString(3)
                        + " \nMilieu: " + troisPoints.getPoint2().calculerMilieu(troisPoints.getPoint3())
                        + " Distance: d=" + String.format("%.2f", point2.calculerDistance(point3)));
        separateur();
        /*
         * System.out.println("Milieu du point " + troisPoints.getPoint1()
         * + " et du point " + troisPoints.getPoint2() + " est: "
         * + troisPoints.getPoint1().calculerMilieu(troisPoints.getPoint2()));
         * 
         * System.out.println("Milieu du point " + troisPoints.getPoint2()
         * + " et du point " + troisPoints.getPoint3() + " est: "
         * + troisPoints.getPoint2().calculerMilieu(troisPoints.getPoint3()));
         * 
         * System.out.println("Milieu du point " + troisPoints.getPoint1()
         * + " et du point " + troisPoints.getPoint3() + " est: "
         * + troisPoints.getPoint1().calculerMilieu(troisPoints.getPoint3()));
         */
        System.out.println("");
        /*
         * System.out.println(
         * "----------------------------DISTANCE------------------------");
         * System.out.println(
         * "Distance entre: " + point1.toString() + " et " + point2 + "est: " +
         * point1.calculerDistance(point2));
         * System.out.println(
         * "Distance entre: " + point2.toString() + " et " + point3 + "est: " +
         * point2.calculerDistance(point3));
         * System.out.println(
         * "Distance entre: " + point1.toString() + " et " + point3 + "est: " +
         * point1.calculerDistance(point3));
         */
        System.out.println("-----------------------------ALIGNES? || TRIANGLE ISOCELE ?------------------------------");
        System.out.println(troisPoints.getPoint1().toString(1) + ", " + troisPoints.getPoint2().toString(2) + " et "
                + troisPoints.getPoint3().toString(3) + " \n Alignes ? " + troisPoints.sontAlignes());
        separateur();
        System.out.println(troisPoints.getPoint1().toString(1) + ", " + troisPoints.getPoint2().toString(2) + " et "
                + troisPoints.getPoint3().toString(3) + " \n Forment un triangle isocele ? "
                + troisPoints.estIsocele());
        separateur();
        scanner.close();
    }

    public static void separateur() {
        System.out.println("---------------------------------------------------------------------------------");
    }
}
