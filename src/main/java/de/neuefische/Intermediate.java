package de.neuefische;

public class Intermediate {
    static String[] array = new String[]{"Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Acht","Neun","Zehn"};

    public static void main(String[] args) {

    }

    public static String giveBackNumValue(int num) {
        return array[num-1];
    }
}
