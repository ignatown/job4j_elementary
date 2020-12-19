package ru.job4j.condition;

public class Max {

    public static int max(int one, int two, int three) {
        return max(max(one, two), three);
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }

    public static int max(int one, int two) {
        int result = one >= two ? one : two;
        return result;
    }
}