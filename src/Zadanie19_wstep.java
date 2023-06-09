import java.util.Scanner;
public class Zadanie19_wstep {
    public static void main(String[] args) {
        int n = 12467;
        double survey1 = 0.14 * 12467;
        double survey2 = 0.64 * survey1;
        System.out.print("Liczba osób kupujacych przynajmniej jeden" +
                " napój energetyczny tygodniowo: " + Math.round(survey1) +
                "\nliczba osób preferujących napoje o smaku cytrusowym: " + Math.round(survey2));
    }
}
