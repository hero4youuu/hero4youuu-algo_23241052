import java.util.Scanner;

public class HitungJumlahSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms of series: ");
        int n = scan.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / i;
            sum += term;
            System.out.println("Number " + i + " " + term);
        }
        System.out.print("\nSum: " + sum);
    }
}