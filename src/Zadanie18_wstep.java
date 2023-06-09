import java.util.Scanner;
public class Zadanie18_wstep {
    public static void main(String[] args) {
        int stocks = 600;
        double priceperstock = 21.77;
        double stocksprice = stocks * priceperstock;
        double comission = 0.02 * stocksprice;
        double total = stocksprice + comission;
        System.out.print("Kwota zapłacona za akcje: " + stocksprice + ", prowizja: " +
                comission + ", łączna kwota: " + total);
    }
}
