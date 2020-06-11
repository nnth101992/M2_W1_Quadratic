import java.util.Scanner;

public class QuadraticMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(a, b, c);
        System.out.print(quadratic.getRoots());
    }
}
