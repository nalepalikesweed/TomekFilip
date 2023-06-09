import java.util.Scanner;
public class Zadanie21_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj kwotę zdeponowana na koncie: ");
        double p = keyboard.nextDouble();
        System.out.print("Podaj roczną stopę oprocentowania: ");
        double r = keyboard.nextDouble();
        System.out.print("Podaj, ile razy w roku odsetki są kapitalizowane: ");
        int n = keyboard.nextInt();
        System.out.print("Podaj liczbę lat: ");
        int t = keyboard.nextInt();
        double a = p * Math.pow(1 + r / n, n * t);
        System.out.println("Kwota końcowa: " + a);
    }
}
