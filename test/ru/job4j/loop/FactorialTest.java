package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.ChessBoard;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int num = Factorial.calc(5);
        assertThat(num, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int num = Factorial.calc(0);
        assertThat(num, is(1));
    }
}