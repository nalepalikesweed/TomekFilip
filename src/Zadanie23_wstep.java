import java.util.Scanner;
public class Zadanie23_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj długość rzędu: ");
        double r = keyboard.nextDouble();
        System.out.print("Podaj miejsce zajmowane przez okratowanie: ");
        double e = keyboard.nextDouble();
        System.out.print("Podaj odległość między sadzonkami: ");
        double s = keyboard.nextDouble();
        int v = (int)((r - 2 * e) / s);
        System.out.print("Liczba sadzonek w rzędzie: " + v);
    }
}