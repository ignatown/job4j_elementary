package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance0020() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double result = first.distance(second);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distancem1m111() {
        Point first = new Point(-1, -1);
        Point second = new Point(1, 1);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance1133() {
        Point first = new Point(1, 1);
        Point second = new Point(3, 3);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance3d() {
        Assert.assertEquals(1.732051, (new Point(0, 0, 0)).distance3d(new Point(1, 1, 1)), 0.01);
        Assert.assertEquals(5.477226, (new Point(2, 3, 4)).distance3d(new Point(-3, 2, 6)), 0.01);
        Assert.assertEquals(0, (new Point(0, 0, 0)).distance3d(new Point(0, 0, 0)), 0.01);
    }

}