package com.siit.firstquiz;


import com.siit.firstquiz.ciorna.ShapeAreaPerimeter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShapeAreaPerimeterTest {
    private ShapeAreaPerimeter sut ;//= new ShapeAreaPerimeter();

    @Before
    public void setup (){
        sut = new ShapeAreaPerimeter();
    }
    @Test
    public void returnSqaureArea (){
        String sideSquare = "10";
    }

}
