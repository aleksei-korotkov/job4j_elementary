package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0AndFinish2ThenResult3() {
        int start = 0;
        int finish = 2;
        int expected = 3;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart10AndFinish2ThenResult0() {
        int start = 10;
        int finish = 2;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3AndFinish2ThenResultMinus3() {
        int start = -3;
        int finish = 2;
        int expected = -3;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart10AndFinish10ThenResult10() {
        int start = 10;
        int finish = 10;
        int expected = 10;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}