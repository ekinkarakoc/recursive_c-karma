import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        recursiveIslem(n);
    }

    public static void recursiveIslem(int n) {
        if (n <= 0) {
            System.out.println("Son değer: " + n);
            recursiveEkle(n);
        } else {
            System.out.println("Son değer: " + n);
            recursiveIslem(n - 5);
        }
    }

    public static void recursiveEkle(int n) {
        if (n >= 0) {
            System.out.println("Son değer: " + n);
            recursiveEkle(n + 5);
        } else {
            System.out.println("Son değer: " + n);
        }
    }
}
