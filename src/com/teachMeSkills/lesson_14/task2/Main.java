package com.teachMeSkills.lesson_14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * - Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
 */
public class Main {

    public static void main(String[] args) {

        List<String> listStud = generateArray();

        System.out.println(listStud);

        long countName = listStud.stream()
                .filter(n -> n.equalsIgnoreCase("katerina"))
                .count();

        System.out.println(countName);

        List<String> filterName = listStud.stream()
                .filter(n -> n.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filterName);

        //List<String> nullList = new ArrayList<>(); //для тестов с NULL
        //Optional<String> filterName2 = nullList.stream()

        Optional<String> filterName2 = listStud.stream()
                .map(String::toUpperCase)
                .sorted()
                .findFirst();

        System.out.println(filterName2);

    }


    static ArrayList<String> generateArray() {

        ArrayList<String> arrayStr = new ArrayList<>();

        arrayStr.add("Katerina");
        arrayStr.add("andrian");
        arrayStr.add("Vladimir");
        arrayStr.add("Ivan");
        arrayStr.add("Maksim");
        arrayStr.add("Jana");
        arrayStr.add("Daniil");
        arrayStr.add("Arkadiy");

        return arrayStr;
    }
}
