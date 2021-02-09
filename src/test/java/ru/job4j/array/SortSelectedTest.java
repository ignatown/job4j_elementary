package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void when5Sort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when5Sort2() {
        int[] input = new int[] {7, 2, 0, 1, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 4, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void when3Sort2() {
        int[] input = new int[] {10, 30, 20};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 20, 30};
        assertThat(result, is(expect));
    }
}