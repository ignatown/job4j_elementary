package ru.job4j.converter;

class Converter {

    static float euroToRuble(float value) {
        float rsl = 70 * value;
        return rsl;
    }

    static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    static float dollarToRuble(float value) {
        float rsl = 60 * value;
        return rsl;
    }

    static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    static void showEuroToRuble(float value) {
        float rsl = 70 * value;
        System.out.println(value + " euro are " + rsl + " rubles.");
    }

    static void showRubleToEuro(float value) {
        float rsl = value / 70;
        System.out.println(value + " ruble are " + rsl + " euros.");
    }

    static void showDollarToRuble(float value) {
        float rsl = 60 * value;
        System.out.println(value + " dollar are " + rsl + " rubles.");
    }

    static void showRubleToDollar(float value) {
        float rsl = value / 60;
        System.out.println(value + " ruble are " + rsl + " dollars.");
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        showRubleToDollar(180);
        showRubleToEuro(140);
        showEuroToRuble(140);
        showDollarToRuble(140);

    }
}