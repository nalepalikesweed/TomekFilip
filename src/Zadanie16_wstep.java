import java.util.Scanner;
public class Zadanie16_wstep {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj nazwę ulubionego miasta: ");
        String city = keyboard.nextLine();
        int numofchars = city.length();
        String upperCase = city.toUpperCase();
        String lowerCase = city.toLowerCase();
        char firstCharacter = city.charAt(0);
        System.out.print("Liczba znaków: " + numofchars + ", wielkimi literami: " + upperCase +
                ", małymi literami: " + lowerCase + ", pierwszy znak: " + firstCharacter);
    }
}
