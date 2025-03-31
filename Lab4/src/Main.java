import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String in = scanner.nextLine();

        System.out.println("Рядок s:");
        String s = scanner.nextLine();

        System.out.println("Рядок t:");
        String t = scanner.nextLine();

        StringProcessor processor = new StringProcessor(in, s, t);
        System.out.println("Початковий: " + processor.getOriginal());
        System.out.println("Після обробки: " + processor.processString());

        scanner.close();
    }
}