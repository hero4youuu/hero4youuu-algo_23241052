import java.util.Scanner;
 class  ganjilgenap {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Masukan Sebuah Bilangan:");
        int bilangan = scanner.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }

        scanner.close();
    }
}