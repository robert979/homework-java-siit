package com.siit.tema10;

import org.junit.Test;

import static com.siit.tema10.Pairs.checkPairsNumbers;
import static com.siit.tema10.Pairs.checkSocksPairs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class PairsTest {
    static int[] socksUnpaired = {1, 2, 3, 1, 3, 1, 2, 2, 2, 3};
    static int[] emptyArray = {};
    static int[] noPair = {0, 1, 3, 4, 5, 7};

    @Test
    public void checkSocksPairsByArray() {

        assertThat(Pairs.checkPairsNumbers(emptyArray), equalTo(Integer.valueOf(0)));
        assertThat(Pairs.checkPairsNumbers(socksUnpaired), equalTo(Integer.valueOf(4)));
        assertThat(checkPairsNumbers(noPair), equalTo(Integer.valueOf(0)));
    }

    @Test
    public void checkSocksPairsByStream() {
        assertThat(checkSocksPairs(socksUnpaired), equalTo(Integer.valueOf(4)));
        assertThat(checkSocksPairs(emptyArray), equalTo(Integer.valueOf(0)));
    }


}
