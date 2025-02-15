import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }

    private void printDateTime() {
        Date today = new Date();
        System.out.printf("Сьогодні %1$te %1$tB %1$tY, %1$tT\n", today);
    }

    private void run() {
        float a = -0.5f;
        float b = 1.7f;
        float t = 0.44f;

        double y = pow(Math.E, -b * t) * sin(a * t + b) - sqrt(abs(b * t + a));
        double s = b * sin(a * pow(t, 2) * cos(2 * t)) - 1;
        print(y, s);
    }

    private void print(double y, double s) {
        printDateTime();
        System.out.printf("y = %.2f\n", y);
        System.out.printf("s = %.2f\n", s);
    }
}