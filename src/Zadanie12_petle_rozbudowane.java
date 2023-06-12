import java.util.Arrays;
import java.util.Scanner;

public class Zadanie12_petle_rozbudowane {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj liczbę słupków (od 2 do 99): ");
        int columns = keyboard.nextInt();
        while (columns < 2 || columns > 99) {
            System.out.println("Nieprawidłowa wartość!");
            columns = keyboard.nextInt();
        }
        int[] values = new int[columns];
        for (int i = 0; i < columns; i++) {
            System.out.print("Wartość " + (i + 1) + ". słupka: ");
            values[i] = keyboard.nextInt();
        }
        int max = Arrays.stream(values).max().getAsInt();
        System.out.print("Podaj skalę (od 1 do " + max + "): ");
        int scale = keyboard.nextInt();
        while (scale < 1 || scale > max) {
            System.out.println("Nieprawidłowa wartość!");
            System.out.print("Podaj skalę (od 1 do " + max + "): ");
            scale = keyboard.nextInt();
        }
        int lines = max / scale;
        String maxString = lines * scale + "-" + max + " ";
        int maxLength = maxString.length();
        for (int i = lines; i >= 0; i--) {
            String currString = i * scale + "-" + ((i + 1) * scale - 1) + " ";
            int currLength = currString.length();
            if (i == lines) {
                System.out.print(maxString);
            } else {
                for (int j = 0; j < maxLength - currLength; j++) System.out.print(" ");
                System.out.print(currString);
            }
            for (int value : values) {
                if (value >= i * scale) System.out.print("[I] ");
                else System.out.print("    ");
            }
            System.out.println();
        }
        for (int i = 0; i < maxLength; i++) System.out.print(" ");
        for (int i = 0; i < columns; i++) {
            if (i < 9) System.out.print(" " + (i + 1) + "  ");
            else System.out.print((i + 1) + "  ");
        }
        System.out.print("\nJeśli chcesz obliczyć średnią ruchomą, podaj okres (od 2 do " + columns + "): ");
        int period = keyboard.nextInt();
        while (period < 2 || period > columns) {
            System.out.println("Nieprawidłowa wartość!");
            System.out.print("\nJeśli chcesz obliczyć średnią ruchomą, podaj okres (od 2 do " + columns + "): ");
            period = keyboard.nextInt();
        }
        for (int i = period - 1; i < columns; i++) {
            double sum = 0, avg;
            for (int j = 0; j < period; j++) {
                sum += values[i - j];
            }
            avg = (double) Math.round(sum / period * 100) / 100;
            System.out.println((i + 1) + ". " + avg);
        }
    }
}