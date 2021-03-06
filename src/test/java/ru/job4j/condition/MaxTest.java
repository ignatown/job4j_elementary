package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax0To4Then4() {
        int result = Max.max(0, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax9To9Then9() {
        int result = Max.max(9, 1, -5);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 6, 9,1);
        assertThat(result, is(10));
    }
}
