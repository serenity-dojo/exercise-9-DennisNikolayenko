package com.serenitydojo;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with Sets
 */

public class WhenWorkingWithSets {

    // We can create a set and add values to the set
    @Test
    public void creatingANewSet() {
        Set<String> colors = new HashSet<>();

        //colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
    }

    // We can create a set containing a specified list of values")
    @Test
    public void creatingASetOfValues() {
        Set<String> colors = Set.of("red","green","blue");

        assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
    }

    // A Set cannot contain duplicates")
    @Test
    public void addAValueTwice() {
        Set<String> colors = new HashSet<>(Set.of("red", "green", "blue")); // Do we need to add a value here as well?

        colors.add("red");
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        int expectedSize = 4;

        assertThat(colors.size()).isEqualTo(expectedSize);
    }

    // We can check whether a set is empty")
    @Test
    public void canCheckIfEmpty() {
        Set<String> colors = new HashSet<>();
        Boolean startedEmpty = colors.isEmpty();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Boolean endedUpEmpty = colors.isEmpty();

        assertThat(startedEmpty).isTrue();
        assertThat(endedUpEmpty).isFalse();
    }

}
