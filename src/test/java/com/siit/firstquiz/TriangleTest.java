package com.siit.firstquiz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)

public class TriangleTest {

    private Triangle sut; //= new StringManipulationToBeTested();

    @Before
    public void setup() {
        sut = new Triangle();
    }

    @Test
    public void check_if_only_valid_triangle() {
        //Given
        long side1 = 10;
        long side2 = 20;
        long side3 = 30;

        //When
        double area = sut.calculateArea(side1, side2, side3);
        //System.out.println("For given 10 should be TRUE --> " +ShapePerimeterArea.checkIfDigits(input));
        //System.out.println("test " + retunredString);

        //Then
        assertThat(area).isEqualTo(0);
        //System.out.println(retunredString);


    }

    @Test
    public void check_if_sides_3_4_5() {
        //given
        long side1 = 3;
        long side2 = 4;
        long side3 = 5;

        //When
        double area = sut.calculateArea(side1, side2, side3);
        System.out.println("For given sides 3,4 and 5 mm the arrea = 6  --> " + sut.calculateArea(side1, side2, side3));

        //Then
        assertThat(area).isEqualTo(6);

    }


}