package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenFirstMaxFromTwoNumbers() {
        int first = 10;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSecondtMaxFromTwoNumbers() {
        int first  = 10;
        int second = 15;
        int result = Max.max(first, second);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstMaxFromThreeNumbers() {
        int first = 10;
        int second = 5;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThirdMaxFromThreeNumbers() {
        int first = 10;
        int second = 5;
        int third = 20;
        int result = Max.max(first, second, third);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstMaxFromFourNumbers() {
        int first = 15;
        int second = 5;
        int third = 2;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFourthMaxFromFourNumbers() {
        int first = 15;
        int second = 5;
        int third = 2;
        int fourth = 70;
        int result = Max.max(first, second, third, fourth);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }
}