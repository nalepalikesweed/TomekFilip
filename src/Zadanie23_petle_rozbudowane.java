import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie23_petle_rozbudowane {
    public static String htmlColor(String color) {
        switch (color) {
            case "bialy" -> color = "white";
            case "czerwony" -> color = "red";
            case "pomaranczowy" -> color = "orange";
            case "zolty" -> color = "yellow";
            case "zielony" -> color = "green";
            case "niebieski" -> color = "blue";
            case "fioletowy" -> color = "purple";
            case "czarny" -> color = "black";
        }
        return color;
    }
    public static String htmlAlignment(String alignment) {
        switch (alignment) {
            case "lewo" -> alignment = "left";
            case "srodek" -> alignment = "center";
            case "prawo" -> alignment = "right";
            case "wyjustowany" -> alignment = "justify";
        }
        return alignment;
    }
    public static String htmlStyle(String style) {
        switch (style) {
            case "zwykly" -> style = "";
            case "pogrubiony" -> style = "font-weight: bold;";
            case "kursywa" -> style = "font-style: italic;";
            case "pogrubiony kursywa", "kursywa pogrubiony" -> style = "font-weight: bold; font-style: italic;";
        }
        return style;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] colors = {"bialy", "czerwony", "pomaranczowy", "zolty", "zielony", "niebieski", "fioletowy", "czarny"};
        String[] alignments = {"lewo", "srodek", "prawo", "wyjustowany"};
        String[] styles = {"zwykly", "pogrubiony", "kursywa", "pogrubiony kursywa", "kursywa pogrubiony"};
        String fileName;
        do {
            System.out.print("Nazwa pliku: ");
            fileName = keyboard.nextLine();
        } while (fileName.equals("index"));
        System.out.print("Twoje imię: ");
        String name = keyboard.nextLine();
        System.out.print("Twój opis: ");
        String description = keyboard.nextLine();
        System.out.println("Jakiego koloru ma być tło twojej strony?");
        System.out.println("Dostępne kolory: bialy, czerwony, pomaranczowy, zolty, zielony, niebieski, fioletowy, czarny");
        String backgroundColor = keyboard.nextLine();
        while (Arrays.stream(colors).noneMatch(backgroundColor::equals)) {
            System.out.println("Nieprawidłowy kolor!");
            backgroundColor = keyboard.nextLine();
        }
        backgroundColor = htmlColor(backgroundColor);
        System.out.println("Jakiego koloru ma być czcionka?");
        System.out.println("Dostępne kolory: bialy, czerwony, pomaranczowy, zolty, zielony, niebieski, fioletowy, czarny");
        String fontColor = keyboard.nextLine();
        while (Arrays.stream(colors).noneMatch(fontColor::equals)) {
            System.out.println("Nieprawidłowy kolor!");
            fontColor = keyboard.nextLine();
        }
        fontColor = htmlColor(fontColor);
        System.out.print("Wielkość czcionki w pikselach (domyślna to 16): ");
        int fontSize = keyboard.nextInt();
        while (fontSize < 1) {
            System.out.println("Nieprawidłowa wielkość czcionki!");
            System.out.print("Wielkość czcionki w pikselach (domyślna to 16): ");
            fontSize = keyboard.nextInt();
        }
        String textAlignment;
        keyboard.nextLine();
        do {
            System.out.println("Jak ma być wyrównany tekst na twojej stronie?");
            System.out.println("Dostępne opcje: lewo, srodek, prawo, wyjustowany");
            textAlignment = keyboard.nextLine();
        } while (Arrays.stream(alignments).noneMatch(textAlignment::equals));
        textAlignment = htmlAlignment(textAlignment);
        System.out.println("Jak ma być ostylowany tekst nagłówka twojej strony?");
        System.out.println("Dostępne opcje (ostatnie dwa można łączyć, oddzielając spacją): zwykly, pogrubiony, kursywa");
        String headerFontStyle = keyboard.nextLine();
        while (Arrays.stream(styles).noneMatch(headerFontStyle::equals)) {
            System.out.println("Nieprawidłowa opcja!");
            headerFontStyle = keyboard.nextLine();
        }
        headerFontStyle = htmlStyle(headerFontStyle);
        System.out.println("Jak ma być ostylowany tekst głównej części strony?");
        System.out.println("Dostępne opcje (ostatnie dwa można łączyć, oddzielając spacją): zwykly, pogrubiony, kursywa");
        String mainFontStyle = keyboard.nextLine();
        while (Arrays.stream(styles).noneMatch(mainFontStyle::equals)) {
            System.out.println("Nieprawidłowa opcja!");
            mainFontStyle = keyboard.nextLine();
        }
        mainFontStyle = htmlStyle(mainFontStyle);
        try {
            FileWriter writer = new FileWriter(fileName + ".html");
            File indexFile = new File("index.html");
            Scanner reader = new Scanner(indexFile);
            StringBuilder htmlData = new StringBuilder();
            while (reader.hasNextLine()) htmlData.append(reader.nextLine());
            String htmlString = htmlData.toString();
            htmlString = htmlString.replace("$backgroundColor", backgroundColor);
            htmlString = htmlString.replace("$fontColor", fontColor);
            htmlString = htmlString.replace("$fontSize", Integer.toString(fontSize));
            htmlString = htmlString.replace("$textAlignment", textAlignment);
            htmlString = htmlString.replace("$headerFontStyle", headerFontStyle);
            htmlString = htmlString.replace("$mainFontStyle", mainFontStyle);
            htmlString = htmlString.replace("$name", name);
            htmlString = htmlString.replace("$description", description);
            writer.write(htmlString);
            writer.close();
            System.out.println("Pomyślnie utworzono plik " + fileName + ".html!");
        } catch (IOException e) {
            System.out.println("Nie udało się utworzyć pliku.");
        }
    }
}