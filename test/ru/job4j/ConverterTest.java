package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void euroToRuble() {
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = ru.job4j.converter.Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = ru.job4j.converter.Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}