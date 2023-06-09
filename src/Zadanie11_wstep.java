import java.util.Scanner;
public class Zadanie11_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wprowadź wartość kupowanego produktu: ");
        double value = keyboard.nextDouble();
        double statetax = 0.04 * value;
        double localtax = 0.02 * value;
        double price = value + localtax + statetax;
        System.out.print("Wartość produktu: " + value + ", podatek stanowy: " + statetax +
                ", podatek lokalny: " + localtax + ", łączna cena sprzedaży: " + price);
    }
}
