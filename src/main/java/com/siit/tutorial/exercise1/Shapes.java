package com.siit.tutorial.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection of functions which should be filled out to make tests pass.
 * <p>
 * Each method should use a single call to shapes.forEach.
 */

public class Shapes {
    public static final List<Shape> shapeList = new ArrayList<>();
    public static final StringBuilder stringBuilder = new StringBuilder();

    static {
        Shape shape1 = new Shape(Color.RED);
        Shape shape2 = new Shape(Color.BLUE);
        Shape shape3 = new Shape(Color.GREEN);
        Shape shape4 = new Shape(Color.YELLOW);
        Shape shape5 = new Shape(Color.BLACK);

        shapeList.add(shape1);
        shapeList.add(shape2);
        shapeList.add(shape3);
        shapeList.add(shape4);
        shapeList.add(shape5);


    }

    public static void main(String[] args) {

        /*colorAll(shapeList, Color.RED);
        for (Shape s : shapeList) {
            System.out.println(shapeList);
        }

         */
        makeStringOfAllColors(shapeList, stringBuilder);
        System.out.println(stringBuilder.toString());

    }

    /**
     * Changes the color of all the given <code>shapes</code>, setting to <code>newColor</code>.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list and the color RED
     *   then the list will contain [RED shape, RED shape, RED shape]
     *
     * @param shapes - shapes to color in 
     * @param newColor - the new color
     *
     * @see Shape#setColor(Color)
     */
    public static void colorAll(List<Shape> shapes, Color newColor) {
        shapes.forEach(shape -> shape.setColor(newColor));
        // [your code here]
    }

    /**
     * Creates a String representation of all the given <code>shapes</code>, appending to the given
     * <code>stringBuilder</code>.
     *
     * Uses Shape#toString to create the String representation of each shape.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list and an empty StringBuilder
     *   then the StringBuilder's toString method will return "[a BLUE shape][a GREEN shape][a BLACK shape]"
     *
     * @param shapes - shapes to work over
     * @param stringBuilder - string builder to append to
     *
     * @see Shape#toString()
     */
    public static void makeStringOfAllColors(List<Shape> shapes, StringBuilder stringBuilder) {
        shapes.forEach(shape -> stringBuilder.append(shape.toString()));
        // [your code here]
    }

    /**
     * Changes the color of each given shape to newColor, appending a String representation of the color of all the
     * shapes, as they were before they were changed.
     *
     * Example:
     *   given a list containing [BLUE shape, GREEN shape, BLACK shape]
     *   when this method is called with that list, the color RED, and an empty StringBuilder
     *   then the list will contain [RED shape, RED shape, RED shape]
     *     and the StringBuilder's toString method will return "[a BLUE shape][a GREEN shape][a BLACK shape]"
     *
     * This operation is performed in one pass over the <code>shapes</code> List. Note that syntactically a 
     * lambda is similar to an ordinary Java code block. Therefore multiple statements separated by ; are 
     * perfectly legal e.g. {@code (x -> { x.doSomething(); y.doSomethingElse(); }); }
     *
     * @param shapes - shapes to change color of 
     * @param newColor - new color
     * @param stringBuilder - string builder to append to
     *
     * @see Shape#setColor(Color)
     * @see Shape#toString()
     */
    public static void changeColorAndMakeStringOfOldColors(List<Shape> shapes, Color newColor, StringBuilder stringBuilder) {
        makeStringOfAllColors(shapes, stringBuilder);
        colorAll(shapes, newColor);
        // [your code here]
    }
}
