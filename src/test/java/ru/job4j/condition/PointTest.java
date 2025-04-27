package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints00And50Then5() {
        int x1 = 0, y1 = 0, x2 = 5, y2 = 0;
        double expected = 5.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus10And1And10Then20Dot09() {
        int x1 = -1, y1 = -10, x2 = 1, y2 = 10;
        double expected = 20.09;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus21Minus22And24And28Then67Dot26() {
        int x1 = -21, y1 = -22, x2 = 24, y2 = 28;
        double expected = 67.26;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}