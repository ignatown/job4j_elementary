package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan == nik) {return 1;} else {
        while (ivan < nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    } }
}