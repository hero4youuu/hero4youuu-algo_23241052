import java.util.Scanner;
class volume_bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menghitung Volume Bola
        double phi = 3.14;

        System.out.println(" Masukan jari-jari:");
        double jariJari = scanner.nextDouble();
        double volume = 4/3*phi*jariJari*jariJari*jariJari;
        System.out.println(volume + "volume adalah: ");

        scanner.close();
    }
}