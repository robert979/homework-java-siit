package com.siit.firstquiz;

import com.siit.tema5.string.StringManipulationToBeTested;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)

public class ShapePerimeterAreaTest {

    private ShapePerimeterArea sut; //= new StringManipulationToBeTested();

    @Before
    public void setup() {
        sut = new ShapePerimeterArea();
    }

    @Test
    public void check_if_only_digits() {
        //Given
        String input = "10";

        //When
       boolean test = ShapePerimeterArea.checkIfDigits(input);
        System.out.println("For given 10 should be TRUE --> " +ShapePerimeterArea.checkIfDigits(input));
        //System.out.println("test " + retunredString);

        //Then
        assertThat(test).isEqualTo(true);
        //System.out.println(retunredString);


    }
    @Test
    public void check_if_only_digits_zero(){
        //given
        String input="0";

        //When
        boolean test  = ShapePerimeterArea.checkIfDigits(input);
        System.out.println("For given 0 should be FALSE --> " +ShapePerimeterArea.checkIfDigits(input));

        //Then
        assertThat(test).isEqualTo(false);

    }
    @Test
    public void check_if_only_digits_space(){
        //Given
        String input = " ";

        //When
        boolean test  = ShapePerimeterArea.checkIfDigits(input);
        System.out.println("For given _ should be FALSE --> " +ShapePerimeterArea.checkIfDigits(input));


        //Then
        assertThat(test).isEqualTo(false);
    }
    @Test
    public void transform_string_in_digits_01000 (){
        //Given
        String str = "01000";

        //When
        Long returnedDigits = ShapePerimeterArea.transformStringIndigits(str);
        System.out.println("Input 01000 should return 1000 -->"+ ShapePerimeterArea.transformStringIndigits(str) );

        //Then
        assertThat(returnedDigits).isEqualTo(1000);

    }


}