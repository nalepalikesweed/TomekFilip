import java.util.Scanner;
public class Zadanie20_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double sugar = 1.5;
        double butter = 1;
        double flour = 2.75;
        System.out.print("Podaj, ile ciasteczek chcesz upiec: ");
        int cookies = keyboard.nextInt();
        double total_sugar = sugar / 48 * cookies;
        double total_butter = butter / 48 * cookies;
        double total_flour = flour / 48 * cookies;
        System.out.print("Potrzebujesz " + total_sugar + " szklanek cukru, " + total_butter +
                " szklanek masła, " + total_flour + " szklanek mąki");
    }
}
