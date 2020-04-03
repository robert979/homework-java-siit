package com.siit.tema5.string;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)

public class StringManipulationTest {

    private StringManipulationToBeTested sut;

    @Test
    public void return_something() {
        //Given
        String input = "azi este";

        //When
        String retunredString = sut.reverseWordsOrder(input);

        //Then
        assertThat(retunredString).isEqualTo("este azi");
        System.out.println(retunredString);


    }


}