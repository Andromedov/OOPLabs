import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }

    private double calculateY(double a, double b, double t) {
        double y = pow(Math.E, -b * t) * sin(a * t + b) - sqrt(abs(b * t + a));
        return y;
    }

    private double calculateS(double a, double b, double t) {
        double s = b * sin(a * pow(t, 2) * cos(2 * t)) - 1;
        return s;
    }

    private void printDateTime() {
        Date today = new Date();
        System.out.printf("Сьогодні %1$te %1$tB %1$tY, %1$tT\n", today);
    }

    private void run() {
        printDateTime();
        System.out.print("a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("t = ");
        double t = new Scanner(System.in).nextDouble();

        double y = calculateY(a, b, t);
        double s = calculateS(a, b, t);
        print(y, s);
    }

    private void print(double y, double s) {
        System.out.printf("y = %.2f\n", y);
        System.out.printf("s = %.2f\n", s);
    }
}