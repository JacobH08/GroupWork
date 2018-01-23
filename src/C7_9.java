import java.util.Scanner;

public class C7_9 {

    public static void main(String[] args) {
        double x[] = new double[10];
        System.out.print("Enter 10 numbers: ");
        System.out.println("The minimum number is " + min(x));
    }

    public static double min(double[] array) {
        double whateveryouwant = 0;

        Scanner input = new Scanner(System.in);
        double x[] = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
            if (whateveryouwant > x[i]) {
                whateveryouwant = x[i];
            }
        }
        return x[0];
    }
}
