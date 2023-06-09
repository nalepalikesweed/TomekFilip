import java.util.Scanner;
public class Zadanie17_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj cenę posiłku: ");
        double price = keyboard.nextDouble();
        double tax = 0.0675 * price;
        double tip = 0.2 * (price + tax);
        double total = price + tax + tip;
        System.out.print("Cena posiłku: " + price + ", wartość podatku: " + tax +
                ", wysokość napiwku: " + tip + ", łączna kwota: " + total);
    }
}
