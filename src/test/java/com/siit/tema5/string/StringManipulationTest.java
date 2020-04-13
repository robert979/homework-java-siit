package com.siit.tema5.string;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)

public class StringManipulationTest {

    private StringManipulationToBeTested sut; //= new StringManipulationToBeTested();

    @Before
    public void setup() {
        sut = new StringManipulationToBeTested();
    }

    @Test
    public void return_something() {
        //Given
        String input = "azi este";

        //When
        String retunredString = sut.reverseWordsOrder(input);
        System.out.println("test " + retunredString);

        //Then
        assertThat(retunredString).isEqualTo("este azi");
        System.out.println(retunredString);


    }
    @Test
    public void return_null(){
        //given
        String input="";

        //When
        String returnedString = sut.reverseWordsOrder(input);

        //Then
        assertThat(returnedString).isEqualTo("");

    }
    @Test
    public void return_break (){
        //Given
        String input = " ";

        //When
        String reurnedString = sut.reverseWordsOrder(input);


        //Then
        assertThat(reurnedString).isEqualTo(" ");
    }


}