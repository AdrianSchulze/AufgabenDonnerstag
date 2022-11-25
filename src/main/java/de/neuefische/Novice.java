package de.neuefische;
import java.util.Scanner;

public class Novice {
    public static void main(String[] args) {
        System.out.println("Adrian");
        for(int i=0;i<5;i++) {
            System.out.println("Adrian");
        }

        System.out.println("Hallo " + giveBackName() + "!");
    }

    public static boolean checkNumberGreaterThan0(int num) {
        return num > 0;
    }

    public static int addPotency(int num) {
        return num * num;
    }

    public static String giveBackName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        String input = scanner.nextLine();
        return input;
    }
}