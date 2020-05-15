package com.siit.tutorial;

import com.siit.tutorial.exercise1.Color;
import com.siit.tutorial.exercise1.Shape;
import com.siit.tutorial.exercise1.Shapes;
import com.siit.tutorial.util.FeatureMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.siit.tutorial.exercise1.Color.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//import com.ibm.streams.tutorial.util.FeatureMatchers;

public class Exercise_1_Test {
    private static Matcher<Shape> hasColor(Color color) {
        return FeatureMatchers.from(Matchers.is(color), "has color", "color", Shape::getColor);
    }

    @Test
    public void changeColorOfAllShapes() {
        List<Shape> myshapes = Arrays.asList(new Shape(Color.BLACK), new Shape(Color.BLACK), new Shape(Color.YELLOW));

        Shapes.colorAll(myshapes, Color.RED);
        //org.assertj.core.api.Assertions
        assertThat(myshapes, hasSize(3));
        assertThat(myshapes, everyItem(hasColor(RED)));

    }

    @Test
    public void buildStringRepresentingAllShapes() {
        List<Shape> allMyShapes = Arrays.asList(new Shape(RED), new Shape(BLACK), new Shape(YELLOW));
        StringBuilder builder = new StringBuilder();

        // method under test
        Shapes.makeStringOfAllColors(allMyShapes, builder);

        assertThat(builder.toString(), equalTo("[a RED shape][a BLACK shape][a YELLOW shape]"));
    }

    @Test
    public void changeColorOfAllShapes_AND_buildStringShowingAllTheOldColors() {
        List<Shape> myShapes = Arrays.asList(new Shape(BLUE), new Shape(BLACK), new Shape(YELLOW));
        StringBuilder builder = new StringBuilder();

        Shapes.changeColorAndMakeStringOfOldColors(myShapes, RED, builder);

        assertThat(myShapes, hasSize(3));
        assertThat(myShapes, everyItem(hasColor(RED)));
        assertThat(builder.toString(), equalTo("[a BLUE shape][a BLACK shape][a YELLOW shape]"));
    }
}
