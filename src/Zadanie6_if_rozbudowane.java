import java.util.Scanner;
public class Zadanie6_if_rozbudowane {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day, month, year;
        do {
            System.out.print("Podaj rok: ");
            year = keyboard.nextInt();
        } while(year > 0 && year < 10000);
        do {
            System.out.print("Podaj miesiąc: ");
            month = keyboard.nextInt();
        } while(month > 0 && month < 13);
        System.out.print("Podaj dzień: ");
        
    }
}
