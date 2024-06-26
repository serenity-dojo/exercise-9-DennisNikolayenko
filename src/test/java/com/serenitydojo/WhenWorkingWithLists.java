package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with ArrayLists
 */

// When working with Lists in Java
public class WhenWorkingWithLists {

    // We can create a list containing a specified list of values
    @Test
    public void creatingAListOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");
        //colors = Arrays.asList("red","green","blue");

        assertThat(colors).containsExactly("red", "green", "blue");
    }

    // We can add a value an empty list
    @Test
    public void addingAValueToAnEmptyList() {
        List<String> colors = new ArrayList<>();
        //colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");

        assertThat(colors).containsExactly("red", "green");
    }

    // We can add a value to the end an existing list
    @Test
    public void addingAValueToTheEndList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.add("yellow");

        assertThat(colors).containsExactly("red", "green", "blue", "yellow");
    }

    // We can add a value to the start an existing list
    @Test
    public void addingAValueToTheStartOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.add(0, "yellow");

        assertThat(colors).containsExactly("yellow", "red", "green", "blue");
    }

    // We can delete a value from an existing list
    @Test
    public void deletingAValueInAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.remove("green");

        assertThat(colors).containsExactly( "red", "blue");
    }

    // We can find the number of elements in a list
    @Test
    public void findingTheLengthOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.remove(1); //this line should be here before numberOfElements variable. If colors.remove is after the line with numberOfElements variable it will not change the int of elements.
        int numberOfElements = colors.size();

        System.out.println(colors);
        assertThat(numberOfElements).isEqualTo(2);
    }
}
