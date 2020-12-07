package ru.job4j.converter;

public class Converter {

    public static int euroToRuble(int value) {
        int rsl = 70 * value;
        return rsl;
    }

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = 60 * value;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    static void showEuroToRuble(int value) {
        int rsl = 70 * value;
        System.out.println(value + " euro are " + rsl + " rubles.");
    }

    static void showRubleToEuro(int value) {
        int rsl = value / 70;
        System.out.println(value + " ruble are " + rsl + " euros.");
    }

    static void showDollarToRuble(int value) {
        int rsl = 60 * value;
        System.out.println(value + " dollar are " + rsl + " rubles.");
    }

    static void showRubleToDollar(int value) {
        int rsl = value / 60;
        System.out.println(value + " ruble are " + rsl + " dollars.");
    }

    public static void main(String[] args) {
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;

        System.out.println("140 rubles are 2. Test result : " + passed);

    }
}