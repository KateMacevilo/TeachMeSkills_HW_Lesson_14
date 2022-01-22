package com.teachMeSkills.lesson_14.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> listEl = ArrayElement.randomIntsGenerator();
        System.out.println(listEl);

        List<Integer> distinctList = listEl.stream()
                .distinct()
                .filter(n -> (n % 2 == 0) && n >= 7 && n <= 17)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("List without duplicates, between 7 - 17, multiplied by 2: " + distinctList);

        long countElements = listEl.stream()
                .count();
        System.out.println("Count of elements " + countElements);

        double sum = listEl.stream()
                .mapToInt(Integer::intValue)
                .sum() / (double) listEl.size();
        System.out.println("arithmetic average = " + sum);

    }


}
