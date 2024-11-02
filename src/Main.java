import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите количество тарелок");
        Scanner scan = new Scanner(System.in);
        double tarelki = scan.nextInt();

        System.out.println("введите количество моющего средства");
        Scanner scaner = new Scanner(System.in);
        double milo = scaner.nextInt();

        double pon;
        while (tarelki > 0) {
            if (milo > 0) {
                tarelki--;
                milo = milo - 0.5;
                System.out.println("остлось средства:" + milo);
            }
                else {
                System.out.println("Мыла нет");
                break;
                }
        }
    }
}