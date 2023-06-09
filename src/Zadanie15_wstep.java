import java.util.Scanner;
public class Zadanie15_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj cenę detaliczną płytki: ");
        double retailprice = keyboard.nextDouble();
        double profit = retailprice * 0.4;
        System.out.print("Zysk ze sprzedazy: " + profit);
    }
}
