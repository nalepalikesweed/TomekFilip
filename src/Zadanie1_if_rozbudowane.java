import java.util.Scanner;
public class Zadanie1_if_rozbudowane {
    public static void toRoman(int number) {
        String roman = "";
        while (number > 0) {
            if (number >= 1000) {
                roman += "M";
                number -= 1000;
            } else if (number >= 900) {
                roman += "CM";
                number -= 900;
            } else if (number >= 500) {
                roman += "D";
                number -= 500;
            } else if (number >= 400) {
                roman += "CD";
                number -= 400;
            } else if (number >= 100) {
                roman += "C";
                number -= 100;
            } else if (number >= 90) {
                roman += "XC";
                number -= 90;
            } else if (number >= 50) {
                roman += "L";
                number -= 50;
            } else if (number >= 40) {
                roman += "XL";
                number -= 40;
            } else if (number >= 10) {
                roman += "X";
                number -= 10;
            } else if (number == 9) {
                roman += "IX";
                number -= 9;
            } else if (number >= 5) {
                roman += "V";
                number -= 5;
            } else if (number == 4) {
                roman += "IV";
                number -= 4;
            } else if (number < 4) {
                roman += "I";
                number -= 1;
            }
        }
        System.out.println("Liczba w zapisie rzymskim: " + roman);
    }
    public static void toDecimal(String roman) {
        int number = 0;
        for(int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            switch(c) {
                case 'I':
                    if(i != roman.length() - 1) {
                        if(roman.charAt(i + 1) == 'V') {
                            number += 4;
                            i++;
                        } else if(roman.charAt(i + 1) == 'X') {
                            number += 9;
                            i++;
                        } else number++;
                    } else number++;
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    if(i != roman.length() - 1) {
                        if(roman.charAt(i + 1) == 'L') {
                            number += 40;
                            i++;
                        } else if(roman.charAt(i + 1) == 'C') {
                            number += 90;
                            i++;
                        } else number += 10;
                    } else number += 10;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    if(i != roman.length() - 1) {
                        if(roman.charAt(i + 1) == 'D') {
                            number += 400;
                            i++;
                        } else if(roman.charAt(i + 1) == 'M') {
                            number += 900;
                            i++;
                        } else number += 100;
                    } else number += 100;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
        }
        System.out.print("Liczba w zapisie arabskim: " + number);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String roman = "", select = "";
        boolean isWrong = false;
        int number = 0;
        while(true) {
            System.out.print("Jeśli chcesz dokonać z liczby arabskiej na rzymską, napisz '1'," +
                    " a jeśli na odwrót, napisz '2': ");
            select = keyboard.nextLine();
            switch(select) {
                case "1":
                    System.out.print("Wpisz liczbę od 1 do 3999: ");
                    number = keyboard.nextInt();
                    while (number < 1 || number > 3999) {
                        System.out.println("Niepoprawna liczba!");
                        System.out.print("Wpisz liczbę od 1 do 3999: ");
                        number = keyboard.nextInt();
                    }
                    toRoman(number);
                    break;
                case "2":
                    System.out.print("Wpisz liczbę rzymską od 1 do 3999 (wielkimi literami): ");
                    roman = keyboard.nextLine();
                    for(int i = 0; i < roman.length(); i++) {
                        char c = roman.charAt(i);
                        if(c != 'I' && c != 'V' && c != 'X' && c != 'L' && c != 'C' && c != 'D' && c != 'M') {
                            isWrong = true;
                        }
                    }
                    while(isWrong) {
                        System.out.println("Niepoprawna liczba!");
                        System.out.print("Wpisz liczbę rzymską od 1 do 3999 (wielkimi literami): ");
                        roman = keyboard.nextLine();
                        isWrong = false;
                        for(int i = 0; i < roman.length(); i++) {
                            char c = roman.charAt(i);
                            if(c != 'I' && c != 'V' && c != 'X' && c != 'L' && c != 'C' && c != 'D' && c != 'M') {
                                isWrong = true;
                            }
                        }
                    }
                    toDecimal(roman);
                    break;
                default:
                    System.out.println("Niepoprawny wybór!");
            }
            keyboard.nextLine();
        }
    }
}