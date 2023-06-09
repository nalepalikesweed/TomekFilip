import java.util.Scanner;
public class Zadanie14_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj wynik z 1. testu: ");
        double test1 = keyboard.nextDouble();
        System.out.print("Podaj wynik z 2. testu: ");
        double test2 = keyboard.nextDouble();
        System.out.print("Podaj wynik z 3. testu: ");
        double test3 = keyboard.nextDouble();
        double average = (test1 + test2 + test3) / 3;
        System.out.print("Wynik z 1. testu: " + test1 + ", wynik z 2. testu: " + test2 +
                ", wynik z 3. testu: " + test3 + ", średnia: " + average);
    }
}
