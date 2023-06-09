import java.util.Scanner;
public class Zadanie12_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double km = keyboard.nextDouble();
        System.out.print("Podaj liczbę zużytych litrów paliwa: ");
        double liters = keyboard.nextDouble();
        double kmsperliter = km / liters;
        System.out.print("Kilometry na litrze paliwa: " + kmsperliter);
    }
}
