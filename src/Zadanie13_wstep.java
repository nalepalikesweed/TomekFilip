import java.util.Scanner;
public class Zadanie13_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cookies = 40;
        int portion = 10;
        int caloriesperportion = 300;
        int caloriespercookie = caloriesperportion / (cookies / portion);
        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        int eaten = keyboard.nextInt();
        int total = caloriespercookie * eaten;
        System.out.print("Skonsumowałeś " + total + " kalorii");
    }
}
