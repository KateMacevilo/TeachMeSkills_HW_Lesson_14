package com.teachMeSkills.lesson_14.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayElement {

    public static List<Integer> randomIntsGenerator() {
        return new Random()
                .ints(16, 1, 20)
                .boxed()
                .collect(Collectors.toList());
    }

}
